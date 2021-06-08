package com.example.mini

data class PushNotification(
    val data: NotificationData,

    //push 알림의 수신자
    val to: String
)