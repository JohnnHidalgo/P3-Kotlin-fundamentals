// Lección 5: Clases y objetos

class Persona(
    val nombre: String,
    var edad: Int
) {
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años.")
    }
}

fun main() {
    val persona1 = Persona("María", 22)
    val persona2 = Persona("José", 28)

    persona1.presentarse()
    persona2.presentarse()

    persona2.edad = 29
    println("La nueva edad de ${persona2.nombre} es ${persona2.edad}")
}
