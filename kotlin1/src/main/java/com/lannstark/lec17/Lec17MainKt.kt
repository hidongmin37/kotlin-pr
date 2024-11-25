package com.lannstark.lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )



    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple3: (Fruit) -> Boolean
            = fun (fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    val isApple4: (Fruit) -> Boolean
          = {fruit: Fruit -> fruit.name == "사과"}

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    isApple2(fruits[0])


    filterFruits(fruits,isApple)
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" } // 마지막 파라미터값이 람다 함수 매개함수로 되어있다면,
    // 중괄호로 묶어서 밖으로 빼도됨.
    filterFruits(fruits) { it.name == "사과" }
}


private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean)
        : List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}