package datosUsuario

import java.util.*

fun main() {

    val scanner: Scanner = Scanner(System.`in`)
    val dataClass = DataUser()

    println("Por favor ingresa tu nombre")
    val nameUser = scanner.nextLine()
    println(nameUser)

    println("Por favor ingresa tu edad")
    val ageUser = scanner.nextInt()
    println(ageUser)

    scanner.nextLine()

    println("Por favor ingresa tu nacionalidad")
    val nationUser = scanner.nextLine()
    println(nationUser)

    val datoUser = DatosUsuario()
    datoUser.setName(nameUser)
    dataClass.name = nameUser
    datoUser.setAge(ageUser)
    dataClass.age = ageUser
    
    datoUser.setNationality(nationUser)
    dataClass.nationality = nationUser

    println("Tu nombre es:   ${datoUser.getName()}")
    println("Tu nombre es: ${dataClass.name}")
    println("Tu edad es:   ${datoUser.getAge()}")
    println("Tu edad es: ${dataClass.age}")
    println("Tu nacionalidad es:   ${datoUser.getNationality()}")
    println("Tu nacionalidad es: ${dataClass.nationality}")
}




/*fun main(){

            val datosUser = DatosUsuario()
            datosUser.datosUsuario()


        }*/
