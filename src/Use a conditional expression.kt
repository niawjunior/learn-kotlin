fun main(args: Array<String>) {
    println(max(10, 20))
    println(max(20, 10))
}

fun max(a: Int, b: Int) = if (a > b) a else b