package com.multi.downloader.myapplication.custom

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import com.multi.downloader.myapplication.R

class CustomDialog(val context: Context) {

    fun dialog(): Dialog {

        var dialog: Dialog? = null
        dialog = Dialog(context, R.style.CustomDialog)
        val viewContent = LayoutInflater.from(context).inflate(R.layout.dialog_custom, null)
        dialog.setContentView(viewContent)
        dialog.window!!.setGravity(Gravity.BOTTOM)
        var params = viewContent.layoutParams as ViewGroup.MarginLayoutParams
        params.width = getWid() - DensityUtil.dp2px(context, 32f)
        params.height = getWid() - DensityUtil.dp2px(context, 32f)
        params.bottomMargin = DensityUtil.dp2px(context, 16f)
        dialog.window!!.setWindowAnimations(R.style.DialogAimation)
        dialog.setCanceledOnTouchOutside(false)
        return dialog!!
    }

    fun showDialog(dialog: Dialog) {

        if (!dialog.isShowing) {
            dialog.show()
        }
    }

    fun getWid(): Int {
        return context.resources.displayMetrics.widthPixels
    }
}