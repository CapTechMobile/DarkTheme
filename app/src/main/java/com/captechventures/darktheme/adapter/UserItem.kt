package com.captechventures.darktheme.adapter

import com.captechventures.darktheme.R
import com.captechventures.darktheme.model.User
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.user_row.view.*

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

class UserItem(val user: User, val isCustomDark: Boolean) : Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.firstnameTv.text = user.firstName
        viewHolder.itemView.lastNameTv.text = user.lastName
        viewHolder.itemView.messageTv.text = user.message
        viewHolder.itemView.profileImageIv.setImageResource(user.resId)
        viewHolder.itemView.dateTv.text = user.date

        if (user.isRead) {
            viewHolder.itemView.readTv.text = "R";
            viewHolder.itemView.readIv.setImageResource(if (isCustomDark) R.drawable.ic_all_done_24dp else R.drawable.ic_all_done_nodark_24dp)
        } else {
            viewHolder.itemView.readTv.text = "S";
            viewHolder.itemView.readIv.setImageResource(if (isCustomDark) R.drawable.ic_done_24dp else R.drawable.ic_done_nodark_24dp)
        }
    }

    override fun getLayout(): Int {
        return if (isCustomDark) R.layout.user_row else R.layout.user_row_nodark
    }
}