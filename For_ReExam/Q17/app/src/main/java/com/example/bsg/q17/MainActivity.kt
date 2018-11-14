package com.example.bsg.q17

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stArray = arrayListOf<Student>(
                Student(111, "Rathanak", "rathanak@gmail.com"),
                Student(112, "Dara", "dara@gmail.com"),
                Student(113, "Nyratt", "nyratt@gmail.com"),
                Student(114, "Luhen", "luhen@gmail.com"),
                Student(115, "Moonlight", "moonlight@gmail.com"),
                Student(116, "Channy", "channy@gmail.com"),
                Student(117, "Sokmeng", "sokmeng@gmail.com"),
                Student(118, "Sokheng", "sokheng@gmail.com"))
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stArray)
    }
}
