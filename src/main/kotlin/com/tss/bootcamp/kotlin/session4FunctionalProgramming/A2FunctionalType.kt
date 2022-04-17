package com.tss.bootcamp.kotlin.session4FunctionalProgramming

// Desc: Functions can be assigned to a variable
fun discountFiveDollarsAssignable(price: Double): Double = price - 5.0
fun discountTenPercentAssignable(price: Double): Double = price * 0.9

// Desc: In the code below, ::discountFiveDollars is a function reference. We call it that because it refers to a function.
//       By assigning this function to a variable, it’s kind of like giving discountFiveDollars() another name.
//       Now we can call applyDiscount() the same way that we called discountFiveDollars(), and it does the same thing.
val applyDiscount = ::discountFiveDollarsAssignable
val discountedPrice = applyDiscount(20.0) // Result is 15.0

// Desc: So then, you might be wondering about the type of the applyDiscount variable.
//       A function’s type can be assembled by:
//         - Keeping its parentheses
//         - Keeping its types
//         - Converting the colon : to an arrow ->.

// Desc: So, the type of discountFiveDollars() is (Double) -> Double. Knowing this, you can now write the type of applyDiscount explicitly:

// Desc: Functions that have the same parameter types and return type - then you can assign (and reassign) those two functions to the same variable.

// Desc: To demonstrate this, let’s introduce a function to calculate the discount for a 10%-off coupon.
//       Since it has the same parameter and result types as discountFiveDollars(), we can assign either of these functions to the same variable.
fun main() {
    var applyDiscount = ::discountFiveDollarsAssignable
    applyDiscount = ::discountTenPercentAssignable
}

// Desc: For functions that have multiple parameters, keep in mind that the parameters must match in the same order.
//fun main() {
//    fun menuItemDescription(name: String, price: Double): String =
//        "A $name costs $price before discounts and tax."
//
//    fun sillyMenuItemDescription(price: Double, name: String): String =
//        "You want a $name? It's gonna run you $price, not counting coupons, tax, and whatnot!"
//
//    var describeMenuItem = ::menuItemDescription
////    describeMenuItem = ::sillyMenuItemDescription
//}