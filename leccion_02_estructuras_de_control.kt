// Lección 2: Estructuras de control

fun main() {
    val edad = 18

    if (edad >= 18) {
        println("Es mayor de edad")
    } else {
        println("Es menor de edad")
    }

    val dia = 3
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        else -> println("Otro día")
    }

    for (i in 1..5) {
        println("Iteración $i")
    }

    var contador = 0
    while (contador < 3) {
        println("Mientras: $contador")
        contador++
    }
}
