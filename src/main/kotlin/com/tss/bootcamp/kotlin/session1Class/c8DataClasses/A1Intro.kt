package com.tss.bootcamp.kotlin.session1Class.c8DataClasses

// Desc: It is not unusual to create classes whose main purpose is to hold data. In such classes,
//       some standard functionality and some utility functions are often mechanically derivable from the data.
//       In Kotlin, these are called data classes and are marked with data:
//data class User(val name: String, val age: Int)

// Desc: The compiler automatically derives the following members from all properties declared in the primary constructor:
//         - equals()/hashCode() pair
//         - toString() of the form "User(name=Adem, age=32)"
//         - componentN() functions corresponding to the properties in their order of declaration.
//         - copy() function

// Desc: To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:
//         - The primary constructor needs to have at least one parameter.
//         - All primary constructor parameters need to be marked as val or var.
//         - Data classes cannot be abstract, open, sealed, or inner.

// Desc: The compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
//       To exclude a property from the generated implementations, declare it inside the class body
//data class Person(var name: String) {
//    var age: Int = 0
//}

// Desc: Copying
//data class Person(var name: String) {
//    var age: Int = 0
//}
//
//fun main() {
//    val p = Person("Adem")
//    val copy = p.copy(name = "Trendyol")
//}

// Desc: Destructuring declarations
//data class Person(val name: String, val lastname: String)
//
//fun main() {
//    val p = Person("Adem", "İlhan")
//    val (name, lastname) = p
//    println(name)
//    println(lastname)
//}
