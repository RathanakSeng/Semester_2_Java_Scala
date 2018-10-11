package com.example.bsg.layout_demo

import android.content.Intent
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_1.setImageResource(R.drawable.hap_1)
        image_2.setImageResource(R.drawable.deedee)

        button.setOnClickListener()
        {
            if(frame_1.visibility == View.VISIBLE )
            {
                frame_1.visibility = View.GONE
                frame_2.visibility = View.VISIBLE
            }
            else if (frame_2.visibility == View.VISIBLE)
            {
                frame_2.visibility = View.GONE
                frame_1.visibility = View.VISIBLE
            }
        }

        button2.setOnClickListener()
        {
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }
}
