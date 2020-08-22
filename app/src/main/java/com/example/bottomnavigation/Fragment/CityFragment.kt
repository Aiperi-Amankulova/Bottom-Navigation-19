package com.example.bottomnavigation.Fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.Data.DataClass
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.fragment_city.*

class CityFragment: BaseFragment() {
    override fun resID() = R.layout.fragment_city

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOfCities()
    }

    private fun listOfCities() {
        val adapter = recyclerAdapter(this)
        recyclerview.adapter = adapter
        adapter.addlist(DataClass("Washington", R.drawable.newyourk, getString(R.string.city)))
        adapter.addlist(DataClass("Astana",R.drawable.vancouver , getString(R.string.city2)))
        adapter.addlist(DataClass("Baku", R.drawable.berlin,getString(R.string.city3)))
        adapter.addlist(DataClass("Bishkek",R.drawable.hanover,getString(R.string.cityFour)))
        adapter.addlist(DataClass("Karalol",R.drawable.oslo, getString(R.string.cityfive)))
        adapter.addlist(DataClass("Berlin" ,R.drawable.cabowerde, getString(R.string.city7) ))
        adapter.addlist(DataClass("Athens" ,R.drawable.cabowerde, getString(R.string.city7) ))
        adapter.addlist(DataClass("Bandung" ,R.drawable.cabowerde, getString(R.string.city7) ))
    }

    override fun gotoTheDetails(data: DataClass) {

        val list = AlarmFragmentDirections.actionAlarmFragmentToCitysFragment(data)
        findNavController().navigate(list)
    }
}
}