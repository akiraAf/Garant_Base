package com.app.garant.presenter.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.StockPageBinding
import com.app.garant.models.ProductData


class StockPage : Fragment(R.layout.stock_page) {
    private val bind by viewBinding(StockPageBinding::bind)
    private var data = ArrayList<ProductData>()
    private val adapterProduct by lazy { ProductsAdapter(data)}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        for (i in 1..20){
            data.add( ProductData("2 300 000 сум", "x 12 мес", "10 700 000 сум",
                "Apple iPhone 13 \n128GB", R.drawable.watch)
            )
        }

        bind.recycler.layoutManager = GridLayoutManager(activity, 2)
        bind.recycler.adapter = adapterProduct

        adapterProduct.setListenerClick {
            findNavController().navigate(R.id.action_mainPage_to_nav_product_details)
        }
    }


}