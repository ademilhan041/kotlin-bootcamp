package com.tss.bootcamp.kotlin.session2Functions.c1Arguments

// Desc: When you use named arguments in a function call, you can freely change the order they are listed in,
//       and if you want to use their default values, you can just leave these arguments out altogether.
fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) {
}

// Desc: When calling this function, you don’t have to name all its arguments:
val r1 = reformat(
    "String!",
    false,
    upperCaseFirstLetter = false,
    divideByCamelHumps = true,
    '_'
)

// Desc: You can skip all the ones with default values:
val r2 = reformat("This is a long String!")

// Desc: You are also able to skip specific arguments with default values, rather than omitting them all.
//       However, after the first skipped argument, you must name all subsequent arguments:
val r3 = reformat("This is a short String!", upperCaseFirstLetter = false, wordSeparator = '_')
