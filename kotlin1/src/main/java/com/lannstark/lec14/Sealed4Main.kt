package com.lannstark.lec14

fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println("아반떼")
        is Sonata -> println("소나타")
        is Grandeur -> println("그랜저")
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Int
)

class Avante : HyundaiCar("아반떼", 2000)
class Sonata : HyundaiCar("소나타", 3000)
class Grandeur : HyundaiCar("그랜저", 4000)