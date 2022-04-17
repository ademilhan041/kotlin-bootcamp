package com.tss.bootcamp.kotlin.session2Functions.c5FunctionScopes

// Desc: Kotlin supports local functions, which are functions inside other functions and can access local variables of outer functions(the closure)
class LocalFunc {
    fun checkNumber(number: Int) {
        val threshold = 10

        fun isValid(number: Int) = threshold < number

        if (isValid(number)) {
            // todo...
        }
    }
}

// Desc: Top level function
fun topLevelFunction(): String = "this is a top level function"

// Desc: Functions can have generic parameters, which are specified using angle brackets before the function name:
fun <T> singletonList(item: T): List<T> = listOf()
val sStringList = singletonList("1")
val sIntList = singletonList(1)

