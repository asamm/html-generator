package com.asamm.htmlgenerator.base

/**
 * Text container > simple [text] value included into generated HTML content.
 */
internal class TextElement(private val text: String) : Element {

    override fun render(builder: StringBuilder, indent: String): StringBuilder {
        builder.append("$indent$text\n")
        return builder
    }
}