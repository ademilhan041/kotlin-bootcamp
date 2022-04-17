package com.tss.bootcamp.kotlin.session2Functions.c6OperatorOverloading

// Desc: Kotlin allows you to provide custom implementations for the predefined set of operators on types.
//       These operators have predefined symbolic representation (like + or *) and precedence

// Desc: To overload an operator, mark the corresponding function with the operator modifier:
class OrdersList {
    operator fun get(index: Int) {}

    fun main() {
        val a = OrdersList()
        val a1 = a[0]
    }
}

// Desc: List of operations
//       Unary operations
//       Expression      Translated to
//       +a              a.unaryPlus()
//       -a              a.unaryMinus()
//       !a              a.not()
//       ---
//       Increment and decrement operations
//       Expression      Translated to
//       a++             a.inc()
//       a--             a.dec()
//       ---
//       Arithmetic operations
//       Expression      Translated to
//       a + b           a.plus(b)
//       a - b           a.minus(b)
//       a * b           a.times(b)
//       a / b           a.div(b)
//       a % b           a.rem(b)
//       a..b            a.rangeTo(b)
//       ---
//       In operations
//       Expression      Translated to
//       a in b          b.contains(a)
//       a !in b         !b.contains(a)
//       ---
//       Indexed access operations
//       Expression      Translated to
//       a[i]            a.get(i)
//       a[i] = b        a.set(i, b)
//       ---
//       Invoke operations
//       Expression      Translated to
//       a()             a.invoke()
//       a(i)            a.invoke(i)
//       ---
//       Augmented assignments operations
//       Expression      Translated to
//       a += b          a.plusAssign(b)
//       List goes on for augment as minusAssign, timesAssign, divAssign, remAssign
//       ---
//       Equality and inequality operations
//       Expression      Translated to
//       a == b          a?.equals(b) ?: (b === null)
//       a != b          !(a?.equals(b) ?: (b === null))
//       ---
//       Comparison operations
//       Expression      Translated to
//       a > b           a.compareTo(b) > 0
//       List goes on for lessThan, greaterThanOrEqual, lessThanOrEqual



// Desc: Some example for unary operator
//data class Point(val x: Int, val y: Int) {
//    operator fun unaryMinus() = Point(-x, -y)
//
//    companion object {
//        val point = Point(10, 20)
//    }
//}
//
//fun main() {
//    println(-Point.point)  // prints "Point(x=-10, y=-20)"
//}