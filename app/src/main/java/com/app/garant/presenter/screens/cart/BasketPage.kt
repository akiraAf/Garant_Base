package com.app.garant.presenter.screens.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.OrderAdapter
import com.app.garant.databinding.PageBasketBinding
import com.app.garant.presenter.screens.dialogs.DialogCleanBasket
import com.app.garant.models.OrderData


class BasketPage : Fragment(R.layout.page_basket) {
    private val bind by viewBinding(PageBasketBinding::bind)
    private val orderData = ArrayList<OrderData>()

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

    private val orderAdapter by lazy { OrderAdapter(orderData) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()

        bind.basketRV.adapter = orderAdapter
        bind.basketRV.layoutManager = LinearLayoutManager(activity)

        bind.unavailableRV.adapter = orderAdapter
        bind.unavailableRV.layoutManager = LinearLayoutManager(activity)


        bind.cleanBasket.setOnClickListener {
            val dialog = DialogCleanBasket()
            dialog.show(childFragmentManager, "clean_basket")
        }

        bind.buyBtn.setOnClickListener {
            findNavController().navigate(R.id.action_basketPage_to_nav_ordering)
        }

        bind.bookInstallment.setOnClickListener {
            findNavController().navigate(R.id.action_basketPage_to_checkBasketPage)
        }

    }


}