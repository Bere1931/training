package estructureSlack.whenForEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class WhenForEstructure {

    fun whenForEstructure2() {
        do{
            val started = MenuPrincipal()
            val option1 = started.choseOne()
            when (option1) {
                1 -> {
                    val forEstructure3 = ForEstructure()
                    forEstructure3.forNormal()
                }

                2 -> {
                    val forEstructure4 = ForEstructure()
                    forEstructure4.forReverso()
                }

                3 -> {
                    val forEstructure5 = ForEstructure()
                    forEstructure5.forHastaNum()
                }

                4 -> {
                    val forEstructure6 = ForEstructure()
                    forEstructure6.forInterva()
                }

                5 -> {
                    val forEstructure7 = ForEstructure()
                    forEstructure7.forLista()
                }

                6 -> {
                    val forEstructure8 = ForEstructure()
                    forEstructure8.forListaIndice()
                }
                7 -> {
                    println("Regreso al menu principal")
                }
            }
            started.forEstructure()
        }while(option1 != 7)
    }
}