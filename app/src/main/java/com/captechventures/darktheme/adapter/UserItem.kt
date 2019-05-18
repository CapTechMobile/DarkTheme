package com.captechventures.darktheme.adapter

import com.captechventures.darktheme.R
import com.captechventures.darktheme.model.User
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.user_row.view.*

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