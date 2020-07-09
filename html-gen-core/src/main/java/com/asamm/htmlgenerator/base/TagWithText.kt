package com.asamm.htmlgenerator.base

/**
 * Tag [name] element in HTML structure that may also contain plain text inside.
 * To append simple text, use unary "+" operator.
 */
open class TagWithText(name: String) : Tag(name) {

    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}