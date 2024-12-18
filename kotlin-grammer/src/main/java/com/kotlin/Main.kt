fun main() {
    println("Hello, World!")
    val maxValue = max(5, 3)
    println("Max value is ${maxValue}")

    val minValue = min(5, 3)
    println("Min value is ${minValue}")

    // val 변수는 final과 같이 변경 불가능
    val question = "What's wrong?"
    val answer = 123
    val poet: String = "Let it be forgotten"
    val age:Int = 25

    // var는 변경 가능
    var changeable = "old"
    changeable = "new"



}


fun max(a: Int, b: Int): Int = if (a>b) a else b
fun min(a: Int, b: Int): Int = if (a<b) a else b