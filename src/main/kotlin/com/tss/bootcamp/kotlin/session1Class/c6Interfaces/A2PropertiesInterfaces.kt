package com.tss.bootcamp.kotlin.session1Class.c6Interfaces

// Desc: Properties in interfaces

// Desc: You can declare properties in interfaces. A property declared in an interface can either be abstract or
//       provide implementations for accessors. Properties declared in interfaces can't have backing fields,
//       and therefore accessors declared in interfaces can't reference them:
//interface Writer {
//    val prop: String // abstract
//
//    val propertyWithImplementation: String
//        get() = "foo"
//
//    fun foo() {
//        print(prop)
//    }
//}
//
//class AnyWriter : Writer {
//    override val prop: String = "A"
//}