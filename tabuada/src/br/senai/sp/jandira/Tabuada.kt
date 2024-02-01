package br.senai.sp.jandira

fun main() {

    println("----- TABUADA -----")
    print("Insira o multiplicador: ")
    var multiplicador = readln().toInt()

    print("Insira o mínimo multiplicando: ")
    var min = readln().toInt()

    print("Insira o máximo multiplicando: ")
    var max = readln().toInt()

    if (min > max)
        max = min

    println("----- TABUADA -----")

    for (i in min..max){
        println("$multiplicador x $i = ${multiplicador * i}")
    }
    }

