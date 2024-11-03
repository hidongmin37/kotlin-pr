package com.lannstark.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }

} // void가 없고 Unit은 생략,Exception을 사용할때 new 를 던짐

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "S"
    }
} // kotlin에서는 if-else 바로 리턴가능

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithWhen(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
} // 코틀린에서는 case와 switch대신에 when과 화살표를 통해서 한다.

fun getGradeWithWhen2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
} //

fun startsWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("S")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}