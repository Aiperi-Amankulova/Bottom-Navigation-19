package com.example.bottomnavigation.Fragment

import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.fragment_city.*

class ItemFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_city

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = CitysFragmentArgs.fromBundle(requireArguments())
        descript.text = bundle.details?.cityName
        if (bundle.details?.image != null)
            city.setImageResource(bundle.details.img)
        val bundleF = CitysFragmentArgs.fromBundle(requireArguments())
        descripTwo.text = bundle.details?.description
    }
}