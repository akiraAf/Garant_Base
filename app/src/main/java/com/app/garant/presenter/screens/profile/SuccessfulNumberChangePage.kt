package com.app.garant.presenter.screens.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.PageSuccessfulNumberChangeBinding


class SuccessfulNumberChangePage : Fragment(R.layout.page_successful_number_change) {

    private val bind by viewBinding(PageSuccessfulNumberChangeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.profile.setOnClickListener {
            findNavController().navigate(R.id.action_successfulNumberChangePage2_to_profileScreen)
        }
    }


}