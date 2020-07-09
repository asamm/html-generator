package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.base.Tag

/**
 * Base entry point for HTML generated structure.
 *
 * @param head (optional) head generator
 * @param body body generator
 */
class Html(
        head: (Head.() -> Unit)? = null,
        body: Body.() -> Unit)
    : Tag("html") {

    init {
        head?.let {
            insertTag(Head(), head)
        }
        insertTag(Body(), body)
    }
}