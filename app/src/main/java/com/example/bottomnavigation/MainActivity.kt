package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigation.Fragment.AccountFragment
import com.example.bottomnavigation.Fragment.CityFragment
import com.example.bottomnavigation.Fragment.TabFragment
import com.example.bottomnavigation.Fragment.ViewPagerAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BottomNav()
    }

    private fun BottomNav() {
        val navView = findViewById<BottomNavigationView>(R.id.btmNav)
        val navId =  listOf(
            R.navigation.city,
            R.navigation.smile ,
            R.navigation.account)

        navView.run {

            setupWithNavController(
                    navGraphIds = navId,
                    fragmentManager = supportFragmentManager,
                    containerId = R.id.navV,
                    intent = intent
                )
        }

    }
}
