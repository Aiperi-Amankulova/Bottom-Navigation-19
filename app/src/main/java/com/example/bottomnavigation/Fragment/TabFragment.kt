package com.example.bottomnavigation.Fragment

import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.fragment_tab.*

class TabFragment: BaseFragment() {
    override fun resID() = R.layout.fragment_tab
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPAge()
    }

    private fun setupViewPAge() {
        val adapter =TabAdapter(childFragmentManager)
        vpTab.adapter=adapter
        adapter.addFragment(FirstTabFragment())
        adapter.addFragment(SecondTabFragment())
        tabLayout.setupWithViewPager(vpTab)
    }

}