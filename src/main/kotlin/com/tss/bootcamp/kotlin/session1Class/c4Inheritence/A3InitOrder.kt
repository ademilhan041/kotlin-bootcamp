package com.tss.bootcamp.kotlin.session1Class.c4Inheritence

// Desc: During the construction of a new instance of a derived class, the base class initialization is done as the
//       first step (preceded only by evaluation of the arguments for the base class constructor), which means that it happens
//       before the initialization logic of the derived class is run.
//open class Base(name: String) {
//    init { println("Initializing a base class") }
//
//    open val size: Int =
//        name.length.also { println("Initializing size in the base class: $it") }
//}
//
//class Derived(
//    name: String,
//    lastName: String,
//) : Base(name.also { println("Argument for the base class: $it") }) {
//    init { println("Initializing a derived class") }
//
//    override val size: Int =
//        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
//}
//
//fun main() {
//    Derived("Adem", "İlhan")
//}