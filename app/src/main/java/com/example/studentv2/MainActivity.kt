package com.example.studentv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.studentv2.data.Student
import com.example.studentv2.ui.theme.StudentV2Theme
import com.example.studentv2.userInterface.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudentV2Theme {

                val students = listOf(
                    Student(
                        id = 1,
                        name = "Mirza",
                        lastName = "Šabanović",
                        index = "OK/12345",
                        year = 4,
                        major = "Informatika I Računarstvo",
                        dateOfBirth = "12.02.2002"

                    ),
                    Student(
                        id = 2,
                        name = "Eldad",
                        lastName = "Zulić",
                        index = "IO/22456",
                        year = 3,
                        major = "Informacione Tehnologije",
                        dateOfBirth = "28.09.2001"
                    )
                )

                HomeScreen(
                    students = students
                )


                }
            }
        }
    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview(
) {
    StudentV2Theme {
            //HomeScreen()
    }
}