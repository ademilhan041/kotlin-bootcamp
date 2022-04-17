package com.tss.bootcamp.kotlin.session1Class.c11Objects

// Desc: An object declaration inside a class can be marked with the companion keyword:
//class Name {
//    companion object Factory {
//        val prefix = "_"
//        fun create(): Name = Name()
//    }
//}
//
//fun main() {
//    val created = Name.create()
//    println(Name.prefix)
//}

// Desc: Such objects can have supertypes
//interface Factory<T> {
//    fun create(name: String): T
//}
//
//data class Person(val name: String) {
//    companion object : Factory<Person> {
//        private const val prefix = "p_"
//        override fun create(name: String): Person {
//            return Person(prefix + name)
//        }
//    }
//}
//
//fun main() {
//    val f: Factory<Person> = Person
//    val person = f.create("Adem")
//    println(person)
//}
