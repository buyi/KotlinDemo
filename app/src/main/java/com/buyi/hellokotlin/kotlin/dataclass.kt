package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/19.
 */
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}