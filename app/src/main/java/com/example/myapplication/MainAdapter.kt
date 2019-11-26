package com.example.myapplication

import android.graphics.Bitmap
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.target.SimpleTarget
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class MainAdapter(list: List<MainBean>) :
    BaseQuickAdapter<MainBean, BaseViewHolder>(R.layout.item_main, list) {

    override fun convert(helper: BaseViewHolder, item: MainBean) {
        val imageView = helper.getView<ImageView>(R.id.image)
        Glide.with(mContext).load(item.value).transition(DrawableTransitionOptions().crossFade()).into(imageView)
    }

}