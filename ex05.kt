1   fun main() {
2       print("Digite um número inteiro: ")
3       val numero = readln().toInt()
4   
5       println("TABUADA DO $numero")
6       for (multiplicador in 1..10) {
7           val resultado = numero * multiplicador
8           println("$numero x $multiplicador = $resultado")
9       }
10  }
