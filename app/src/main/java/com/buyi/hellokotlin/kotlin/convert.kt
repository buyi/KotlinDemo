package com.buyi.hellokotlin

/**
 * Created by buyi on 16/2/18.
 */
class JavaCode {
    fun toJSON(collection: Collection<Int>): String {
        // 声明对象
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }
}
