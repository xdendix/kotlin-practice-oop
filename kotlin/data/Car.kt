package data

class Car(
    paramBrand: String,
    paramName: String,
    paramYear: Int
) {

    // contoh Initializer Block
    init {
        println("Car $paramBrand dibuat")
    }

    // contoh secondary constructor 1
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2021) {
        println("Secondary Constructor 1")
    }

    // contoh secondary constructor 2
    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}