package com.app.garant.presenter.adapter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.TopsellingPageBinding
import com.app.garant.models.ProductData

class TopSellingAdapter : Fragment(R.layout.topselling_page) {

    private val bind by viewBinding(TopsellingPageBinding ::bind)
    private var data = ArrayList<ProductData>()
    private val adapterProduct by lazy {  ProductsAdapter(data) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.recycler.layoutManager = GridLayoutManager(activity, 2)
        initData()
        bind.recycler.adapter =adapterProduct

        adapterProduct.setListenerClick {
            findNavController().navigate(R.id.action_mainPage_to_nav_product_details)
        }

    }

    private fun initData(){
        for (i in 1..20){
            if (i % 2 == 1)
                data.add( ProductData("2 300 000 сум", "x 12 мес", "10 700 000 сум",
                    "Apple iPhone 11 \n128GB", R.drawable.watch)
                )
            else
                data.add( ProductData("2 300 000 сум", "x 12 мес", "10 700 000 сум",
                    "Apple iPhone 11 \n128GB", R.drawable.product_img)
                )
        }
    }


}

