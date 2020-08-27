package com.example.bottomnavigation.Fragment

import android.os.Bundle
import android.view.View
import androidx.core.app.Person.fromBundle
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.fragment_city.*

class ItemFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_city

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = ItemFragment.fromBundle(requireArguments())
        tvName.text = bundle.details.cityName
        tvAbout.text = bundle.details.description
        if (bundle.details.imageOfCity != null) img.setImageResource(bundle.details.img)
    }
}