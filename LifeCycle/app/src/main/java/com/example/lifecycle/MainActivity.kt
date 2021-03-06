package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private val activity = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printLog(activity,"onCreate()")

        button.setOnClickListener {
            startActivity<DetailActivity>()
        }
    }

    override fun onStart() {
        super.onStart()

        printLog(activity,"onStart()")
    }

    override fun onResume() {
        super.onResume()

        printLog(activity,"onResume()")
    }

    override fun onPause() {
        super.onPause()

        printLog(activity,"onPause()")
    }

    override fun onStop() {
        super.onStop()

        printLog(activity,"onStop()")
    }

    override fun onRestart() {
        super.onRestart()

        printLog(activity,"onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()

        printLog(activity,"onDestroy()")
    }

}