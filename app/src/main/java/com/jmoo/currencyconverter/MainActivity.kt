package com.jmoo.currencyconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jmoo.startup.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val AU_TO_SEK:Double = 6.32

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onConvert(view: View) {
        val dollarAmountEditText = editText.text.toString()
        var convertedAmount:Double ?= null
        convertedAmount = AU_TO_SEK * dollarAmountEditText.toDouble()
//        editText.setText(convertedAmount.toString())
        Toast.makeText(this, convertedAmount.toString(), Toast.LENGTH_LONG).show()
    }
}
