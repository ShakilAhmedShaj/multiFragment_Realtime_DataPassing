package com.shajt3ch.twofragmentdatapass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.layout_top, FragmentOne()).commit()
        supportFragmentManager.beginTransaction().add(R.id.layout_bottom, FragmentTwo()).commit()

    }
}