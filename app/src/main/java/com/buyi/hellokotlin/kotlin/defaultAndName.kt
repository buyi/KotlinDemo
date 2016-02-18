package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/18.
 */
//Named arguments
//
//Default and named arguments help to minimize the number of overloads and improve the readability of the function invocation. The library function joinToString is declared with default values for parameters:
//
//fun joinToString(
//        separator: String = ", ",
//        prefix: String = "",
//        postfix: String = "",
//        /* ... */
//): String
//It can be called on a collection of Strings. Specifying only two arguments make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]")

//对于这种方式 只改后几个参数的默认值 都需要将前边的参数再传一遍