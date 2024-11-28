package com.group.libraryapp.calculator

import com.group.libraryapp.Calculator

fun main() {
    val calculatorTest = CalculatorTest()
//    calculatorTest.multiplyTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {



    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)

//        val expectedResult = Calculator(8)
//        if (calculator != expectedResult) {
//            throw IllegalStateException()
//        }
        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {
        val calculator = Calculator(5)
        calculator.minus(3)

        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        val calculator = Calculator(5)
        calculator.multiply(3)

        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

    fun divideTest() {
        val calculator = Calculator(5)

        calculator.divide(3)

        if (calculator.number != 1) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {
        val calculator = Calculator(5)

        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            return
        } catch (e: Exception) {
            throw IllegalArgumentException()
        }

        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }
}