package data

class Student(val name: String, val age: Int)

fun Student.sayHello(name: String) {
    println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
}

// contoh extension properties
val Student.upperName: String
    get() = this.name.uppercase()