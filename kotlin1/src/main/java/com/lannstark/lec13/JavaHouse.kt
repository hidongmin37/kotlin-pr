package com.lannstark.lec13


fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom) {


    // 기본적으로 바깥 클래스에 대한 연결이 없는 중첩클래스가 만들어진다.
    class LivingRoom(
        private val area: Double
    )

    inner class InnerLivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}
