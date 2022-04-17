package com.tss.bootcamp.kotlin.session1Class.c4Inheritence

// Desc: All classes in Kotlin have a common superclass, Any, which is the default superclass for a class with no supertypes declared.
//       Any has three methods: equals(), hashCode(), and toString(). Thus, these methods are defined for all Kotlin classes.
//class Example // Implicitly inherits from Any

// Desc: By default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword
//open class Base

// Desc: To declare an explicit supertype, place the type after a colon in the class header
//open class BaseWithParam(p: Int)
//class Derived(p: Int) : BaseWithParam(p)
