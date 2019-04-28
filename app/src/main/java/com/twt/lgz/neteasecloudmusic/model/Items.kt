package com.twt.lgz.neteasecloudmusic.model


import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import cn.edu.twt.retrox.recyclerviewdsl.Item
import cn.edu.twt.retrox.recyclerviewdsl.ItemController
import com.twt.lgz.neteasecloudmusic.R
import kotlinx.android.synthetic.main.playlist_info.view.*
import kotlinx.android.synthetic.main.song_info.view.*
import org.jetbrains.anko.layoutInflater


class PlaylistItem(val text: String?, val num: String?) : Item {

    companion object : ItemController {
        override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
            val inflater = parent.context.layoutInflater
            val view = inflater.inflate(R.layout.playlist_info, parent, false)
            return ViewHolder(
                view,
                view.iv_playlist,
                view.playlist_name,
                view.song_num
            )
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: Item) {
            holder as ViewHolder
            item as PlaylistItem
            holder.name.text = item.text

        }
    }

    class ViewHolder(val view: View, val imageView: ImageView, val name: TextView, val num: TextView) :
        RecyclerView.ViewHolder(view)

    override val controller = Companion
}

class PlaylistInfoItem(val text: String?, val num: String?) : Item {

    companion object : ItemController {
        override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
            val inflater = parent.context.layoutInflater
            val view = inflater.inflate(R.layout.song_info, parent, false)
            return ViewHolder(
                view,
                view.mv,
                view.index,
                view.song_name,
                view.artist,
                view.album,
                view.in_word,
                view.more
            )
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: Item) {
            holder as ViewHolder
            item as PlaylistItem
            holder.name.text = item.text

        }
    }

    class ViewHolder(
        val view: View,
        val iv_mv: ImageView,
        val index: ImageView,
        val name: TextView,
        val artist: TextView,
        val album: TextView,
        val textView: TextView,
        val more: ImageView
    ) :
        RecyclerView.ViewHolder(view)

    override val controller = Companion
}

