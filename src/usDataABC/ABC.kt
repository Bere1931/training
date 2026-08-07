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
    scanner.nextLine()
    println(ageUs)

    dataUs.name = nameUs
    dataUs.age = ageUs

    println("Tu nombre es: ${dataUs.name}")
    println("Tu edad es: ${dataUs.age}")

do {
    println("Si deseas hacer un cambio por favor selecciona entre las siguientes opciones")
    println("1 -> Cambio de nombre")
    println("2 -> Cambio de edad")
    println("3 -> Borrar usuarios")
    println("4 -> Salir")

    fun option(): Int{
        val scanner = Scanner(System.`in`)
        return scanner.nextInt()
    }
    val selectOption = option()
    scanner.nextLine()

    when(selectOption) {

        1 -> {
            println("Cambio de nombre")
            println("Coloca el nuevo nombre")
            val newName = scanner.next()
            dataUs.name = newName
            println("El nombre actualizado es ${dataUs.name}")
            println("Tu edad es: ${dataUs.age}")
        }

        2 -> {
            println("Cambio de edad")
            println("Tu nombre es: ${dataUs.name}")
            println("Ingresa tu edad:")
            val newAge = scanner.nextInt()
            scanner.nextLine()
            dataUs.age = newAge
            println("Tu nombre es: ${dataUs.name}")
            println("La edad actualizada es: ${dataUs.age}")
        }

        3 -> {
            println("Esta opcion borra usuarios") // voy a meter un When aqui para que se seleccione la opción que se desea borrar

            do{
                println("1 -> Borrar nombre")
                println("2 -> Borrar la edad")
                println("3 -> Borrar ambos datos")

                val optionEliminated = option()
                scanner.next()

                when(optionEliminated){

                    1 -> {
                        println("Esta opcion borra el nombre")
                        dataUs.name = ""
                        println(dataUs.name)
                        println("La edad es: ${dataUs.age}")
                    }

                    2 -> {
                        println("Esta opcion borra la edad")
                        println("El nombres es: ${dataUs.name}")
                        dataUs.age = 0
                        println(dataUs.age)
                    }

                    3 -> {
                        println("Borrar ambos datos")
                        dataUs.name = ""
                        println("El nombre se ha borrado")
                        dataUs.age = 0
                        println("La edad se ha borrado")
                        break
                    }
                }
            } while(optionEliminated != 4)
        }

        4 -> {
        break}
    }
        } while (option() != 4)
}