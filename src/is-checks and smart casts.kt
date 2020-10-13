fun main(args: Array<String>) {
    println(getStringLength("aa"))
    println(getStringLength(2))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length
    return null
}