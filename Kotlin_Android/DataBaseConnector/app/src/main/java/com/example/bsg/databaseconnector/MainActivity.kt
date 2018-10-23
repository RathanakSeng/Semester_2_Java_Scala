package com.example.bsg.databaseconnector

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    var obj = DataManger(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInsert.setOnClickListener()
        {
            var rollNum = txtRollNum.text.toString().toInt()
            var name = txtName.text.toString()
//            txtName.setTypeface(Typeface.createFromAsset(assets, "fonts\\myfontStyle.ttf"))

            obj.insert(Student(name, rollNum))
        }

        btnShow.setOnClickListener()
        {
            var arrList = DataManger(this).read()
            var txt: String = ""

            for (element in arrList)
            {
                txt += "$element\n"
            }
            txtView.text = txt
        }
    }
}
