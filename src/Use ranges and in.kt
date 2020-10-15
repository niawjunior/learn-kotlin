fun main() {
    val args: Array<String> = arrayOf("4", "2")
    val x = args[0].toInt()
    val y = 10

    //Check if a number lies within a range:
    if (x in 1 until y - 1)
        println("OK")

    //Check if a number is out of range:
    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0 until array.size - 1)
        println("Out: array has only ${array.size} elements. x = $x")

    //Check if a collection contains an object:
    if ("aaa" in array)
        println("Yes: array contains aaa")

    if ("ddd" in array)
        println("Yes: array contains ddd")
    else
        println("No: array doesn't contains ddd")
}

