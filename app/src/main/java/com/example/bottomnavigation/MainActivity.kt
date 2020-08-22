package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.Fragment.AccountFragment
import com.example.bottomnavigation.Fragment.CityFragment
import com.example.bottomnavigation.Fragment.TabFragment
import com.example.bottomnavigation.Fragment.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNav()
    }
    private fun setupBottomNav() {
        val adapterV = ViewPagerAdapter(supportFragmentManager)
        navV.adapter = adapterV
        adapterV.addFragment(CityFragment())
        adapterV.addFragment(TabFragment())
        adapterV.addFragment(AccountFragment())
    }
}


