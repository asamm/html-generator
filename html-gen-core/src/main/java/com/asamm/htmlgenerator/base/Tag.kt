package com.asamm.htmlgenerator.base

/**
 * Tag [name] element in HTML structure.
 */
abstract class Tag(val name: String) : Element {

    internal val children = arrayListOf<Element>()
    internal val attributes = hashMapOf<String, String>()

    protected fun <T : Element> insertTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String): StringBuilder {
        builder.append("$indent<$name${renderAttributes()}>\n")
        for (c in children) {
            c.render(builder, "$indent  ")
        }
        builder.append("$indent</$name>\n")
        return builder
    }

    private fun renderAttributes(): String {
        val builder = StringBuilder()
        for ((attr, value) in attributes) {
            builder.append(" $attr=\"$value\"")
        }
        return builder.toString()
    }

    override fun toString(): String {
        return render().toString()
    }
}