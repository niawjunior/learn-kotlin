fun main() {
    val args: Array<String> = arrayOf("1", "2", "3", "4", "5")

    for (arg: String in args)
        println(arg)

    for (i in args.indices)
        println(args[i])
}