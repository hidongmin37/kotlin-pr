package com.lannstark.lec14



fun main() {
    val dto = PersonDto("장동민",100)
    val dto2 = PersonDto("장동민",200)
    println(dto == dto2)
    println(dto)


}

data class PersonDto(
    val name: String,
    val age: Int
)