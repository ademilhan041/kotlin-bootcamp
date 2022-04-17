package com.tss.bootcamp.kotlin.session2Functions.c2SingleExpr

// Desc: When a function returns a single expression, the curly braces can be omitted and the body is specified after a = symbol
fun double(x: Int): Int {
    return x * 2
}

fun double1(x: Int): Int = x * 2

fun double2(x: Int) = x * 2
