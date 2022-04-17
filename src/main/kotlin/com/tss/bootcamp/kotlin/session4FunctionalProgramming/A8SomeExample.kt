package com.tss.bootcamp.kotlin.session4FunctionalProgramming

fun filterFor2(list: IntRange): List<Int> {
    val filtered = mutableListOf<Int>()
    for (i in list) {
        if (i % 2 == 0) {
            filtered.add(i)
        }
    }
    return filtered
}

fun mapTimes2(list: List<Int>): List<Int> {
    val transformed = mutableListOf<Int>()
    for (i in list) {
        transformed.add(i * 2)
    }
    return transformed
}

fun print(list: List<Int>) {
    for (i in list) {
        print("$i ")
    }
}

fun main() {
    val list = 1..10

    val filtered = filterFor2(list)
    val mapped = mapTimes2(filtered)
    print(mapped)

    //print(mapTimes2(filterFor2(list)))

    println()

    list.filter { it % 2 == 0 }
        .map { it * 2 }
        .forEach { print("$it ") }
}
