package estructureSlack.whenForEstruc

import estructureSlack.menuPrincipal.MenuPrincipal

class ForEstructure {

        fun forNormal(){

            println("Ingresa tu primer numero:")
            val init0 = MenuPrincipal()
            val numb1 = init0.choseOne()
            println("Ingresa tu segundo nùmero")
            val init1 = MenuPrincipal()
            val numb2 = init1.choseOne()

            if (numb1 < numb2 ){

                for (i in numb1 .. numb2){
                    println(i)
                }
            } else println("Tu segundo numero no puede ser menor al primero")

        }

        fun forReverso(){
            println("Ingresa tu primer numero: ")
            val init2 = MenuPrincipal()
            val numb1 = init2.choseOne()
            println("Ingresa tu segundo numero: ")
            val init3 = MenuPrincipal()
            val numb2 = init3.choseOne()

            if (numb1 > numb2 ){

                for (i in numb1 downTo numb2){
                    println(i)
                }
            } else println("Tu segundo numero no puede ser mayor al primero")


        }

        fun forHastaNum(){
            println("Ingresa tu primer numero: ")
            val init4 = MenuPrincipal()
            val numb1 = init4.choseOne()
            println("Ingresa tu segundo numero: ")
            val init5 = MenuPrincipal()
            val numb2 = init5.choseOne()

            if (numb1 < numb2 ){

                for (i in numb1 until numb2){
                    println(i)
                }
            } else println("Tu segundo numero no puede ser menor al primero")

        }

        fun forInterva(){
            println("Ingresa tu primer numero: ")
            val init6 = MenuPrincipal()
            val numb1 = init6.choseOne()
            println("Ingresa tu segundo numero: ")
            val init7 = MenuPrincipal()
            val numb2 = init7.choseOne()
            println("Ingresa el intervalo entre numeros: ")
            val init8 = MenuPrincipal()
            val steps = init8.choseOne()

            if (numb1 < numb2 && steps > 0){

                for (i in numb1 .. numb2 step steps){
                    println(i)
                }
            } else println("Tu segundo numero no puede ser menor al primero y el salto de numero debe ser mayor a 0")

        }

        fun forLista(){

            println("Ingresa el primer nombre: ")
            val init9 = MenuPrincipal()
            val name = init9.choseOneText()
            println("Ingresa un segundo nombre: ")
            val init10 = MenuPrincipal()
            val name2 = init10.choseOneText()
            println("Ingresa un tercer nombre: ")
            val init11 = MenuPrincipal()
            val name3 = init11.choseOneText()

            val names = listOf(name, name2, name3)

            for (i in names){
                println(i)
            }
        }

        fun forListaIndice(){

            println("Ingresa el primer nombre: ")
            val init12 = MenuPrincipal()
            val name = init12.choseOneText()
            println("Ingresa un segundo nombre: ")
            val init13 = MenuPrincipal()
            val name2 = init13.choseOneText()
            println("Ingresa un tercer nombre: ")
            val init14 = MenuPrincipal()
            val name3 = init14.choseOneText()

            val names1 = listOf(name, name2, name3)

            for (nameless1 in names1.indices){
                println(nameless1)
            }
        }


    }
