package com.icl.ios.feign.example.web.controller;

import com.icl.ios.feign.example.web.client.SmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Autowired
    private SmsClient smsClient;

    @GetMapping(value = "/message/send")
    public Object sendMessageAndWaitDelivery(
            @RequestParam String phone, @RequestParam String text, @RequestParam(required = false) Long time,
            @RequestParam(required = false, defaultValue = "false") boolean needDeliveryNotification) {
        return smsClient.sendMessageAndWaitDelivery(phone, text, time, needDeliveryNotification);
    }
}
