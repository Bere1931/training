package other_examples.menuExample

import Person
import other_examples.menuExample.mainMenu.Mainmenu

fun main() {

    val person = Person()


    person.name = "MIke"

    val mainMenu = Mainmenu()


    var isRuning = true
    while(isRuning) {

        mainMenu.show()
        mainMenu.navigateToSelectedOption(mainMenu.optionSelected())


    }
}