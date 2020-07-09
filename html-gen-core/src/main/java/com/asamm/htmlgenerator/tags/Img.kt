package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.base.Tag

/**
 * "img" html tag for the [Body].
 * https://www.w3schools.com/tags/tag_img.asp
 */
class Img : Tag("img") {

    var src: String
        get() = attributes["src"] ?: ""
        set(value) {
            attributes["src"] = value
        }
}