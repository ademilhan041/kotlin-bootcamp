package com.tss.bootcamp.kotlin.session2Functions.c1Arguments

// Desc: Function parameters can have default values, which are used when you skip the corresponding argument. This reduces the number of overloads
fun query(
    sql: String,
    page: Int = 0,
    size: Int = 20,
) {
}

// Desc: Overriding methods always use the same default parameter values as the base method.
//       When overriding a method that has default parameter values, the default parameter values must be omitted from the signature
open class A {
    open fun foo(i: Int = 10) {}
}

class B : A() {
    override fun foo(i: Int) {}  // No default value is allowed.
}

// Desc: If a default parameter precedes a parameter with no default value, the default value can only be used by calling the function with named arguments
fun query2(
    bar: Int = 0,
    baz: Int,
) {}
val result = query2(baz = 1) // The default value bar = 0 is used
