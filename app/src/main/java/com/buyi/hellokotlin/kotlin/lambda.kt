package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/19.
 */

// ->  之前是 参数声明 之后是 函数体
fun containsEven(collection: Collection<Int>): Boolean = collection.any { it / 2 == 0 }
// val sum = { x: Int, y: Int -> x + y }
// val sum: (Int, Int) -> Int = { x, y -> x + y }