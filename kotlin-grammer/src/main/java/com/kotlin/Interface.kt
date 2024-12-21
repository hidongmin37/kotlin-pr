package com.kotlin

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("Button is clicked")
    }
}

fun main() {
    Button().click()
}