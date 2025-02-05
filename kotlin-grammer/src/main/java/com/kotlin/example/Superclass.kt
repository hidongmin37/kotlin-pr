package com.kotlin.example

open class Parent(
    val familyName: String = "DefaultName",
) {

}


class Child(
    val subName: String,
    familyName: String
) : Parent(familyName) {}