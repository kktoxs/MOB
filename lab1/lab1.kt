fun main() {
    println(encryptCaesar("zzzz", 1))
    println(encryptAtbash("bbbbbbB"))
}

fun encryptCaesar(text: String, shift: Int): String {
    val encryptedText = StringBuilder()
    for (char in text) {
        if (char.isLetter()) {
            val startChar = if (char.isLowerCase()) 'a' else 'A'
            val shiftedChar = ((char - startChar + shift) % 26 + startChar.toInt()).toChar()
            encryptedText.append(shiftedChar)
        } else {
            encryptedText.append(char)
        }
    }
    return encryptedText.toString()
}

fun encryptAtbash(text: String): String {
    val encryptedText = StringBuilder()
    for (char in text) {
        if (char.isLetter()) {
            val startChar = if (char.isLowerCase()) 'a' else 'A'
            val mirroredChar = (25 - (char - startChar) + startChar.toInt()).toChar()
            encryptedText.append(mirroredChar)
        } else {
            encryptedText.append(char)
        }
    }
    return encryptedText.toString()
}