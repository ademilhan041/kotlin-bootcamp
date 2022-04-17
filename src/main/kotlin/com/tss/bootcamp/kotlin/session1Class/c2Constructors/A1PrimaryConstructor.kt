package com.tss.bootcamp.kotlin.session1Class.c2Constructors

//class Person constructor(name: String) {}

// Desc: If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted
//class Person(name: String) {}

// Desc: The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks prefixed with the init keyword.
//class Person(name: String) {
//    var modifiedName: String = ""
//
//    init {
//        modifiedName = name.uppercase()
//    }
//}

// Desc: Primary constructor parameters can be used in the initializer blocks. They can also be used in property initializers declared in the class body
//class Person(name: String) {
//    var modifiedName: String = name.uppercase()
//}

// Desc: Properties and initializing can be declared in primary constructor
//class Person(val name: String, val surname: String, var age: Int)

// Desc: Such declarations can also include default values of the class properties
//class Person(val name: String = "Adem", val surname: String = "İlhan", val age: Int = 32)

// Desc: You can use a trailing comma when you declare class properties
//class Person(
//    val name: String,
//    val surname: String,
//    var age: Int,
//)

// Desc: If the constructor has annotations or visibility modifiers, the constructor keyword is required and the modifiers go before it
//class Person @Deprecated(message = "") private constructor(name: String)