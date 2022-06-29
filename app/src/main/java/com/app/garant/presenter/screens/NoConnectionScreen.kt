package com.app.garant.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.PageNoConnectionBinding

class NoConnectionScreen : Fragment(R.layout.page_no_connection) {
    private val bind by viewBinding(PageNoConnectionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



}