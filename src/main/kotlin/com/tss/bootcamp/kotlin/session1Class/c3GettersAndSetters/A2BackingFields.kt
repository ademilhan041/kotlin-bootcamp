package com.tss.bootcamp.kotlin.session1Class.c3GettersAndSetters

// Desc: In Kotlin, a field is only used as a part of a property to hold its value in memory.
//       Fields cannot be declared directly. However, when a property needs a backing field, Kotlin provides it automatically.
//       This backing field can be referenced in the accessors using the field identifier
//class Person {
//    var name: String = "defaultValue"
//        set(value) {
//            if (value != "") field = value
//            // name = value // ERROR StackOverflow: Using actual name 'name' would make setter recursive
//        }
//
//    // there would be no backing field in the following case
//    val isNameExist: Boolean
//        get() = this.name.isEmpty()
//}