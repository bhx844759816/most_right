package com.bhx.most_right.view

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.ViewGroup
import com.bhx.most_right.R

/**
 * 底部选项卡的View
 */
class BottomSelectView(context: Context) : ViewGroup(context) {

    //获取view的宽
    var viewWidth = 0
    //获取View的高
    var viewHeight = 0

    init {
        viewWidth = context.resources.displayMetrics.widthPixels
        viewHeight = BitmapFactory.decodeResource(context.resources, R.drawable.ic_tab_post).height
    }

    /**
     * 设置底部选着的宽高
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(viewWidth, viewHeight)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }

}