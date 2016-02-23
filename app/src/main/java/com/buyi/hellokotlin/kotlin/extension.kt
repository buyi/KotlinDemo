package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/23.
 */
// http://kotlinlang.org/docs/reference/functions.html#single-expression-functions
fun Int.r(): RationalNumber = RationalNumber (this,1)
fun Pair<Int, Int>.r(): RationalNumber =
        RationalNumber (this.first, this.second);


data class RationalNumber(val numerator: Int, val denominator: Int)