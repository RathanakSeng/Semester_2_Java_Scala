package com.example.bsg.q17

data class Student(var id: Int = 0, var name: String = "", var email:String = "")
{
    override fun toString(): String
    {
        return "$id : $name\n" + "$email"
    }
}