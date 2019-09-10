package com.icl.ios.feign.example.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="SmsClient", url="http://localhost:8081")
public interface SmsClient {

    @GetMapping(value = "/sms/message/send")
    Object sendMessageAndWaitDelivery(
            @RequestParam String phone, @RequestParam String text, @RequestParam(required = false) Long time,
            @RequestParam(required = false, defaultValue = "false") boolean needDeliveryNotification);


}
