package menuExample.whileExamples

import menuExample.mainMenu.Mainmenu

class WhileExample {

    fun whileExercise() {

        println("Este es un contador de numeros")
        println("Ingresa el numero que quieres mostrar en tu contador")
        val mainMenu = Mainmenu()
        val numb = mainMenu.optionSelected()

        var contador: Int = 0

        while (contador <= numb){
            println("Contador: $contador")
            contador++
        }
    }
}