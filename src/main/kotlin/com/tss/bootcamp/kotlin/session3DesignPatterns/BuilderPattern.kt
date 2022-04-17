package com.tss.bootcamp.kotlin.session3DesignPatterns

import com.tss.bootcamp.kotlin.session3DesignPatterns.Student.Companion.student

data class Student(
    val name: String,
    val standard: Int,
    val rollNumber: Int
) {

    private constructor(builder: Builder) : this(builder.name, builder.standard, builder.rollNumber)

    companion object {
        fun student(block: Builder.() -> Unit) = Builder()
            .apply { block(this) }
            .build()
    }

    class Builder {
        var name: String = ""
        var standard: Int = 0
        var rollNumber: Int = 0

        fun build() = Student(this)
    }
}

fun main() {
    fun createBuilder(builder: Student.Builder) {
        with(builder) {
            name = "Alex"
            standard = 10
            rollNumber = 710
        }
    }

    var student = student(::createBuilder)

    val block: Student.Builder.() -> Unit = {
        name = "Alex"
        standard = 10
        rollNumber = 710
    }
    student = student(block)

    student = student({
        name = "Alex"
        standard = 10
        rollNumber = 710
    })

    student = student {
        name = "Alex"
        standard = 10
        rollNumber = 710
    }

    println(student)
}