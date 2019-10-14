package com.android.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Activity_Sample : AppCompatActivity() {

    lateinit var  edtname: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__sample)
    }
}
