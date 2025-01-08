package com.kotlin.play

data class Item(val name: String, val price: Int)                                      // 1

//data class Order(val items: Collection<Item>)
//
//fun Order.maxPricedItemValue(): Int = this.items.maxByOrNull { it.price }?.price ?: 0  // 2
//fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
//
//val Order.commaDelimitedItemNames: String                                              // 3
//    get() = items.joinToString { it.name }
data class Order(val items: Collection<Item>) {
    fun maxPricedItemValue(): Int = items.maxByOrNull { it.price }?.price ?: 0
    fun maxPricedItemName() = items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
    val commaDelimitedItemNames: String
        get() = items.joinToString { it.name }
}

fun main() {

    val order = Order(listOf(Item("빵", 5000), Item("와인", 29000), Item("생수", 1500)))

    println("가장 비싼 식료품: ${order.maxPricedItemName()}")                             // 4
    println("가장 비싼 가격: ${order.maxPricedItemValue()}")
    println("식료품: ${order.commaDelimitedItemNames}")                                  // 5

}
