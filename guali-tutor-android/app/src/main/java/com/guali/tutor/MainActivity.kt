package com.guali.tutor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val barraMenu = findViewById<MaterialToolbar>(R.id.barraMenu)
        barraMenu.inflateMenu(R.menu.menu_principal)
    }
}
