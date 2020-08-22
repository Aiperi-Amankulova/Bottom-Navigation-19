package com.example.bottomnavigation.Fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabAdapter(fragment : FragmentManager): FragmentStatePagerAdapter(fragment) {

    private var list = arrayListOf<Fragment>()

    fun addFragment(fragmen: Fragment){
        list.add(fragmen)
        notifyDataSetChanged()
    }

    override fun getItem(position: Int)=list[position]
    override fun getCount()=  list.size
}