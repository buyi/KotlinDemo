package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/26.
 */
class DateRange(val start: MyDate, val endInclusive: MyDate){

    operator fun contains(d: MyDate) :Boolean{

        return d.compareTo (start) >= 0 && d.compareTo (endInclusive)<=0

    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}