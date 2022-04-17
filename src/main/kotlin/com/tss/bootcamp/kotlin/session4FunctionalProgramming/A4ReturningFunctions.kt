package com.tss.bootcamp.kotlin.session4FunctionalProgramming

// Desc: Functions can be returned as well as can be passed
fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> ::discountFiveDollars
    "TAKE_10"    -> ::discountTenPercent
    else         -> ::noDiscount
}

// Desc: Functions like calculateTotal() and discountForCouponCode() above, which accept functions as arguments
//       and/or return them as results, are called higher-order functions.

// Desc: A higher-order function is a function that takes functions as parameters, or returns a function.