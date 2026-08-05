package datosUsuario

class DatosUsuario {
        private var name: String = ""
        private var nationality: String = ""
        private var age: Int = 0

        fun setName(nameIn: String){
                name = nameIn
        }

        fun getName(): String{
                return name
        }

        fun setNationality(nationalityIn: String){
                nationality = nationalityIn
        }

        fun getNationality(): String{
                return nationality
        }

        fun setAge(ageIn: Int){
                age = ageIn
        }

        fun getAge(): Int{
                return age
        }






}


