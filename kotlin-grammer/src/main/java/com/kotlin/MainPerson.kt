import com.kotlin.*

fun main() {
    val developer = Developer("coco", true, "Kotlin")
    val marketer = Marketer("bravo",false,Division.DIGITAL)

    println("developer's special skill is ${getSpecialSkill(developer)}")
    println("marketer's special skill is ${getSpecialSkill(marketer)}")
}

