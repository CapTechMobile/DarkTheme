package com.captechventures.darktheme.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.captechventures.darktheme.adapter.UserItem
import com.captechventures.darktheme.util.MockRepo
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_smart_dark.*

abstract class GroupieFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initMessages()
    }

    private fun initMessages() {
        val adapter = GroupAdapter<ViewHolder>()

        val messages = MockRepo.getMessages()
        messages.forEach {
            adapter.add(UserItem(it))
        }

        messagesRv.adapter = adapter

    }
}