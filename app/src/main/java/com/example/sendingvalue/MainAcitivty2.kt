package com.example.sendingvalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_acitivty2.*

class MainAcitivty2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_acitivty2)

        val intent=getIntent()
        val name=intent.getStringExtra("Name")
        val country=intent.getStringExtra("country")
        val age=intent.getIntExtra("Age", 0)
        textView4.text="Hello :"+name
        textView5.text="Your age is : "+age
        textView8.text="Your country is : "+country
    }
}