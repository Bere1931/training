package menuExample.forExamples

import menuExample.mainMenu.Mainmenu

class WhenForExample {

    fun whenForExercise() {
        val mainMenu = Mainmenu()
        val option1 = mainMenu.optionSelected()

        when (option1) {
            1 -> {
                val forExample = Forexamples()
                forExample.forSimple()
            }

            2 -> {
                val forExample = Forexamples()
                forExample.forReversa()
            }

            3 -> {
                val forExample = Forexamples()
                forExample.forHasta()
            }

            4 -> {
                val forExample = Forexamples()
                forExample.forSteps()
            }

            5 -> {
                val forExample = Forexamples()
                forExample.forList()
            }

            6 -> {
                val forExample = Forexamples()
                forExample.forListaIndice()
            }
        }
    }
}
