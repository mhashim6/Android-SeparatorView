package mhashim6.android.separatorView

import android.content.Context
import androidx.annotation.Px

@Px
fun dpToPx(dp: Int, context: Context) = (context.resources.displayMetrics.density * dp).toInt()