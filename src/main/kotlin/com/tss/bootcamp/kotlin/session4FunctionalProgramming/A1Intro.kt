package com.tss.bootcamp.kotlin.session4FunctionalProgramming

/*
Functional type
Functional references
Lambda expressions
Higher-Order Functions
*/

// Desc: Trendyol opens new salon for a clean haircut. Because of the opening, new coupons will be given to customers with value of $5.

val taxMultiplier = 1.09 // Tax is 9%, so we'll multiply by 109% to get the total with tax included.

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}

fun main() {
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))
}

// Desc: In some cases percentage based coupons will be applied. (Let's say 10%)
fun calculateTotalWithTenPercentDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice * 0.9
    val total = priceAfterDiscount * taxMultiplier

    return total
}

// Desc: When we look at these functions, we realize that they’re almost exactly the same, except for one small part - the part that calculates the discounted price.
//       initialPrice - 5.0
//       initialPrice * 0.9

// Desc: If we can pass a function that calculates discount, then we could consolidate two functions down to one function
//fun calculateTotalWithWhat(
//    initialPrice: Double,
//    applyDiscount: ??? // Functional Type
//): Double {
//    val priceAfterDiscount = applyDiscount(initialPrice)
//    val total = priceAfterDiscount * taxMultiplier
//
//    return total
//}