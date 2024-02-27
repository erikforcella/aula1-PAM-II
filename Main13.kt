package org.example

fun main() {
    val nota = 4
    when(nota) {
        10, 9 -> println("Fantástico")
        8, 7 -> println("Parabéns")
        6, 5, 4 -> println("Tem como recuperar")
        in 3 .. 0 -> print("Te vejo no próximo ano")
        else -> print("Nota inválida")
    }
}