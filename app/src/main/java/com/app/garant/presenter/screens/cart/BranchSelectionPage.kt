package com.app.garant.presenter.screens.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.BranchAdapter
import com.app.garant.databinding.PageBranchSelectionBinding

class BranchSelectionPage : Fragment(R.layout.page_branch_selection) {
    private val bind by viewBinding(PageBranchSelectionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.branchRV.layoutManager = LinearLayoutManager(activity)
        bind.branchRV.adapter = BranchAdapter()
        bind.choice.setOnClickListener {

        }
        bind.back.setOnClickListener {
            findNavController().popBackStack()
        }

        bind.choice.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}