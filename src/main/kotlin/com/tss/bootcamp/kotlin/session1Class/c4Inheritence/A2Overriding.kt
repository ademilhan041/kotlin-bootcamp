package com.tss.bootcamp.kotlin.session1Class.c4Inheritence

// Desc: Overriding methods

// Desc: Kotlin requires explicit modifiers for overridable members and overrides
//open class Shape {
//    open fun draw() {}
//    fun fill() {}
//}
//
//class Circle : Shape() {
//    override fun draw() {}
//}

// Desc: The override modifier is required for Circle.draw(). If it were missing, the compiler would complain.
//       If there is no open modifier on a function, like Shape.fill(), declaring a method with the same signature
//       in a subclass is not allowed, either with override or without it. The open modifier has no effect
//       when added to members of a final class – a class without an open modifier.
//class NotAllowedCircle : Shape() {
//    override fun draw() {}
//    override fun fill() {}
//    fun fill() {}
//}

// Desc: A member marked override is itself open, so it may be overridden in subclasses. If you want to prohibit re-overriding, use final
//open class AnotherShape {
//    open fun draw() {}
//}
//
//open class AnotherCircle : AnotherShape() {
//    final override fun draw() {}
//}
//
//class AnotherRadius : AnotherCircle() {
//    override fun draw() {}
//}


// Desc: In Kotlin, implementation inheritance is regulated by the following rule: if a class inherits multiple
//       implementations of the same member from its immediate superclasses, it must override this member and provide
//       its own implementation (perhaps, using one of the inherited ones).
//open class Rectangle {
//    open fun draw() {}
//}
//
//interface Polygon {
//    fun draw() {}
//}
//
//class Square : Rectangle(), Polygon {
//    // The compiler requires draw() to be overridden:
//    override fun draw() {
//        super<Rectangle>.draw() // call to Rectangle.draw()
//        super<Polygon>.draw() // call to Polygon.draw()
//    }
//}