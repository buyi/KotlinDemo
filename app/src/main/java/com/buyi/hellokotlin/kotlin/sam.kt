package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/23.
 */
import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> (-x + y) })
    return arrayList
}