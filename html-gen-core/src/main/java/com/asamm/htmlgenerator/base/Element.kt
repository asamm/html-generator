package com.asamm.htmlgenerator.base

/**
 * Base element item in the HTML structure.
 */
internal interface Element {

    /**
     * Render element into [builder] container with certain [indent] at start..
     */
    fun render(builder: StringBuilder = StringBuilder(), indent: String = ""): StringBuilder
}