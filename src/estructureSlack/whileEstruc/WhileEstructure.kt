package estructureSlack.whileEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class WhileEstructure {

    fun whileEstructure1(){

        while(true) {
            println("Menude dos opciones, si quieres seguir en este debes seleccionar la opción 1")
            println("si quieres salir selecciona la opcion dos y regresaras al menu principal")
            println("1. Continuar en este menu")
            println("2. Salir de este menu")
            val menuPrincipal = MenuPrincipal()
            val election = menuPrincipal.choseOne()
            if (election == 2) {
                println("Nos vemos")
                break
            }
        }
    }


}