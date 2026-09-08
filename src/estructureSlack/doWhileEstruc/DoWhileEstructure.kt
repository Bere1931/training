package estructureSlack.doWhileEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class DoWhileEstructure {

    fun doWhileEstructure1(){

        do{
            println("Por favor selecciona la opcion que deseas")
            println("1.Continuar en este menu")
            println("2.Salir de este menu")
            val menuPrincipal = MenuPrincipal()
            val election = menuPrincipal.choseOne()
                if(election == 2){
                println("Nos vemos")
                break
                }

        } while(true)

    }
}