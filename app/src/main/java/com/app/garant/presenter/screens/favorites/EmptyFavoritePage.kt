package com.app.garant.presenter.screens.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.databinding.PageEmptyFavoriteBinding

class EmptyFavoritePage : Fragment(R.layout.page_empty_favorite) {

   private val bind by viewBinding(PageEmptyFavoriteBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.goToCatalog.setOnClickListener {
            findNavController().navigate(R.id.action_emptyFavoritePage_to_catalogPage)
        }
    }
}