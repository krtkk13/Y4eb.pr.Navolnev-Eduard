package com.example.vozduhoplavanie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        makeFullScreen()
        setContentView(R.layout.activity_main)

    }
       private fun makeFullScreen(){
           requestWindowFeature(Window.FEATURE_NO_TITLE)
           window.setFlags(
               WindowManager.LayoutParams.FLAG_FULLSCREEN,
               WindowManager.LayoutParams.FLAG_FULLSCREEN
           )
    supportActionBar?.hide()
}
fun onClick(view: View){
    val intent:Intent = Intent(this@MainActivity, Samoleti::class.java)
    when(view.id){
        R.id.imageButton5 -> startActivity(intent)

    }
}
    fun OnClick1(view: View){
        val intent:Intent = Intent(this@MainActivity, Injeneri::class.java)
        when(view.id){
            R.id.imageButton6 -> startActivity(intent)
        }
    }
   fun OnClick2(view: View){
       val intent:Intent = Intent(this@MainActivity, Piloti::class.java)
       when(view.id){
           R.id.imageButton7 -> startActivity(intent)
       }
   }
    }



