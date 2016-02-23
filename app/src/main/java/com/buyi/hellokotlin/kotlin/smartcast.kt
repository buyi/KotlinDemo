package com.buyi.hellokotlin.kotlin

/**
 * Created by buyi on 16/2/23.
 */
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> {
                //if (expr.left is Num && expr.right is Num)
                eval(expr.left) + eval(expr.right)
            }



            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
