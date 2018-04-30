/*
 * Copyright (C) 2018 The Smash Ks Open Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smash.ks.com.oneshoot.widgets.customize.selectable

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.Style.STROKE
import android.graphics.PointF
import android.graphics.RectF
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.FrameLayout

class SelectableAreaView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    companion object {
        const val DEFAULT_GAP = 100f
        const val DEFAULT_STROKE_WIDTH = 5f
        const val DEFAULT_TOUCH_RANGE = 10f
        const val DEFAULT_POSITION = 50f
        val DEFAULT_RECT =
            RectF(DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_GAP + DEFAULT_POSITION, DEFAULT_GAP + DEFAULT_POSITION)
    }

    private val paint by lazy {
        Paint().apply {
            color = Color.RED
            isAntiAlias = true
            style = STROKE
            strokeWidth = DEFAULT_STROKE_WIDTH
        }
    }
    private val paintAngles by lazy {
        Paint().apply {
            color = Color.GREEN
            isAntiAlias = true
        }
    }
    private val leftTopPoint = PointF(DEFAULT_POSITION, DEFAULT_POSITION)
    private val rightBottomPoint = PointF(DEFAULT_GAP + DEFAULT_POSITION, DEFAULT_GAP + DEFAULT_POSITION)

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return true
    }

    override fun onDraw(canvas: Canvas) {
        canvas.apply {
            // Center image
            drawRect(leftTopPoint.x, leftTopPoint.y, rightBottomPoint.x, rightBottomPoint.y, paint)
            // Four Angles
            val fourAngles = listOf(leftTopPoint)
            drawRect(leftTopPoint.x - DEFAULT_TOUCH_RANGE,
                     leftTopPoint.y - DEFAULT_TOUCH_RANGE,
                     leftTopPoint.x + DEFAULT_TOUCH_RANGE,
                     leftTopPoint.y + DEFAULT_TOUCH_RANGE,
                     paintAngles)
        }
    }
}