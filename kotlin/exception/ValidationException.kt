package exception

class ValidationException(message: String) : Throwable(message) {
}

class MultipleCatch(message: String) : Throwable(message)