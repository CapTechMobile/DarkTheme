package com.captechventures.darktheme.adapter

import com.captechventures.darktheme.R
import com.captechventures.darktheme.model.User
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.user_row.view.*

class UserItem(val user: User) : Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.firstnameTv.text = user.firstName
        viewHolder.itemView.lastNameTv.text = user.lastName
        viewHolder.itemView.messageTv.text = user.message
        viewHolder.itemView.profileImageIv.setImageResource(user.resId)
        viewHolder.itemView.dateTv.text = user.date
    }

    override fun getLayout(): Int {
        return R.layout.user_row
    }
}