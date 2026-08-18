package estructureSlack

import estructureSlack.menuPrincipal.MenuPrincipal

fun main() {

    while (true) {
        val menuPrime = MenuPrincipal()
        menuPrime.optionEstructure()
        menuPrime.chosenOne(menuPrime.choseOne())
        println("Esta opcion no es valida")
        break
    }
}

