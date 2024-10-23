package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()
    println(result)


    val number5: Int? = 3
    val number6: Long = number5?.toLong()?: 0

    printAgeIfPersonObjIfNull(Person(null,100))

    val person = Person("장동민",100)
//    System.out.println(String.format("이름 : %s",person.name))
    println("이름 : ${person.name}")

    val name = "장동민"
    println("이름 : $name")

    val s = """
        이 이름은 ${name}
        
        너의 이름은 ${person.name}
    """.trimIndent()
    println(s)

    val str = "ABC"
    println(str[0])
    println(str[2])


}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        //val person = obj as Person 생략가능
        // println(person.age)
        println(obj.age)
    }
}

fun printAgeIfNotPerson(obj: Any) {
    if (obj !is Person) {
        println("obj is not a person")
    }
    if (!(obj is Person)) {
        println("obj is not a person")
    }
}

fun printAgeIfPersonObjIfNull(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

