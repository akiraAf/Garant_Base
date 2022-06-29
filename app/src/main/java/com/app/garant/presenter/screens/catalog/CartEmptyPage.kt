package com.app.garant.presenter.screens.catalog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.PageCartEmptyBinding

class CartEmptyPage : Fragment(R.layout.page_cart_empty) {

    private val bind by viewBinding(PageCartEmptyBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.goToCatalog.setOnClickListener {
           //findNavController().navigate(R.id.action_cartEmptyPage_to_orderingScreen)
           // findNavController().navigate(R.id.action_cartEmptyPage_to_nav_main)
            findNavController().navigate(R.id.action_cartEmptyPage_to_basketPage)
        }
    }
}