package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Name is called")
        "Dendi"
    }

    // contoh observable properties
    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is change from $oldValue to $newValue")
    }
}