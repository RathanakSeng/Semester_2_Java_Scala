package com.example.bsg.q19

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

var T_NAME = "user"
var C_ID = "id"
var C_USER_ID = "user_id"
var C_USER_NAME = "user_name"

class DataManager(context: Context) : SQLiteOpenHelper(context, T_NAME, null, 1)
{
    override fun onCreate(db: SQLiteDatabase?)
    {
        var query = "create table $T_NAME( $C_ID integer primary key autoincrement, $C_USER_ID integer, $C_USER_NAME varchar(256))"
        db?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun read(): ArrayList<User>
    {
        var db = readableDatabase
        var arrayList = ArrayList<User>()
        var cursor = db.rawQuery("select * from user", null)

        cursor.moveToFirst()

        do
        {
            var user = User()
            user.id = cursor.getString(1).toString().toInt()
            user.name = cursor.getString(2)

            arrayList.add(user)
        }while (cursor.moveToNext())

        return arrayList
    }
}