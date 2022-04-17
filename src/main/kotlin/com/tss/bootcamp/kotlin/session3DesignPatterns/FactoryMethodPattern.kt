package com.tss.bootcamp.kotlin.session3DesignPatterns

sealed class Country
object USA : Country()
object Spain : Country()
class Greece(val someProperty: String) : Country()
data class Canada(val someProperty: String) : Country()

class Currency(val code: String)

object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Greece -> Currency("EUR")
            is Spain -> Currency("EUR")
            is USA -> Currency("USD")
            is Canada -> Currency("CAD")
        }
}

fun main() {
    val greeceCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
    println("Greece currency: $greeceCurrency")

    val usaCurrency = CurrencyFactory.currencyForCountry(USA).code
    println("USA currency: $usaCurrency")
}