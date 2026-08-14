package estructureSlack.menuPrincipal

import java.util.Scanner
import estructureSlack.menuPrincipal.ifElse.IfElseEstructure

class MenuPrincipal {

    fun optionEstructure(){

        println("Este menu despliega las siguientes estructuras")
        println("1. If - Else")
        println("2. While")
        println("3. Do - While")
        println("4. When")
        println("5. For")
        println("Selecciona la opción que deseas resolver")
    }

    fun choseOne(): Int {
        val scanner: Scanner = Scanner(System.`in`)
        return scanner.nextInt()

    }

    fun choseOneText(): String {
        val scanner: Scanner = Scanner(System.`in`)
        return scanner.nextLine()
    }

    fun chosenOne(choseOne: Int){

        when(choseOne){

            1 -> {
                val ifElse = IfElseEstructure()
                ifElse.ifElseEstru()
            //Aqui se mostrara la estructura If - Else
            }

            2 -> {

                //Aqui se mostrara la estructura While
            }

            3 -> {
                //Aqui se mostrara la estructura Do -While
            }

            4 -> {
                //Aqui se mostrara la estructura When
            }

            2 -> {
                //Aqui se mostrara la estructura For
            }
        }
    }
}