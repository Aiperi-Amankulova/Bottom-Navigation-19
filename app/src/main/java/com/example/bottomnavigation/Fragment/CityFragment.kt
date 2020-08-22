package com.example.bottomnavigation.Fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.Data.DataClass
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.city_recycler.*
import kotlinx.android.synthetic.main.fragment_city.*

class CityFragment: BaseFragment() {
    override fun resID() = R.layout.city_recycler

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOfCities()
    }

    private fun listOfCities() {
        val adapter = recyclerAdapter(this)
        recyclerview.adapter = adapter
        adapter.addlist(DataClass("Washington", R.drawable.newyourk, getString(R.string.washington)))
        adapter.addlist(DataClass("Astana",R.drawable.vancouver , getString(R.string.astana)))
        adapter.addlist(DataClass("Baku", R.drawable.berlin,getString(R.string.baku)))
        adapter.addlist(DataClass("Bishkek",R.drawable.hanover,getString(R.string.bishkek)))
        adapter.addlist(DataClass("Karalol",R.drawable.oslo, getString(R.string.karakol)))
        adapter.addlist(DataClass("Berlin" ,R.drawable.cabowerde, getString(R.string.berlin) ))
        adapter.addlist(DataClass("Athens" ,R.drawable.cabowerde, getString(R.string.athens) ))
        adapter.addlist(DataClass("Bandung" ,R.drawable.cabowerde, getString(R.string.bandung) ))
    }

    override fun gotoTheDetails(data: DataClass) {

        val list = AlarmFragmentDirections.actionAlarmFragmentToCitysFragment(data)
        findNavController().navigate(list)
    }
}
}