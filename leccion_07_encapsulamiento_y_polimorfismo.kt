// Lección 7: Encapsulamiento y polimorfismo

open class Vehiculo(val marca: String) {
    open fun acelerar() {
        println("$marca acelera")
    }
}

class Auto(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("$marca va más rápido")
    }
}

class Moto(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("$marca acelera en dos ruedas")
    }
}

fun main() {
    val vehiculos: List<Vehiculo> = listOf(Auto("Toyota"), Moto("Yamaha"))

    for (vehiculo in vehiculos) {
        vehiculo.acelerar()
    }
}
