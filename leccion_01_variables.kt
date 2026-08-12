// Lección 1: Variables y tipos de datos

fun main() {
    val nombre = "Ana"
    val edad = 20
    val activo = true

    var contador = 0
    contador += 1

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Activo: $activo")
    println("Contador: $contador")

    // Tipos numéricos
    val entero: Int = 10
    val decimal: Double = 3.14
    val largo: Long = 10000000000L

    println("Entero: $entero")
    println("Decimal: $decimal")
    println("Largo: $largo")

    // Operaciones
    val total = entero + 5
    println("Total: $total")
}
