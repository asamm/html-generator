package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.base.Element

/**
 * "br" html tag for the [Body], that insert new line.
 */
class Br : Element {

    override fun render(builder: StringBuilder, indent: String): StringBuilder {
        builder.append("$indent<br />\n")
        return builder
    }
}