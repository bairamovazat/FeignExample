package com.icl.ios.feign.example.web.config;

import com.icl.ios.feign.example.web.client.SmsClient;
import com.icl.ios.feign.example.web.model.Property;
import com.icl.ios.feign.example.web.repository.PropertyRepository;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    private final PropertyRepository propertyRepository;
    private SmsClient smsClient;

    public ClientConfig(PropertyRepository propertyRepository){
        this.propertyRepository = propertyRepository;
    }

    @Bean
    public SmsClient getSmsClient(){
        Property feignIrlProperty = propertyRepository.findFirstByNameEquals("feign.url").orElseThrow(() -> new IllegalArgumentException("feign.url not found in database"));

        if(this.smsClient == null) {
            this.smsClient = Feign.builder()
                    .contract(new SpringMvcContract())
                    .decoder(new JacksonDecoder())
                    .encoder(new JacksonEncoder())
                    .target(SmsClient.class, feignIrlProperty.getValue());
        }
        return this.smsClient;
    }
}
