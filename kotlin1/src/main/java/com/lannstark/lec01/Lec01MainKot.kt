package com.lannstark.lec01
/*
* 코틀린 변수를 다루는 방법
* */
class Lec01MainKot {

    fun main() {
        var number1 = 10L // 바꿀 수 있는
        number1 = 20L // 가능
        val number2 = 10L // 바꿀 수 없는
        // number2 = 20L  불가능

        var number3 :Long = 1 // 타입 명시

        var number4:Long // 초기값을 지정하지 않을때에는 타입 명시 필수
        // var number5 컴파일 에러

        /*
        * 숫자,문자, 불리언과 같은 몇몇 타입은
        * 내부적으로 특별한 표현을 갖는다.
        *
        * 이 타입들은 실행시에 Primitive Value로 표현되지만,
        * 코드에서는 평범한 클래스처럼 보인다.
        *
        * 즉, 프로그래머가 boxing / unboxing을 고려하지 않아도
        * 되도록 Kotiln이 알아서 처리 해준다.
        * */
        var number5 = 10L
        var number6 = 1000


        /// null이 들어갈 수 있는 것은 따로 간주
        // 기본적으로는 var에는 null이 들어갈 수 없음
        var number7: Long? = null // null이 들어갈 수 있음을 ?를 넣어서 표현


        /*자바와는 달리 코틀린에서는
         new를 쓰지 않고 객체 생성
        * */
        var person = Person("장동민")






    }
}