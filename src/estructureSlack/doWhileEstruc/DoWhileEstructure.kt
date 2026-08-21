package estructureSlack.doWhileEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class DoWhileEstructure {

    fun doWhileEstruct(){

        do{
            println("1.Continuar")
            println("2.Salir")
            val menuPrincipal = MenuPrincipal()
            val election = menuPrincipal.choseOne()
                if(election == 2){
                println("Nos vemos")
                break
                }

        } while(true)

    }
}