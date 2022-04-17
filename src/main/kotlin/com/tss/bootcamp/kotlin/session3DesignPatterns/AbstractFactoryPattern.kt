package com.tss.bootcamp.kotlin.session3DesignPatterns

interface Fruit
data class OrangeFruit(val rate: Int = 5) : Fruit
data class AppleFruit(val rate: Int = 5) : Fruit

interface Liquid
data class WaterLiquid(val rate: Int = 5) : Liquid
data class AlcoholLiquid(val rate: Int = 5) : Liquid

data class Cocktail(val fruit: Fruit, val liquid: Liquid)

interface CocktailFactory {
    fun prepareFruit(): Fruit
    fun prepareLiquid(): Liquid
    fun asCocktail(): Cocktail
}

class AppleGuiceFactory : CocktailFactory {
    override fun prepareFruit(): Fruit = AppleFruit()
    override fun prepareLiquid(): Liquid = WaterLiquid()
    override fun asCocktail() = Cocktail(prepareFruit(), prepareLiquid())
}

class VodkaFactory : CocktailFactory {
    override fun prepareFruit(): Fruit = OrangeFruit()
    override fun prepareLiquid(): Liquid = AlcoholLiquid()
    override fun asCocktail() = Cocktail(prepareFruit(), prepareLiquid())
}

fun main() {
    val appleGuiceFactory = AppleGuiceFactory()
    val vodkaFactory = VodkaFactory()

    val order = "appleGuice"
//    val order = "vodka"
    when(order) {
        "appleGuice" -> println(appleGuiceFactory.asCocktail())
        "vodka" -> println(vodkaFactory.asCocktail())
        else -> println("Not defined!")
    }
}