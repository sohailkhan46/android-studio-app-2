package com.example.sendingvalue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog
import  kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnshow:Button = findViewById(R.id.btnshow)

        btnshow.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.item_bottom_sheet,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }



    }



    fun savebutton(view: View){
        val name=editTextTextPersonName.text.toString()
        val country=editTextTextPersonName3.text.toString()
        val age=editTextTextPersonName2.text.toString().toInt()


        val intent=Intent(this@MainActivity, MainAcitivty2::class.java)
        intent.putExtra("Name",name)
        intent.putExtra("Age",age)
        intent.putExtra("country",country)
        startActivity(intent)

    }
}