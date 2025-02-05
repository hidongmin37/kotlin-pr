package com.kotlin.play

import kotlin.reflect.KProperty

class Example {
    open var p: String by Delegate()                                               // 1

    override fun toString() = "예제 클래스"
}

class Delegate() {
    private var backingField: String = ""  // 실제 값을 저장할 필드 추가

    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
        return if (backingField.isEmpty()) {
            "$thisRef, '${prop.name}' 속성을 위임했습니다!"
        } else {
            backingField  // 저장된 값이 있으면 그 값을 반환
        }
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$thisRef 인스턴스에 있는 ${prop.name} 속성으로 지정된 값은 ${value}입니다.")
//        prop.name = value // Error: Val cannot be reassigned 고치려면?

        // prop.name을 고치는 코드
        backingField = value  // 값을 저장
    }

}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
    println(e.p)
}