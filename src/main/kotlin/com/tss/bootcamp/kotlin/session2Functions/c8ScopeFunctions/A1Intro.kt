package com.tss.bootcamp.kotlin.session2Functions.c8ScopeFunctions

// Desc: The Kotlin contains several functions whose sole purpose is to execute a block of code within the context of an object.
//       When you call such a function on an object with a lambda expression provided, it forms a temporary scope.
//       In this scope, you can access the object without its name. Such functions are called scope functions.
//       There are five of them: let, apply, also, run and with
//       Basically, these functions do the same: execute a block of code on an object.
//       What's different is how this object becomes available inside the block and what is the result of the whole expression.

// Desc: The scope functions do not introduce any new technical capabilities, but they can make your code more concise and readable.

// Desc: Example usage
//data class Person(val name: String, val age: Int, val city: String) {
//    fun moveTo(newCity: String) {}
//
//    fun incrementAge() {}
//}
//
//fun normal() {
//    val alice = Person("Alice", 20, "Amsterdam")
//    println(alice)
//    alice.moveTo("London")
//    alice.incrementAge()
//    println(alice)
//}
//
//fun withScopeFunction() {
//    Person("Alice", 20, "Amsterdam").let {
//        println(it)
//        it.moveTo("London")
//        it.incrementAge()
//        println(it)
//    }
//}

// Desc: Let: The context object is available as an argument (it). The return value is the lambda result.
//            let can be used to invoke one or more functions on results of call chains. For example,
//            the following code prints the results of two operations on a collection:
//class Let {
//    fun asis() {
//        val numbers = mutableListOf("one", "two", "three", "four", "five")
//        val resultList = numbers.map { it.length }.filter { it > 3 }
//        println(resultList)
//    }
//
//    fun letExample() {
//        val numbers = mutableListOf("one", "two", "three", "four", "five")
//        val filteredNumbers = numbers.map { it.length }.filter { it > 3 }.let {
//            println(it)
//            // and more function calls if needed
//            it
//        }
//        println(filteredNumbers.size == 3)
//    }
//}
//
//fun main() {
//    Let().letExample()
//}

// Desc: With: A non-extension function: the context object is passed as an argument,
//             but inside the lambda, it's available as a receiver (this). The return value is the lambda result.
//             It is recommended with for calling functions on the context object without providing the lambda result.
//             In the code, with can be read as “with this object, do the following".
//class With {
//    fun withExample() {
//        val numbers = mutableListOf("one", "two", "three")
//        with(numbers) {
//            println("'with' is called with argument $this")
//            println("It contains $size elements")
//        }
//    }
//}

// Desc: Run: The context object is available as a receiver (this). The return value is the lambda result.
//            run does the same as with but invokes as let - as an extension function of the context object.
//            run is useful when your lambda contains both the object initialization and the computation of the return value.
//data class MultiportService(val url: String, var port: Int) {
//    fun query(statement: String): String {
//        println(statement)
//        return statement
//    }
//    fun prepareRequest(): String = ""
//}
//
//fun main() {
//    val service = MultiportService("https://example.kotlinlang.org", 80)
//
//    val result = service.run {
//        port = 8080
//        query(prepareRequest() + " to port $port")
//    }
//
//    // the same code written with let() function:
//    val letResult = service.let {
//        it.port = 8080
//        it.query(it.prepareRequest() + " to port ${it.port}")
//    }
//
//    println(result == letResult)
//}

// Desc: Apply: The context object is available as a receiver (this). The return value is the object itself.
//              Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object.
//              The common case for apply is the object configuration. Such calls can be read as "apply the following assignments to the object".
//data class Person(val name: String, var age: Int = 0, var city: String = "")
//fun main() {
//
//    val adem = Person("Adem").apply {
//        age = 32
//        city = "London"
//    }
//    println(adem)
//}

// Desc: Also: The context object is available as an argument (it). The return value is the object itself.
//             When you see also in the code, you can read it as "and also do the following with the object"
//fun main() {
//    val numbers = mutableListOf("one", "two", "three")
//    numbers
//        .also { println("The list elements before filtering: $it") }
//        .filter { it.length > 3 }
//        .also { println("The list elements after filtering: $it") }
//}
