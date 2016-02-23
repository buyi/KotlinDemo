package com.buyi.hellokotlin.kotlin

import java.util.*

/**
 * Created by buyi on 16/2/23.
 */
// 类似于java匿名内部类
import java.util.*

class objectexpression {
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object:Comparator<Int> {
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}
}