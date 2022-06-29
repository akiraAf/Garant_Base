package com.app.garant.presenter.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPageProductPagerAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0->{
                val topSelling = TopSellingAdapter()
                topSelling
            }
            1->{
                val stockPage = StockPage()
                stockPage
            }
            else->{
                val popularAdapter = PopularAdapter()
                popularAdapter
            }
        }
    }
}