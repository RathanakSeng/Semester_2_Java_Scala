package com.example.bsg.background_service_demo

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.widget.Toast

class MyService : Service()
{
    private lateinit var mediaPlayer: MediaPlayer

    override fun onBind(intent: Intent): IBinder
    {
        return null!!
    }

    override fun onCreate()
    {
        super.onCreate()
        Toast.makeText(this, "Service created...", Toast.LENGTH_LONG).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int
    {
        super.onStartCommand(intent, flags, startId)

        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI)
        mediaPlayer.isLooping = true
        mediaPlayer.start()
        return START_STICKY
    }

    override fun onDestroy()
    {
        super.onDestroy()
        mediaPlayer.stop()
    }
}
