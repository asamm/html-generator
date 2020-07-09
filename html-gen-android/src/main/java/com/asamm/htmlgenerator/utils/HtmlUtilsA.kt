package com.asamm.htmlgenerator.utils

import android.annotation.SuppressLint
import android.os.Build
import android.text.Html
import android.util.Log
import android.widget.TextView
import com.asamm.htmlgenerator.base.Tag

object HtmlUtilsA {

    /**
     * Convert text to HTML. Function encapsulate by try/catch due to possible
     * IO errors in HTML converter.
     *
     * @param text        text to convert
     * @param imageGetter instance of image getter
     * @return converted text
     */
    @SuppressLint("InlinedApi")
    @JvmOverloads
    fun fromHtml(text: String, imageGetter: Html.ImageGetter? = null): CharSequence {
        var textNew = text.trim()
        try {
            // modify text before display
            if (!HtmlUtils.containsHtmlCode(textNew)) {
                textNew = textNew.replace("\t", "&nbsp;&nbsp;")
                textNew = textNew.replace("\n", "<br />")
            }

            // convert
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Html.fromHtml(textNew, Html.FROM_HTML_MODE_LEGACY, imageGetter, null)
            } else {
                @Suppress("DEPRECATION")
                Html.fromHtml(textNew, imageGetter, null)
            }
        } catch (e: Exception) {
            Log.w("HtmlUtils", "fromHtml($text, $imageGetter)", e)
            return textNew
        }
    }

    //*************************************************
    // GENERATOR HELPER
    //*************************************************

    /**
     * Apply certain tag to [textView] instance.
     */
    fun Tag.applyTo(textView: TextView) {
        // TODO menion
        // validate HTML code
        // check usage of ul*li tags, available since Build.VERSION_CODES.N
        val htmlAsText = render(indent = "")
        Log.d("HtmlUtilsA", "applyTo($textView), text: $htmlAsText")
        textView.text = fromHtml(htmlAsText.toString())
    }
}