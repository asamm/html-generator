package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.base.BodyTag

class A : BodyTag("a") {

    var href: String
        get() = attributes["href"] ?: ""
        set(value) {
            attributes["href"] = value
        }
}