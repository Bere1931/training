#!/usr/bin/env kotlin

import java.util.Scanner

fun main(){

    val func: Int
    var scanner = Scanner(System.`in`)

    if (func <1 || func > 3)
    do{
        println("Bienvenido")
        println("Cuento con el siguiente menu:")
        println("1.- Cuenta de uno en uno")
        println("2.- Cuenta de uno en uno sin considerar el número final")
        var func = scanner.nextInt()

    }
        while(func !=3)

    val name: String
    name = "Abe"
    name = "miguel"
}