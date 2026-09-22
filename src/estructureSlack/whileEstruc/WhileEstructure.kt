package estructureSlack.whileEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class WhileEstructure {

    fun whileEstructure1() {

        val menuPrincipal = MenuPrincipal()
        println("Esta opcion genera un listado de números pares donde se requiere ingreses el numero inicial y el numero limite")
        println("Ingresa tu numero par inicial")
        var numberinitial = menuPrincipal.choseOne()
        while (numberinitial % 2 != 0) {
            println("recuerda que es un listado de numeros pares, debes elegir un número par inicial")
            numberinitial = menuPrincipal.choseOne()
        }
        println("Ingresa tu numero par final")
        val numberfinal = menuPrincipal.choseOne()
        if (numberfinal % 2 != 0) println("recuerda que es un listado de numeros pares, debes elegir un número par final")
        while (numberinitial <= numberfinal) {
            println(numberinitial)
            numberinitial += 2
        }
        println("¿Deseas generar otra serie de números nones?")
        println("1 .- Generar nueva serie")
        println("2 .- Regresar al menu principal")
        val outwhile = menuPrincipal.choseOne()
        while (outwhile != 2) {
            println("Bye")
        }
    }
}