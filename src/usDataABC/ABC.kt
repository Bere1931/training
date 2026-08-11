package usDataABC// realizar altas bajas y cambios

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val dataUs = DataUserABC()


    println("Ingresa tu nombre")
    val nameUs = scanner.nextLine()

    println("Ingresa tu edad")
    val ageUs = scanner.nextInt()
    scanner.nextLine()

    dataUs.name = nameUs
    dataUs.age = ageUs
    println("Tu nombre es: ${dataUs.name}")
    println("Tu edad es: ${dataUs.age}")

    var option: Int = -1

    while (option != 4) {


        println("Si deseas hacer un cambio por favor selecciona entre las siguientes opciones")
        println("1 -> Cambio de nombre")
        println("2 -> Cambio de edad")
        println("3 -> Borrar usuarios")
        println("4 -> Salir")

        option = scanner.nextInt()
        scanner.nextLine()

        when (option) {

            1 -> {
                println("Cambio de nombre")
                println("Coloca el nuevo nombre")
                val newName = scanner.nextLine()
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
                val finalName: String = dataUs.name
                val finalAge: Int = dataUs.age

                var optionEliminated: Int = -1

                while (optionEliminated != 4){
                    println("Esta opcion borra usuarios") // voy a meter un When aqui para que se seleccione la opción que se desea borrar
                    println("1 -> Borrar nombre")
                    println("2 -> Borrar la edad")
                    println("3 -> Borrar ambos datos")
                    println("4 -> Regresar al menú principal")
                    optionEliminated = scanner.nextInt()
                    scanner.nextLine()

                    when (optionEliminated) {

                        1 -> {

                            println("Esta opcion borra el nombre")
                            dataUs.name = ""
                            println("El nombre a sido eleminado")
                            println("La edad es: ${finalAge}")
                        }

                        2 -> {
                            println("Esta opcion borra la edad")
                            println("El nombres es: ${finalName}")
                            dataUs.age = 0
                            println("La edad ha sido eliminada")
                        }

                        3 -> {
                            println("Borrar ambos datos")
                            dataUs.name = ""
                            println("El nombre se ha borrado")
                            dataUs.age = 0
                            println("La edad se ha borrado")
                        }

                        4 -> {
                            break
                        }
                    }
                }
            }

            4 -> {
                break
            }
        }
    }
}