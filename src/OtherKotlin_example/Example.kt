package OtherKotlin_example

import kotlin.jvm.JvmStatic

object Example {
    @JvmStatic
    fun main(args: Array<String>) {
        var i = 1
        do {
            i++
            println("the values are$i")
        } while (i < 10)
    }
}