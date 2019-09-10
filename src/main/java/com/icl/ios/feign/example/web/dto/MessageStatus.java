package com.icl.ios.feign.example.web.dto;

public enum MessageStatus {
    //Не отправлено (Когда сообщение создалось)
    notSent,
    //Отправляется (Перед вызовом метода по отправке сообщения)
    beingSent,
    //Было отправлено (После получения подтверждения о отправке)
    wasSent,
    //Ожидание доставки (После wasSent и если ожидается доставка)
    waitDelivery,
    //Доставлено (После получения подтверждения о доставке)
    delivered,
    //Ошибка
    error,
    //Отменено
    cancel,
    //Ошибка валидации
    validationError
}
