package estructureSlack.whenEstruct

import estructureSlack.menuPrincipal.MenuPrincipal

class WhenEstructure {

    fun whenEstruct(){

        do{
            println("Selecciona una opcion")
            println("1. Decir Hola")
            println("2. Decir Adios")
            println("3. Regresa al menu anterior")

            val initial = MenuPrincipal()
            val started = initial.choseOne()

            when(started) {

                1 -> println("Hola")

                2 -> println("Adios")

                3-> println("Regresa al menu anterior")

            }
        }while (started != 3)

    }

}