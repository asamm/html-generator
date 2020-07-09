package com.asamm.htmlgenerator.base

import com.asamm.htmlgenerator.attrs.Align
import com.asamm.htmlgenerator.tags.*

/**
 * Element for [Body] container. It serve as base element for all tags, that may also include
 * additional inner nested tags.
 */
open class BodyTag(name: String) : TagWithText(name) {

    fun a(href: String, init: A.() -> Unit) = insertTag(A(), init).apply {
        this.href = href
    }

    fun b(init: B.() -> Unit) = insertTag(B(), init)

    fun big(init: Big.() -> Unit) = insertTag(Big(), init)

    fun blockquote(init: Blockquote.() -> Unit) = insertTag(Blockquote(), init)

    fun br() = insertTag(Br(), { })

    fun cite(init: Cite.() -> Unit) = insertTag(Cite(), init)

    fun div(align: Align, init: Div.() -> Unit) = insertTag(Div(), init).apply {
        this.align = align
    }

    fun dfn(init: Dfn.() -> Unit) = insertTag(Dfn(), init)

    fun em(init: Em.() -> Unit) = insertTag(Em(), init)

    fun font(color: String, face: String, init: Font.() -> Unit) = insertTag(Font(), init).apply {
        this.color = color
        this.face = face
    }

    fun h1(init: H1.() -> Unit) = insertTag(H1(), init)

    fun h2(init: H2.() -> Unit) = insertTag(H2(), init)

    fun h3(init: H3.() -> Unit) = insertTag(H3(), init)

    fun h4(init: H4.() -> Unit) = insertTag(H4(), init)

    fun h5(init: H5.() -> Unit) = insertTag(H5(), init)

    fun h6(init: H6.() -> Unit) = insertTag(H6(), init)

    fun i(init: I.() -> Unit) = insertTag(I(), init)

    fun img(src: String) = insertTag(Img(), {}).apply {
        this.src = src
    }

    fun li(init: Li.() -> Unit) = insertTag(Li(), init)

    fun p(init: P.() -> Unit) = insertTag(P(), init)

    fun small(init: Small.() -> Unit) = insertTag(Small(), init)

    fun strike(init: Strike.() -> Unit) = insertTag(Strike(), init)

    fun strong(init: Strong.() -> Unit) = insertTag(Strong(), init)

    fun sub(init: Sub.() -> Unit) = insertTag(Sub(), init)

    fun sup(init: Sup.() -> Unit) = insertTag(Sup(), init)

    fun tt(init: Tt.() -> Unit) = insertTag(Tt(), init)

    fun ul(init: Ul.() -> Unit) = insertTag(Ul(), init)

    fun u(init: U.() -> Unit) = insertTag(U(), init)
}