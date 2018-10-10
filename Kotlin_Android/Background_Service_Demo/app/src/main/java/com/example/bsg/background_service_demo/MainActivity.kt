package com.example.bsg.background_service_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener()
        {
            startService(Intent(this, MyService::class.java))
            Toast.makeText(this, "Service Start...", Toast.LENGTH_LONG).show()
        }

        stop.setOnClickListener()
        {
            stopService(Intent(this, MyService::class.java))
            Toast.makeText(this, "Service Stop...", Toast.LENGTH_LONG).show()
        }
    }
}
