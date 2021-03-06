package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/18.
 */

//http://kotlinlang.org/docs/reference/functions.html#default-arguments
fun foo(name: String, number: Int=42, toUpperCase: Boolean=false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)