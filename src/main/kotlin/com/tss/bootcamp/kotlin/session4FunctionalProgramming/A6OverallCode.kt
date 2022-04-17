package com.tss.bootcamp.kotlin.session4FunctionalProgramming

// Desc: Overall Code
class Example {
    fun calculateTotal(
        initialPrice: Double,
        applyDiscount: (Double) -> Double
    ): Double {
        // Apply coupon discount
        val priceAfterDiscount = applyDiscount(initialPrice)
        // Apply tax
        val total = priceAfterDiscount * taxMultiplier

        return total
    }

    fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
        "FIVE_BUCKS" -> { price -> price - 5.0 }
        "TAKE_10" -> { price -> price * 0.9 }
        else -> { price -> price }
    }

    fun run() {
        val initialPrice = 20.0
        val couponDiscount = discountForCouponCode("FIVE_BUCKS")
        val total = calculateTotal(initialPrice, couponDiscount)
        println(total)
    }
}

fun main() {
    Example().run()
}
