
package com.example.bsg.listview_demo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListOf("Rathanak", "Dara", "Channy", "Nyratt"))

        listView.adapter = CustomAdapter(this, arrayListOf("Rathanak", "Dara", "Channy", "Nyratt", "Luhen", "Chenny", "Lynan", "Rith", "Hong", "Sopheak"))

        listView.setOnItemClickListener()
        {
            adapterView: AdapterView<*>, view1: View, i: Int, l: Long -> Toast.makeText(this, "This is the element in this list", Toast.LENGTH_LONG).show()
        }

    }
}

class CustomAdapter(context: Context, arrayList: ArrayList<String>) : BaseAdapter()
{
    var myContext = context
    var myList = arrayList

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        var inflate = LayoutInflater.from(myContext)
        var view = inflate.inflate(R.layout.custom_adapter, parent, false)

        var textView = view.findViewById<TextView>(R.id.textView)
        textView.text = myList[position]
        return view
    }

    override fun getItem(position: Int): Any
    {
        return position
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getCount(): Int
    {
        return myList.size
    }
}
