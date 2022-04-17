package com.tss.bootcamp.kotlin.session2Functions.c4Infix

// Desc: Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call).
//       Infix functions must meet the following requirements:
//        - They must be member functions or extension functions.
//        - They must have a single parameter.
//        - The parameter must not accept variable number of arguments and must have no default value.

infix fun Int.add(x: Int): Int {
    return this + x
}

// calling the function using the infix notation
val addResponse1 = 1 add 2

// is the same as
val addResponse2 = 1.add(2)

// Desc: Infix function calls have lower precedence than arithmetic operators, type casts, and the rangeTo operator. The following expressions are equivalent:
//        - 1 shl 2 + 3           is equivalent to -> 1 shl (2 + 3)
//        - 0 until n * 2         is equivalent to -> 0 until (n * 2)
//        - xs union ys as Set<*> is equivalent to -> xs union (ys as Set<*>)