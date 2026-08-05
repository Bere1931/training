package menuExample.whenExample

import menuExample.mainMenu.Mainmenu

class WhenExample {

    fun whenExercise() {

        println("Cuento con el siguiente menu")
        println("Selecciona una opcion por favor")
        println("1.- Consultar saldo")
        println("2.- Realizar un pago")
        println("3.- Salir")

        val mainMenu = Mainmenu()
        val options = mainMenu.optionSelected()

        when (options) {
            1 -> println("1.- Consultar saldo")
            2 -> println("2.- Realizar un pago")
            3 -> println("3.- Salir")
            else -> println("Opcion invalida")
        }
    }
}