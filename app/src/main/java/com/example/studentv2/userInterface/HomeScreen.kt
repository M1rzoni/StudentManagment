package com.example.studentv2.userInterface

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.studentv2.data.Student

@Composable
fun HomeScreen(
    students: List<Student>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier) {
                items(students) {
                    student ->
                    StudentCard(
                        student = student
                    )
                    Spacer(modifier.height(16.dp))
                }
           }
        }

