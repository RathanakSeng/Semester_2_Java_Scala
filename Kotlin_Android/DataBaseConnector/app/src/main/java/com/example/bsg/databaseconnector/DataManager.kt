package com.example.bsg.databaseconnector

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

var T_NAME = "Student_Information"
var S_ID = "id"
var S_NAME = "name"
var S_ROLLNUM = "roll_num"

class DataManger(context: Context): SQLiteOpenHelper(context, T_NAME, null, 1)
{
    override fun onCreate(db: SQLiteDatabase?)
    {
        var query = "create table $T_NAME ($S_ID integer primary key autoincrement, $S_NAME varchar(256), $S_ROLLNUM integer)"

        db?.execSQL(query)
    }

    override fun onUpgrade(dp: SQLiteDatabase?, oldVersion: Int, newVersion: Int)
    {

    }

    fun insert(student: Student)
    {
        var db = this.writableDatabase
        var obj = ContentValues()

        obj.put(S_NAME, student.name)
        obj.put(S_ROLLNUM, student.rollNum)

        db.insert(T_NAME, null, obj)
    }

    fun read(): ArrayList<Student>
    {
        var myList = ArrayList<Student>()
        var db = this.readableDatabase

        var cursor = db.rawQuery("select * from $T_NAME", null)

        cursor.moveToFirst()

        do
        {
            var student = Student()

            student.name = cursor.getString(1)
            student.rollNum = cursor.getString(2).toInt()

            myList.add(student)

        }while (cursor.moveToNext())

        return myList
    }
}