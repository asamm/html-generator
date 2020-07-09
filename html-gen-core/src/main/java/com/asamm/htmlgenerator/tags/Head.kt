package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.base.Tag

/**
 * Base head tag.
 */
class Head : Tag("head") {

    fun title(init: Title.() -> Unit) = insertTag(Title(), init)
}