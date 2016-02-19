package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/19.
 */
//http://kotlinlang.org/docs/reference/basic-types.html#string-literals
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String =
        """\d{2}\ $month \d{4}""";