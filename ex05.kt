fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    println("TABUADA DO $numero")
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}
