package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 액티비티가 생성될 때 호출되며 사용자 인터페이스 초기화에 사용된다.
        toast("1. onCreate() 호출, 가장 먼저 호출되는 메서드")
        Log.i("LifeCycle", "1. onCreate() 호출, 가장 먼저 호출되는 메서드")
    }

    override fun onStart() {
        super.onStart()

        // 액티비티가 화면에 보여질 예정
        toast("2. onStart() 호출")
        Log.i("LifeCycle", "2. onStart() 호출")
    }

    override fun onResume() {
        super.onResume()

        // 액티비티가 화면에 보여지는 부분
        toast("3. onResume() 호출")
        Log.i("LifeCycle", "3. onResume() 호출")
    }

    override fun onPause() {
        super.onPause()

        // 데이터 저장, 스레드 중지 등의 처리를 하기에 적당한 메서드.
        toast("4. onPause(), 다른 액티비티가 보여질 때 호출.")
        Log.i("LifeCycle", "4. onPause(), 다른 액티비티가 보여질 때 호출.")
    }

    override fun onStop() {
        super.onStop()

        toast("5. onStop(), 액티비티가 더이상 사용자에게 보여지지 않을 때 호출.")
        Log.i("LifeCycle", "5. onStop(), 액티비티가 더이상 사용자에게 보여지지 않을 때 호출.")
    }

    override fun onDestroy() {
        super.onDestroy()

        // finish() 메서드가 호출되거나 시스템이 메모리 확보를 위해 액티비티를 제거할 때 호출된다.
        toast("6. onDestroy(), 액티비티가 소멸될 때 호출됨.")
        Log.i("LifeCycle", "6. onDestroy(), 액티비티가 소멸될 때 호출됨.")
    }
}