package com.app.garant.presenter.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.PageSearchProductsBinding

class SearchProductsPage : Fragment(R.layout.page_search_products) {

    private val bind by viewBinding(PageSearchProductsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}