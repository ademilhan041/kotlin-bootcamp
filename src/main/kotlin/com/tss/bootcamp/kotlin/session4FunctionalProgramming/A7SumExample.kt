package com.tss.bootcamp.kotlin.session4FunctionalProgramming

fun sum(list: List<Int>): Int {
    var total = 0
    for (i in list) {
        total += i
    }
    return total
}

fun Iterable<Int>.sumWithLambda(selector: (Int) -> Int): Int {
    var sum = 0
    for (element in this) {
        sum += selector(element)
    }
    return sum
}

fun main() {
    println(sum(listOf(1, 2, 3)))
    println(listOf(1, 2, 3)
        .sumWithLambda { it }
    )
}
