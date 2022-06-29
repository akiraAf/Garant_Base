package com.app.garant.presenter.screens.cart

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.OrderAdapter
import com.app.garant.databinding.PageBasketCheckBinding
import com.app.garant.models.OrderData

class CheckBasketPage:Fragment(R.layout.page_basket_check) {

    private val bind by viewBinding(PageBasketCheckBinding::bind)
    private val orderData = ArrayList<OrderData>()
    private val orderAdapter by lazy { OrderAdapter(orderData, true) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()
        bind.basketRV.layoutManager = LinearLayoutManager(activity)
        bind.basketRV.adapter = orderAdapter

        bind.back.setOnClickListener {
            findNavController().popBackStack()
        }

        bind.bookInstallment.setOnClickListener {
            findNavController().navigate(R.id.action_checkBasketPage_to_nav_installment)
        }

    }


    private fun initData() {
        for (i in 1..4)
            orderData.add(
                OrderData(
                    "Apple iPhone 12\n128GB",
                    "10 700 000 сум",
                    "3 шт."
                )
            )
    }
}