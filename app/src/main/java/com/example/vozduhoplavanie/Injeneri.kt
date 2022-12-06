package com.example.vozduhoplavanie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager

class Injeneri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        makeFullScreen()
        setContentView(R.layout.activity_injeneri)
    }
    private fun makeFullScreen(){
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()
    }
    fun OnClick3(view: View){
        val intent: Intent = Intent(this@Injeneri, Second_Injeneri::class.java)
        when(view.id){
            R.id.imageButton10 -> startActivity(intent)
        }
    }
    fun OnClick6(view: View){
        val intent: Intent = Intent(this@Injeneri, MainActivity::class.java)
        when(view.id){
            R.id.imageButton11 -> startActivity(intent)
        }
    }
}