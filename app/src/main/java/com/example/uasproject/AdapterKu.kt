package com.example.uasproject

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterKu(
    private val context: Activity,
    private val names: Array<String>,
    private val profileImages: Array<Int>,
    private val postImages: Array<Int>
) : ArrayAdapter<String>(context, R.layout.item_post, names) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.item_post, null, true)

        val profileImageView = rowView.findViewById<ImageView>(R.id.imageViewProfile)
        val userNameTextView = rowView.findViewById<TextView>(R.id.textViewUserName)
        val postTimeTextView = rowView.findViewById<TextView>(R.id.textViewPostTime)
        val postImageView = rowView.findViewById<ImageView>(R.id.imageViewPost)
        val likeImageView = rowView.findViewById<ImageView>(R.id.imageViewLike)
        val commentImageView = rowView.findViewById<ImageView>(R.id.imageViewComment)
        val shareImageView = rowView.findViewById<ImageView>(R.id.imageViewShare)

        profileImageView.setImageResource(profileImages[position])
        userNameTextView.text = names[position]
        // Set post time (You can set it dynamically based on your logic)
        postTimeTextView.text = "2 hours ago"
        postImageView.setImageResource(postImages[position])
        likeImageView.setImageResource(R.drawable.ic_like)
        commentImageView.setImageResource(R.drawable.ic_comment)
        shareImageView.setImageResource(R.drawable.ic_share)

        return rowView
    }
}
