package estructureSlack.whenEstruct

import estructureSlack.menuPrincipal.MenuPrincipal

class WhenEstructure {

    fun whenEstructure1(){
        do {
            println("¿Si tuvieras que elegir un color de la opciones mostradas que color seleccionarias?")
            println("Selecciona una opcion")
            println("1. Negro")
            println("2. Morado")
            println("3. Regresa al menu anterior")

            val initial = MenuPrincipal()
            val started = initial.choseOne()
            when(started) {

                1 -> println("Negro")

                2 -> println("Morado")

                3-> println("Regresa al menu anterior")

            }
            println("¿Te gustaria elegir nuevamente?")
            println("1. Si")
            println("2. No")
            val anotherTry = initial.choseOne()
        }while(anotherTry != 2)

    }

}