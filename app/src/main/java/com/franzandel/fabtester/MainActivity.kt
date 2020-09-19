package com.franzandel.fabtester

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Conclusion must use app:backgroundTint not android:backgroundTint

//        fabTest.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))

//        fabTest.backgroundTintList = AppCompatResources.getColorStateList(this, R.color.fab_selector)
        fabTest.backgroundTintList = AppCompatResources.getColorStateList(this, android.R.color.black)
    }
}