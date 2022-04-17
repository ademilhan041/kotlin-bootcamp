package com.tss.bootcamp.kotlin.session2Functions.c7ExtensionFunction

// Desc: Kotlin provides the ability to extend a class with new functionality without having to inherit from the class
//       or use design patterns such as Decorator. This is done via special declarations called extensions.

// Desc: To declare an extension function, prefix its name with a receiver type, which refers to the type being extended.
//  The following adds a swap function to MutableList<Int>:
//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1] // 'this' corresponds to the list
//    this[index1] = this[index2]
//    this[index2] = tmp
//}
//
//fun main() {
//    val list = mutableListOf(1, 2, 3)
//    list.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'list'
//}

// Desc: Extensions do not actually modify the classes they extend. By defining an extension, you are not inserting
//       new members into a class, only making new functions callable with the dot-notation on variables of this type.
//open class Shape
//class Rectangle: Shape()
//
//fun Shape.getName() = "Shape"
//fun Rectangle.getName() = "Rectangle"
//
//fun printClassName(s: Shape) {
//    println(s.getName())
//}
//
//fun main() {
//    printClassName(Shape())
//}

// Desc: Kotlin supports extension properties much like it supports functions:
//val <T> List<T>.lastIndex: Int
//    get() = size - 1

// Desc: Since extensions do not actually insert members into classes, there's no efficient way for an extension
//       property to have a backing field. This is why initializers are not allowed for extension properties.
//       Their behavior can only be defined by explicitly providing getters/setters.
//val String.magic = "magic" // error: initializers are not allowed for extension properties
//var String.magic: String
//    get() = ""
//    set(value) {
//        if (value == "")
//            field = value
//    }