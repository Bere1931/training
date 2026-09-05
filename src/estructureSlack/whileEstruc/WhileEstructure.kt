package estructureSlack.whileEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class WhileEstructure {

    fun whileEstructure1(){

        while(true) {
            println("1. Continuar")
            println("2. Salir")
            val menuPrincipal = MenuPrincipal()
            val election = menuPrincipal.choseOne()
            if (election == 2) {
                println("Nos vemos")
                break
            }
        }
    }


}