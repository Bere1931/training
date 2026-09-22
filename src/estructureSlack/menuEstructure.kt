package estructureSlack

import estructureSlack.menuPrincipal.MenuPrincipal

fun main() {

    while (true) {
        val menuPrime = MenuPrincipal()
        menuPrime.optionEstructure()
        menuPrime.chosenOne(menuPrime.choseOne())
    }
}

