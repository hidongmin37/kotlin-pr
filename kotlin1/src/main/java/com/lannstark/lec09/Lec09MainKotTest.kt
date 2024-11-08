package com.lannstark.lec09

fun main() {
    val person = Person("장동민", 28)

    println(person.name)
    person.age = 10 // 사실 setter를 불러주는 것.

    println(person.age)

    val parson2 = Person("장동민")
    println(parson2.name)
    println(parson2.age )

    Person()

}

class Person(
    name:String,
    var age:Int
){
//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }
//
//    val uppercaseName: String
//        get() = this.name.uppercase()
//
//    val name = name
//        get() = field.uppercase()

    var name =name
        set(value) {
            field = value.uppercase()
        }


    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name,1){
        println("부생성자 1")
    }

    constructor(): this("홍길동"){
        println("부생성자 2")
    }


    fun isAdult(): Boolean{
        return this.age >= 20
    }
//
//    val isAdult:Boolean
//        get() = this.age >= 20
//
//    val isAdult2:Boolean
//        get() {
//            return this.age>=20
//        }



}