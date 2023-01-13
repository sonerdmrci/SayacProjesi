package com.sonerdmrci.runablehandlerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var numara = 0
    var runnble : Runnable = Runnable{}
    var handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Baslat(view: View){
        numara = 0
        runnble = object : Runnable{
            override fun run() {
                numara += 1
                textView.text= "Sonuç: ${numara}"
                handler.postDelayed(runnble,1000)
            }
        }
        handler.post(runnble)
    }
    fun Durdur(view: View){
        handler.removeCallbacks(runnble)
        numara = 0
        textView.text = "Sayaç = 0"


    }
}