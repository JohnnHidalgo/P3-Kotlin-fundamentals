// Lección 3: Funciones

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun saludar(nombre: String) {
    println("Hola, $nombre!")
}

fun areaCirculo(radio: Double): Double {
    return Math.PI * radio * radio
}

fun main() {
    val resultado = sumar(10, 20)
    println("Resultado: $resultado")

    saludar("Carlos")

    val area = areaCirculo(3.0)
    println("Área del círculo: $area")

    // Función con expresión
    fun doble(numero: Int) = numero * 2
    println("Doble de 7: ${doble(7)}")
}
