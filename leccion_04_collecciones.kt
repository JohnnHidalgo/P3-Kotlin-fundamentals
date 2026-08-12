// Lección 4: Colecciones

fun main() {
    val nombres = listOf("Ana", "Luis", "Pedro")
    println("Lista: $nombres")

    val numeros = mutableListOf(1, 2, 3)
    numeros.add(4)
    println("Números: $numeros")

    val edades = mapOf(
        "Ana" to 20,
        "Luis" to 25,
        "Pedro" to 30
    )
    println("Edades: $edades")

    val setDeCursos = setOf("Kotlin", "Java", "Spring")
    println("Cursos: $setDeCursos")

    for (nombre in nombres) {
        println("Hola, $nombre")
    }
}
