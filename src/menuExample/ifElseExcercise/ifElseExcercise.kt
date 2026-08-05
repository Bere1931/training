package menuExample.ifElseExcercise

import menuExample.mainMenu.Mainmenu

class Ifelseexcercise {

    fun requestData(){
        println("Ingresa tu edad PLS")
        val mainMenu = Mainmenu()
        val age = mainMenu.optionSelected()

        if (age > 18) println("Cancha reglamentaria")
        else println("Al tiro esto es carcel")
    }

}
