package com.app.garant.presenter.screens.installment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.InstallmentPagerAdapter
import com.app.garant.databinding.ScreenInstallmentHistoryBinding
import com.google.android.material.tabs.TabLayoutMediator

class InstallmentHistoryScreen : Fragment(R.layout.screen_installment_history) {

    private val bind by viewBinding(ScreenInstallmentHistoryBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabTitles = listOf("Рассрочки", "Заказы")
        bind.pager.adapter = InstallmentPagerAdapter(childFragmentManager, lifecycle)

        TabLayoutMediator(bind.tabLayout, bind.pager) {tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        bind.back.setOnClickListener {
            findNavController().popBackStack()
        }


    }
}


