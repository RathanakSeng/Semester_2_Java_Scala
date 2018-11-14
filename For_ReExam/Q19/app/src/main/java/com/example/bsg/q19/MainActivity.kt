package com.example.bsg.q19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShow.setOnClickListener()
        {
            var arUser = DataManager(this).read()

            var txt: String = ""

            for (element in arUser)
            {
                txt += "$element\n"
            }
            textView.text = txt
        }
    }
}
