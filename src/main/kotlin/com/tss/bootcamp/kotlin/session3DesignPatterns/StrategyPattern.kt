package com.tss.bootcamp.kotlin.session3DesignPatterns

enum class DeliveryType { GO, STORE }

interface DeliveryStrategy {
    fun cancelPackage(deliveryId: Long, cancellationReason: String)
    fun deliveryType(): DeliveryType
}

class DeliveryGoStrategy : DeliveryStrategy {
    override fun cancelPackage(deliveryId: Long, cancellationReason: String) {
        println("Cancel by DeliveryGoStrategy")
    }

    override fun deliveryType() = DeliveryType.GO
}

class DeliveryStoreStrategy : DeliveryStrategy {
    override fun cancelPackage(deliveryId: Long, cancellationReason: String) {
        println("Cancel by DeliveryStoreStrategy")
    }

    override fun deliveryType() = DeliveryType.GO
}

class DeliveryStrategyFactory(private val deliveryStrategyList: List<DeliveryStrategy>) {
    fun decideStrategy(deliveryType: DeliveryType) = deliveryStrategyList.first { it.deliveryType() == deliveryType }
}

fun main() {
    val goStrategy = DeliveryGoStrategy()
    val storeStrategy = DeliveryStoreStrategy()
    val deliveryStrategies = listOf(goStrategy, storeStrategy)

    val deliveryStrategyFactory = DeliveryStrategyFactory(deliveryStrategies)

    deliveryStrategyFactory
        .decideStrategy(DeliveryType.GO)
        .cancelPackage(1L, "Fraud")
}