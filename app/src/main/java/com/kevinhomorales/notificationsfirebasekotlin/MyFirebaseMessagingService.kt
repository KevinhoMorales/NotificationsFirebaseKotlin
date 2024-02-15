package com.kevinhomorales.notificationsfirebasekotlin

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Accede a los datos de la notificación
        val title = remoteMessage.notification?.title
        val body = remoteMessage.notification?.body

        // Muestra la notificación o realiza alguna acción
        println("El título es ${title} y  el cuerpo es ${body}")
    }

    override fun onNewToken(token: String) {
        // Maneja la actualización del token aquí
    }
}