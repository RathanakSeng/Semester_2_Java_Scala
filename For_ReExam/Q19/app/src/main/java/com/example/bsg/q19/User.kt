package com.example.bsg.q19

data class User(var id: Int = 0, var name: String = "")
{
    override fun toString(): String
    {
        return "$id : $name"
    }
}