package com.asamm.htmlgenerator.tags

import com.asamm.htmlgenerator.attrs.Align
import com.asamm.htmlgenerator.base.BodyTag

class Div : BodyTag("div") {

    var align: Align
        get() {
            return Align.values()
                .find { it.name == attributes["align"] }
                ?: Align.LEFT
        }
        set(value) {
            attributes["align"] = value.name
        }
}