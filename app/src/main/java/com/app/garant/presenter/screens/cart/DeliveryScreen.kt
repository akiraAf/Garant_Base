package com.app.garant.presenter.screens.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.ScreenDeliveryBinding


class DeliveryScreen : Fragment(R.layout.screen_delivery) {
    private val bind by viewBinding(ScreenDeliveryBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}