package com.example.studentv2.data

import java.text.DateFormat

data class Student(
    val id: Int,
    val name: String,
    val lastName:String,
    val index: String,
    val year: Int,
    val major: String,
    val dateOfBirth: String
) {
}