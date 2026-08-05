package usDataABC// realizar altas bajas y cambios

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val dataUs = DataUserABC()

    println("Ingresa tu nombre")
    val nameUs = scanner.nextLine()
    println(nameUs)

    println("Ingresa tu edad")
    val ageUs = scanner.nextInt()
    println(ageUs)

    dataUs.name = nameUs
    dataUs.age = ageUs

    println("Tu nombre es: ${dataUs.name}")
    println("Tu edad es: ${dataUs.age}")


    println("Si deseas hacer un cambio por favor selecciona entre las siguientes opciones")
    println("1 -> Cambio de nombre")
    println("2 -> Cambio de edad")
    println("3 -> Borrar usuarios")
    println("Salir")

    fun option(): Int{
        val scanner = Scanner(System.`in`)
        return scanner.nextInt()
    }

    when(option()) {

        1 -> {
            println("Cambio de nombre")
            println("Coloca el nuevo nombre")
            val newName = scanner.nextLine()
            print(newName)
            println("El nombre es $newName")
            println("Tu edad es: ${dataUs.age}")
        }

        2 -> {
            println("Cambio de edad")
            println()
        }

        3 -> {
            println("Esta opcion borra usuarios")

        }
    }
}