package com.app.garant.presenter.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.PageNothingFoundBinding


class NothingFoundPage : Fragment(R.layout.page_nothing_found) {

    private val bind by viewBinding(PageNothingFoundBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}