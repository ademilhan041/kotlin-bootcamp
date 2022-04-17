package com.tss.bootcamp.kotlin.session1Class.c2Constructors

// Desc: If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
//       either directly or indirectly through another secondary constructor(s).
//       Delegation to another constructor of the same class is done using the "this" keyword
//class Person(val name: String) {
//    private var surname: String = ""
//
//    constructor(name: String, surname: String) : this(name) {
//        this.surname = surname
//    }
//}
