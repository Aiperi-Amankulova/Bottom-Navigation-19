package com.example.bottomnavigation.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigation.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BottomNav()
    }

    private fun BottomNav() {
        val navV = findViewById<BottomNavigationView>(R.id.btmNav)
        val navId = listOf(R.navigation.city, R.navigation.smile, R.navigation.account)

        navV.setupWithNavController(
            navGraphIds = navId,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navV,
            intent = intent
        )
    }
}
