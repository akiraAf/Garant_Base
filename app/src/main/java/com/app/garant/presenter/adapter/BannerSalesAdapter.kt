package com.app.garant.presenter.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class BannerSalesAdapter(
    fm: FragmentManager, lifecycle: Lifecycle,
): FragmentStateAdapter(fm,lifecycle){

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        val frag = BannerAd();
        val bundle = Bundle()
        bundle.putInt("pos", position)
        frag.arguments = bundle
        return frag
    }

}