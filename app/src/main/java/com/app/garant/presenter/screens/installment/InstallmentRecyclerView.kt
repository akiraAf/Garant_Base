package com.app.garant.presenter.screens.installment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.InstallmentAdapter
import com.app.garant.databinding.ItemRecyclerBinding
import com.app.garant.models.InstallmentHistoryData

class InstallmentRecyclerView(val data:ArrayList<InstallmentHistoryData>)
    : Fragment(R.layout.item_recycler) {

    private val bind by viewBinding(ItemRecyclerBinding::bind)
    private val installmentAdapter by lazy {  InstallmentAdapter(data) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        bind.recycler.layoutManager = LinearLayoutManager(activity)

        bind.recycler.adapter =  installmentAdapter

        installmentAdapter.setListenerClick {
            findNavController().navigate(R.id.action_installmentHistoryScreen2_to_installmentPage)
        }


    }

}