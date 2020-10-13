import java.lang.NumberFormatException

fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("one of the arguments isn't Int")
    }
    return null
}

fun main() {
    val args: Array<String> = arrayOf("5", "2")
    if (args.size < 2) {
        println("No number applied")
    } else {
        val x = parseInt(args[0])
        val y = parseInt(args[1])

        if (x != null && y != null) {
            println(x * y)
        } else {
            println("One of the arguments is null")
        }
    }
}