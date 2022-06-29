package com.app.garant.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.app.garant.R
import com.app.garant.presenter.adapter.NotificationAdapter
import com.app.garant.databinding.ScreenNotificationBinding


class NotificationScreen : Fragment(R.layout.screen_notification) {

    private val bind by viewBinding(ScreenNotificationBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.notificationRV.layoutManager = LinearLayoutManager(activity)
        bind.notificationRV.adapter = NotificationAdapter()

        bind.back.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}