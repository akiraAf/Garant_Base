package com.app.garant.presenter.screens.auth

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.Api
import com.app.garant.AuthData
import com.app.garant.R
import com.app.garant.databinding.ScreenAuthorizationBinding
import com.app.garant.ApiMda

class AuthorizationScreen : Fragment(R.layout.screen_authorization) {

    private val bind by viewBinding(ScreenAuthorizationBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.back.setOnClickListener {
            findNavController().popBackStack()
        }

        bind.next.setOnClickListener {
           // bind.progressBar.visibility = View.VISIBLE
           // val phoneNumber:String = bind.inputPhoneNumber.unMasked
           // ApiMda().apiLogin("998$phoneNumber")
         //   bind.progressBar.visibility = View.GONE
            findNavController().navigate(R.id.action_authorizationScreen_to_verificationScreen)
        }


    }
}