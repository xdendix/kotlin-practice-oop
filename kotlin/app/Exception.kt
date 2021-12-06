package app

import exception.MultipleCatch
import exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun multipleCatch(name: String) {
    if (name.isBlank()) {
        throw MultipleCatch("Multiple Catch Error")
    } else {
        println("Hello $name")
    }
}

fun main() {
    /**
     * contoh try catch
     */
    try {
        multipleCatch("Prayogo")
        multipleCatch("")

        validateAndSayHello("Dendi")
        validateAndSayHello("")

    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: MultipleCatch) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}