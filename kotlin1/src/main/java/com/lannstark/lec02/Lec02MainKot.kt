package com.lannstark.lec02

fun main() {

    val str: String? = "ABC"
    // str.length 불가능
    str?.length // 가능
    println(str?.length)

    val str1: String? = null
    println(str1?.length)

    println(str1?.length ?: 1) // Elvis 연산자 앞의 연산 결과가 null이면 뒤의 값사용

}

fun startsWithA1(str: String?):Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA1ToKot(str: String?):Boolean {
    return str?.startsWith("A")?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?):Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}
fun startsWithA2ToKot(str: String?):Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?):Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3ToKot(str: String?):Boolean {
    return str?.startsWith("A")?:false
}

fun calculate(number:Long?): Long {
    return number ?: 0
}

/*
* 혹시나 Null이 들어오면 NPE가 나오기 때문에
* 정말 null이 아닌게 확실한 경우에만 널 아님 단언!!을 사용해야한다.*/
fun startsWithMarkMark(str: String?): Boolean {
    return str!!.startsWith("A") //!!(느낌표 두개는 절대 null이 아니다)
}