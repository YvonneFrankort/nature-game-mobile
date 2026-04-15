package com.example.naturegame.utils

import android.content.Context
import android.graphics.PorterDuff
import androidx.core.content.ContextCompat
import com.example.naturegame.R
import android.graphics.drawable.Drawable
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable

fun scaleDrawable(drawable: Drawable, scale: Float): Drawable {
    val width = ((drawable.intrinsicWidth.takeIf { it > 0 } ?: 64) * scale).toInt()
    val height = ((drawable.intrinsicHeight.takeIf { it > 0 } ?: 64) * scale).toInt()

    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)

    drawable.setBounds(0, 0, width, height)
    drawable.draw(canvas)

    return BitmapDrawable(null, bitmap)
}

fun getTintedDefaultMarker(context: Context, colorHex: String) =
    ContextCompat.getDrawable(context, R.drawable.ic_marker)?.apply {
        setColorFilter(android.graphics.Color.parseColor(colorHex), PorterDuff.Mode.SRC_IN)
    }
