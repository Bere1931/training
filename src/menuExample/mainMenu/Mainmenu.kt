package menuExample.mainMenu

import menuExample.doWhile.DoWhileExample
import menuExample.forExamples.WhenForExample
import menuExample.ifElseExcercise.Ifelseexcercise
import menuExample.whenExample.WhenExample
import menuExample.whileExamples.WhileExample
import java.util.*


class Mainmenu {

    fun show(){
        println("seleccione una opcion")
        println("1.- if - else")
        println("2. - for")
        println("3. - while")
        println("4.- do - while")
        println("5.- when")
    }

    fun showForMenu() {
        println("1.-For simple")
        println("2.- For en reversa")
        println("3.- For hasta que...") //este es el for que lleva la palabra reservada until
        println("4.- For steps") // For por intervalos, el intervalo lo tiene que ingresar el usuario
        println("5.- For en listas") // For que te da un listado, el dato lo debe ingresar el usuario
        println("6.- For para recorrer listas con indices")
    }

    fun optionSelected(): Int {
        val scanner: Scanner = Scanner(System.`in`)
        return scanner.nextInt()

    }

    fun optionSelectedText(): String {
        val scanner: Scanner = Scanner(System.`in`)
        return scanner.nextLine()
    }

    fun navigateToSelectedOption(optionSelected: Int){
        when(optionSelected) {
            1 -> {
                val ifElseExercise = Ifelseexcercise()
                ifElseExercise.requestData()
            } // TO DO aqui va la funcion del caso del IF
            2 -> {
                showForMenu()
                val whenForExample = WhenForExample()
                whenForExample.whenForExercise()
            } // TO DO aqui mostraremos el para el FOR
            3 -> {
                val whileExamples = WhileExample()
                whileExamples.whileExercise()

            } // TO DO aquí mostraremos el ejemplo del while
            4 -> {
                val doWhileExamples = DoWhileExample()
                doWhileExamples.doWhileExercise()

            } // TO DO aqui mostraremos el ejemplo del do - while
            5 -> {
                val whenExamples = WhenExample()
                whenExamples.whenExercise()

            } // TO DO aqui mostraremos el ejemplo del when
        }

    }
}