package com.franzandel.fabtester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fabTest.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))

//        fabTest.backgroundTintList = AppCompatResources.getColorStateList(this, R.color.fab_selector)
        fabTest.backgroundTintList = AppCompatResources.getColorStateList(this, android.R.color.black)
    }
}