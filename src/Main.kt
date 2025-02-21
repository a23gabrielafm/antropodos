fun main() {
    val n = readLine()!!.toInt()

    (1..n).forEach {
        val (insectos, aracnidos, crustaceos, escolopendras, anillos) = readLine()!!.split(" ").map { it.toInt() }

        val patas = listOf(
            insectos * 6,
            aracnidos * 8,
            crustaceos * 10,
            escolopendras * anillos * 2
        ).sum()

        println(patas)
    }
}