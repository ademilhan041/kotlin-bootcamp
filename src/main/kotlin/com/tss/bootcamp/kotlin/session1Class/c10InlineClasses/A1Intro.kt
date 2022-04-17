package com.tss.bootcamp.kotlin.session1Class.c10InlineClasses

// Desc: Sometimes it is necessary for business logic to create a wrapper around some type.
//       However, it introduces runtime overhead due to additional heap allocations. Moreover, if the wrapped type is primitive,
//       the performance hit is terrible, because primitive types are usually heavily optimized by the runtime,
//       while their wrappers don't get any special treatment.

// Desc: To declare an inline class, use the value modifier before the name of the class
//@JvmInline
//value class Password(private val s: String)
// Desc: No actual instantiation of class 'Password' happens. At runtime 'securePassword' contains just 'String'

// Desc: Inline classes support some functionality of regular classes. In particular, they are allowed to declare properties and functions, and have the init block
//@JvmInline
//value class Name(val s: String) {
//    init {
//        require(s.isNotEmpty()) { }
//    }
//
//    val length: Int
//        get() = s.length
//
//    fun greet() {
//        println("Hello, $s")
//    }
//}
//
//fun main() {
//    val name = Name("Trendyol")
//    name.greet() // method `greet` is called as a static method
//    println(name.length) // property getter is called as a static method
//}

// Desc: Inline classes are allowed to inherit from interfaces:
//interface Printable {
//    fun prettyPrint(): String
//}
//
//@JvmInline
//value class Name(val s: String) : Printable {
//    override fun prettyPrint(): String = "Rock 'n Roll $s!"
//}
//
//fun main() {
//    val name = Name("Trendyol")
//    println(name.prettyPrint()) // Still called as a static method
//}

// Desc: Because inline classes may be represented both as the underlying value and as a wrapper, referential equality is pointless for them and is therefore prohibited
//@JvmInline
//value class Name(val s: String)
//
//fun main() {
//    val name1 = Name("Trendyol1")
//    val name2 = Name("Trendyol2")
//    println(name1 === name2)
//}