package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    // contoh function
    fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.firstName}")
    }

    // contoh function overloading (parameter dan tipe data harus berbeda, maupun jumlah parameternya)
    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, My Name is $firstName")
    }

    // contoh this keyword
    fun hello(firstName: String, lastName: String) {
        println("Hallo $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}