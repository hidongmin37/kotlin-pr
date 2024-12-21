package com.kotlin

open class Parent(
    val familyName: String = "DefaultName",
) {

}


class Child(
    val subName: String,
    familyName: String
) : Parent(familyName) {}