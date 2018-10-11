package com.example.bsg.databaseconnector

data class Student(var name: String = "", var rollNum: Int = 0)
{
    override fun toString(): String
    {
        return "$rollNum  : $name"
    }
}