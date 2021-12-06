package data

@JvmInline
value class Token(val value: String) {
    fun toUpper(): String = value.uppercase()
}