package OtherKotlin_example

import java.util.*
import kotlin.jvm.JvmStatic

object Condition {
    @JvmStatic
    fun main(args: Array<String>) {
        val grade: Char
        val sc = Scanner(System.`in`)
        println("input your grade")
        grade = sc.next()[0]
        when (grade) {
            'A' -> println("you are the best !Congratulation")
            'B' -> println("your work is good keep growing")
            'C' -> println("umm its ok but need hard work")
            else -> println("incorrect arguments")
        }
    }
}