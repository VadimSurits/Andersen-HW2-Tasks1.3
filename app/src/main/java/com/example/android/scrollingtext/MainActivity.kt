package com.example.android.scrollingtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//Ответы на вопросы из раздела 11 Homework:

//Question 1
//How many views can you use within a ScrollView? Choose one:
//
//Answer: One view or one view group

//Question 2
//Which XML attribute do you use in a LinearLayout to show views side by side? Choose one:
//
//Answer: android:orientation="horizontal"

//Question 3
//Which XML attribute do you use to define the width of the LinearLayout inside the scrolling view? Choose one:
//
//Answer: android:layout_width="wrap_content"