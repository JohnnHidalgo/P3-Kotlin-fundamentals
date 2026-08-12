// Lección 6: Herencia

open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("$nombre hace un sonido")
    }
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre ladra: guau guau")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre maúlla: miau")
    }
}

fun main() {
    val perro = Perro("Max")
    val gato = Gato("Mishi")

    perro.hacerSonido()
    gato.hacerSonido()
}
