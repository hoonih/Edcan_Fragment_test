package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView
        bnv_main.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_main_home -> {
// 다른 프래그먼트 화면으로 이동하는 기능
                        val BlankFragment1 = Fragment1()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, BlankFragment1).commit()
                    }
                    R.id.menu_main_my -> {
                        val BlankFragment2 = Fragment2()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, BlankFragment2).commit()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_main_home
        }
    }
}
