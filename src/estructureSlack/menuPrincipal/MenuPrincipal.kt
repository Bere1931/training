package estructureSlack.menuPrincipal

import java.util.Scanner
import estructureSlack.ifElse.IfElseEstructure
import estructureSlack.whileEstruc.WhileEstructure
import estructureSlack.doWhileEstruc.DoWhileEstructure
import estructureSlack.whenEstruct.WhenEstructure
import estructureSlack.whenForEstruc.WhenForEstructure

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

    fun forEstructure(){
        println("1. For normal")
        println("2. For al reverso")
        println("3. For hasta que cierto numero")
        println("4. For por intervalos")
        println("5. For lista")
        println("6. For para recorrer listas con indices")
        println("7. Regresa al menu principal")
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
        when (choseOne) {
            1 -> {
                val ifElse = IfElseEstructure()
                ifElse.ifElseEstru()
                    //Aqui se mostrara la estructura If - Else
                }

            2 -> {
                val whileEs = WhileEstructure()
                whileEs.whileEstruct()
                    //Aqui se mostrara la estructura While
                }

            3 -> {
                val doWhileEs = DoWhileEstructure()
                doWhileEs.doWhileEstruct()
                    //Aqui se mostrara la estructura Do -While
                }

            4 -> {
                val whenEs = WhenEstructure()
                whenEs.whenEstruct()
                    //Aqui se mostrara la estructura When
                }

            5 -> {
                forEstructure()

                    val ultimate = choseOne()
                while(ultimate != 6){
                    val whenForEs = WhenForEstructure()
                    whenForEs.whenForEstruct()
                //Aqui se mostrara la estructura For
                    }
                }
        }
    }
}