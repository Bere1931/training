package estructureSlack.whenForEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class WhenForEstructure {

    fun whenForEstruct() {

            val started = MenuPrincipal()
            val option1 = started.choseOne()

            when (option1) {
                1 -> {
                    val forEstruc1 = ForEstructure()
                    forEstruc1.forNormal()
                }

                2 -> {
                    val forEstruc2 = ForEstructure()
                    forEstruc2.forReverso()
                }

                3 -> {
                    val forEstruc3 = ForEstructure()
                    forEstruc3.forHastaNum()
                }

                4 -> {
                    val forEstruc4 = ForEstructure()
                    forEstruc4.forInterva()
                }

                5 -> {
                    val forEstruc5 = ForEstructure()
                    forEstruc5.forLista()
                }

                6 -> {
                    val forEstruc6 = ForEstructure()
                    forEstruc6.forListaIndice()
                }

        }
    }
}