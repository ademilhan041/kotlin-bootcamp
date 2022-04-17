package com.tss.bootcamp.kotlin.session4FunctionalProgramming

// Desc: With function reference
fun discountFiveDollars2(price: Double) = price - 5.0
val applyDiscount2: (Double) -> Double = ::discountFiveDollars2

// Desc: With şambda functions
val applyDiscountLambda: (Double) -> Double = { price: Double -> price - 5.0 }
val applyDiscountLambda2: (Double) -> Double = { price -> price - 5.0 }

// Desc: The Implicit it parameter
val applyDiscountLambda3: (Double) -> Double = { it - 5.0 }

// Desc: We can use lambda instead of function reference.
//       In cases where function’s last parameter is a function type, you can move the lambda argument outside of the parentheses to the right, like this:
val withFiveDollarsOffWithLambda = calculateTotal(20.0) { price -> price - 5.0 }  // $16.35
val withTenPercentOffWithLambda  = calculateTotal(20.0) { price -> price * 0.9 }  // $19.62
val fullPriceWithLambda          = calculateTotal(20.0) { price -> price }        // $21.80

// Desc: In Kotlin, writing the lambda outside of the parentheses like this is called trailing lambda syntax.
//       Regardless of whether you put that last lambda argument inside the parentheses or outside, it works exactly the same.
//       Kotlin developers usually prefer trailing lambdas, though.

// Desc: Returning Lambdas as Function Results
fun discountForCouponCodeWithReference(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> ::discountFiveDollars
    "TAKE_10"    -> ::discountTenPercent
    else         -> ::noDiscount
}

fun discountForCouponCodeWithLambda(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    else         -> { price -> price }
}