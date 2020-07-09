package com.asamm.htmlgenerator.utils

object HtmlUtils {

    //*************************************************
    // CHECK HTML CODE
    //*************************************************

    /**
     * Check if text contains any HTML code.
     *
     * @param text text to check
     * @return `true` if contains HTML code
     */
    fun containsHtmlCode(text: String): Boolean {
        return text.contains("<") && text.contains(">")
    }
}