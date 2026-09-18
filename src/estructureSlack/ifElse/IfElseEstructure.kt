package estructureSlack.ifElse

import estructureSlack.menuPrincipal.MenuPrincipal

class IfElseEstructure {

    fun ifElseEstructure1() {


        do{
            val optionMenu = MenuPrincipal()
            println("Este ejercicio muestra si la suma de dos números es menor, mayor o igual a un número")
            println("Ingresa tu primer número")
            val num1 = optionMenu.choseOne()
            println("Ingresa tu segundo número")
            val num2 = optionMenu.choseOne()
            println("Ingresa tu número para comparativa")
            val num3 = optionMenu.choseOne()

            if (num1 + num2 < num3) {
            println("la suma es ${num1 + num2} que es menor a $num3")
            } else if (num1 + num2 > num3) {
            println("${num1 + num2} es mayor al número $num3")
            } else println("${num1 + num2} es igual al número $num3")


            println("¿Deseas generar otra serie de números nones?")
            println("1 .- Generar nueva serie")
            println("2 .- Regresar al menu principal")
            val elect = optionMenu.choseOne()
        }while (elect != 2)
            println("Bye")
        }
}

