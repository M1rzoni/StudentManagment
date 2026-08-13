package com.example.studentv2.userInterface

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.studentv2.data.Student

@Composable
fun StudentCard(
    student: Student
){
    Card() {
        Column() {
            Text(
                text = "${student.name} ${student.lastName}"
            )
            Text(
                text = "Index: ${student.index}"
            )
            Text(
                text = "Godina: ${student.year}"
            )
            Text(
                text = "Smijer: ${student.major}"
            )
            Text(
                text = "Datum Rođenja: ${student.dateOfBirth}"
            )
        }
    }

}