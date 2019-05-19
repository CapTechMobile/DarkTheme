package com.captechventures.darktheme.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.captechventures.darktheme.adapter.UserItem
import com.captechventures.darktheme.util.MockRepo
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_smart_dark.*

/*Copyright 2019 Captech Consulting

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

abstract class GroupieFragment : Fragment() {

    var isCustomDark = false

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initMessages()
    }

    private fun initMessages() {
        val adapter = GroupAdapter<ViewHolder>()

        val messages = MockRepo.getMessages()
        messages.forEach {
            adapter.add(UserItem(it, isCustomDark))
        }

        messagesRv.adapter = adapter

    }
}