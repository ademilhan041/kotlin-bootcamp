package com.tss.bootcamp.kotlin.session2Functions.c3Vararg

// Desc: You can mark a parameter of a function (usually the last one) with the vararg modifier:
fun asList(vararg ts: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

// Desc: In this case, you can pass a variable number of arguments to the function:
val list = asList(1, 2, 3)

fun asList2(p1: Int, vararg ts: Int) = listOf<Int>()
fun asList2(p1: Int, vararg ts: Int, p2: Int) = listOf<Int>()
fun asList2(p1: Int, vararg ts: Int, p2: String) = listOf<Int>()
fun asList2(p1: String, vararg ts: Int, p2: String) = listOf<Int>()
fun asList2(vararg ts: Int, p2: String) = listOf<Int>()
//fun asList2(vararg ts: Int, p2: String, vararg ts2: String) = listOf<Int>()

// Desc: When you call a vararg-function, you can pass arguments individually, for example asList(1, 2, 3).
//       If you already have an array and want to pass its contents to the function, use the spread operator (prefix the array with *):
val a = intArrayOf(1, 2, 3)
val list2 = asList(-1, 0, *a, 4)