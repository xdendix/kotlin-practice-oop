package data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // contoh tanpa primary constructor
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramStreet, paramCity) {
        country = paramCountry
    }
}