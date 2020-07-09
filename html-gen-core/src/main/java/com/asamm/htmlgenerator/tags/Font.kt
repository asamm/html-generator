package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.base.BodyTag

class Font : BodyTag("font") {

    var color: String
        get() = attributes["color"] ?: ""
        set(value) {
            attributes["color"] = value
        }

    var face: String
        get() = attributes["face"] ?: ""
        set(value) {
            attributes["face"] = value
        }
}