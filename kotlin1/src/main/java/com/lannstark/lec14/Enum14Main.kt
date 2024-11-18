package com.lannstark.lec14

fun handleCountry(country: Country) {
    when (country) {  // 이런식으로 enum에 있는것을 모두 다 처리하지 않을 경우 warning이 발생한다.
        Country.KOREA -> println("한국")
        Country.AMERICA -> println("미국")
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    JAPAN("JP"),
}