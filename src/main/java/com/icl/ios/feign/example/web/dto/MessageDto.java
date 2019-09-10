package com.icl.ios.feign.example.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {
    private String phone;
    private String message;
    private MessageStatus messageStatus;
    private String messageStatusInfo;
    
}