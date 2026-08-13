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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    students: List<Student>,
    modifier: Modifier = Modifier
){


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Student Manager")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {

                }
            ) {
                Text("+")
            }
        }
    ) { padding ->
        LazyColumn(modifier = modifier.padding(padding)) {
               items(students) {
                   student ->
                    StudentCard(
                        student = student
                    )
                    Spacer(modifier.height(16.dp))
               }
          }
    }



        }

