package com.asamm.htmlgenerator.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import com.asamm.htmlgen.sample.R
import com.asamm.htmlgenerator.attrs.Align
import com.asamm.htmlgenerator.tags.Html
import com.asamm.htmlgenerator.utils.HtmlUtilsA.applyTo

/**
 * Main activity sample screen.
 */
class MainActivity : FragmentActivity() {

    // inner view container
    private lateinit var innerView: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setup UI
        setContentView(R.layout.main_activity)
        innerView = findViewById(R.id.linear_layout_inner)
        setupContent()
    }

    private fun setupContent() {
        addTextView {
            Html {
                h1 { +"H1 header" }
                h2 { +"H2 header" }
                h3 { +"H3 header" }
                h4 { +"H4 header" }
                h5 { +"H5 header" }
                h6 { +"H6 header" }
                +"Possible text modifications:"
                ul {
                    li { b { +"b text" } }
                    li { big { +"big text" } }
                    li { i { +"i text" } }
                    li { small { +"small text" } }
                    li { strike { +"strike text" } }
                    li { dfn { +"dfn text" } }
                    li { em { +"em text" } }
                    li { strong { +"strong text" } }
                    li { +"hi"
                        sub { +"sub text" } }
                    li { +"hi"
                        sup { +"sup text" } }
                    li { tt { +"tt text" } }
                    li { u { +"u text" } }
                }
                p { +"followed by common text in P." }
                div(align = Align.CENTER) {
                    +"and in centered DIV with"
                    font("red", "") { +"red text."}
                }
                br()
                a("https://www.locusmap.eu") { +"Link" }
                +" to Locus Map homepage."
                br()
                blockquote { +"Quote: fun killMe(person: Person)" }
                br()
                cite { +"Citation: Be or not to be" }
            }.applyTo(this)
        }
    }

    private fun addTextView(text: TextView.() -> Unit) {
        // prepare view
        val tv = LayoutInflater.from(this)
                .inflate(R.layout.text_view_item, innerView, false) as TextView
        innerView.addView(tv)

        // set text
        tv.text()
    }
}