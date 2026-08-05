package menuExample.doWhile

import menuExample.mainMenu.Mainmenu

class DoWhileExample {

    fun doWhileExercise() {
        println("Este es un contador de numeros")
        println("Ingresa el numero que quieres mostrar en tu contador")
        val mainMenu = Mainmenu()
        val numb = mainMenu.optionSelected()

        var contador: Int = 0

       do {
            println("Contador: $contador")
            contador++
        } while (contador <= numb)
    }
}