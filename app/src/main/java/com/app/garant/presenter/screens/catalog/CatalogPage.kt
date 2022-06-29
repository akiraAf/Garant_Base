package com.app.garant.presenter.screens.catalog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.CatalogAdapter
import com.app.garant.databinding.PageCatalogBinding

class CatalogPage : Fragment(R.layout.page_catalog) {

    private val bind by viewBinding(PageCatalogBinding::bind)
    private  val adapterProducts by lazy {CatalogAdapter()}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.catalogRV.layoutManager = GridLayoutManager(activity, 2)
        bind.catalogRV.adapter = adapterProducts
        adapterProducts.setListenerClick {
            findNavController().navigate(R.id.action_catalogPage_to_subcategoryPage)
        }

        bind.favorites.setOnClickListener {
            findNavController().navigate(R.id.action_catalogPage_to_favoritesPage2)
        }
    }

}