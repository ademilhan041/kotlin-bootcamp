package com.tss.bootcamp.kotlin.session1Class.c9SealedClasses

// Desc: Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
//       All direct subclasses of a sealed class are known at compile time. No other subclasses may appear after a module
//       with the sealed class is compiled.
//       The same works for sealed interfaces and their implementations: once a module with a sealed interface is compiled,
//       no new implementations can appear.
//       In some sense, sealed classes are similar to enum classes: the set of values for an enum type is also restricted

// Desc: To declare a sealed class or interface, put the sealed modifier before its name
//sealed interface Operation
//sealed class CalcOperation : Operation
//class Add(val value: Int) : CalcOperation()
//class Substract(val value: Int) : CalcOperation()
//class Multiply(val value: Int) : CalcOperation()
//class Divide(val value: Int) : CalcOperation()
//
//class Calculator(private val ops: CalculatorOps) {
//
//    fun calculate(): Int {
//        var total = 0
//        ops.ops.forEach { total = executeEach(total, it) }
//        return total
//    }
//
//    private fun executeEach(x: Int, op: Operation): Int {
//        return when (op) {
//            is Add -> x + op.value
//            is Substract -> x - op.value
//            is Multiply -> x * op.value
//            is Divide -> x / op.value
//        }
//    }
//}
//
//class CalculatorOps(val ops: List<Operation> = emptyList()) {
//    operator fun plus(uiOp: Operation) = CalculatorOps(ops + uiOp)
//}
//
//fun main() {
//    println(
//        Calculator(
//            CalculatorOps() +
//                    Add(10) +
//                    Substract(1) +
//                    Multiply(6) +
//                    Divide(3)
//        ).calculate()
//    )
//}