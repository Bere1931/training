package menuExample.forExamples

import menuExample.mainMenu.Mainmenu

class Forexamples {

    fun forSimple(){

        println("Ingresa tu primer numero:")
        val mainMenu = Mainmenu()
        val numb1 = mainMenu.optionSelected()
        println("Ingresa tu segundo nùmero")
        val mainMenu0 = Mainmenu()
        val numb2 = mainMenu0.optionSelected()

        if (numb1 < numb2 ){

            for (i in numb1 .. numb2){
                println(i)
            }
        } else println("Tu segundo numero no puede ser menor al primero")

    }

    fun forReversa(){
        println("Ingresa tu primer numero: ")
        val mainMenu1 = Mainmenu()
        val numb1 = mainMenu1.optionSelected()
        println("Ingresa tu segundo numero: ")
        val mainMenu2 = Mainmenu()
        val numb2 = mainMenu2.optionSelected()

        if (numb1 > numb2 ){

            for (i in numb1 downTo numb2){
                println(i)
            }
        } else println("Tu segundo numero no puede ser mayor al primero")


    }

    fun forHasta(){
        println("Ingresa tu primer numero: ")
        val mainMenu3 = Mainmenu()
        val numb1 = mainMenu3.optionSelected()
        println("Ingresa tu segundo numero: ")
        val mainMenu4 = Mainmenu()
        val numb2 = mainMenu4.optionSelected()

        if (numb1 < numb2 ){

            for (i in numb1 until numb2){
                println(i)
            }
        } else println("Tu segundo numero no puede ser menor al primero")

    }

    fun forSteps(){
        println("Ingresa tu primer numero: ")
        val mainMenu5 = Mainmenu()
        val numb1 = mainMenu5.optionSelected()
        println("Ingresa tu segundo numero: ")
        val mainMenu6 = Mainmenu()
        val numb2 = mainMenu6.optionSelected()
        println("Ingresa el intervalo entre numeros: ")
        val mainMenu7 = Mainmenu()
        val steps = mainMenu7.optionSelected()

        if (numb1 < numb2 && steps > 0){

            for (i in numb1 .. numb2 step steps){
                println(i)
            }
        } else println("Tu segundo numero no puede ser menor al primero y el salto de numero debe ser mayor a 0")

    }

    fun forList(){

        println("Ingresa el primer nombre: ")
        val mainMenu8 = Mainmenu()
        val name = mainMenu8.optionSelectedText()
        println("Ingresa un segundo nombre: ")
        val mainMenu9 = Mainmenu()
        val name2 = mainMenu9.optionSelectedText()
        println("Ingresa un tercer nombre: ")
        val mainMenu10 = Mainmenu()
        val name3 = mainMenu10.optionSelectedText()

        val names = listOf(name, name2, name3)

        for (i in names){
            println(i)
        }
    }

    fun forListaIndice(){

        println("Ingresa el primer nombre: ")
        val mainMenu11 = Mainmenu()
        val name = mainMenu11.optionSelectedText()
        println("Ingresa un segundo nombre: ")
        val mainMenu12 = Mainmenu()
        val name2 = mainMenu12.optionSelectedText()
        println("Ingresa un tercer nombre: ")
        val mainMenu13 = Mainmenu()
        val name3 = mainMenu13.optionSelectedText()

        val names1 = listOf(name, name2, name3)

        for (nameless1 in names1.indices){
            println(nameless1)
        }
    }


}