package org.example

fun main() {
    val alunos = arrayListOf("André", "Carla", "Marcos")
    for ((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno \n")
    }
}