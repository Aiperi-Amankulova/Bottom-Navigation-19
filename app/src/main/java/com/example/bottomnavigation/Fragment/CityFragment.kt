package com.example.bottomnavigation.Fragment

import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.Data.DataClass
import com.example.bottomnavigation.R
import com.example.bottomnavigation.Ui.RecyclerAdapter
import kotlinx.android.synthetic.main.city_recycler.*

class CityFragment: BaseFragment(), InterfaceRecycler {
    override fun resID() = R.layout.city_recycler

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOfCities()
    }

    private fun listOfCities() {
        val adapter = RecyclerAdapter(this)
        recyclerview.adapter = adapter
        adapter.addingList(DataClass("Washington", R.drawable.washington, getString(R.string.washington)))
        adapter.addingList(DataClass("Astana",R.drawable.astana , getString(R.string.astana)))
        adapter.addingList(DataClass("Baku", R.drawable.berlin,getString(R.string.baku)))
        adapter.addingList(DataClass("Bishkek",R.drawable.bishkek,getString(R.string.bishkek)))
        adapter.addingList(DataClass("Karakol",R.drawable.karakol, getString(R.string.karakol)))
        adapter.addingList(DataClass("Berlin" ,R.drawable.berlin, getString(R.string.berlin) ))
        adapter.addingList(DataClass("Athens" ,R.drawable.athens, getString(R.string.athens) ))
        adapter.addingList(DataClass("Bandung" ,R.drawable.bandung, getString(R.string.bandung) ))
    }

    override fun newPage(data: DataClass) {
        TODO("Not yet implemented")
    }
//    override fun newPage(data: DataClass) {
//        val directions = CityFragmentDer.actionCityFragmentToItemFragment(data)
//        findNavController().navigate(directions)
//    }
}

