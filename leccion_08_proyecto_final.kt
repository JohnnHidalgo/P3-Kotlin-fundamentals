// Lección 8: Proyecto final

class CuentaBancaria(
    private val titular: String,
    private var saldo: Double
) {
    fun depositar(monto: Double) {
        if (monto > 0) {
            saldo += monto
            println("Se depositaron $monto. Saldo actual: $saldo")
        } else {
            println("El monto debe ser positivo")
        }
    }

    fun retirar(monto: Double) {
        if (monto <= saldo) {
            saldo -= monto
            println("Se retiraron $monto. Saldo actual: $saldo")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun consultarSaldo(): Double {
        return saldo
    }
}

fun main() {
    val cuenta = CuentaBancaria("Laura", 1000.0)
    cuenta.depositar(250.0)
    cuenta.retirar(300.0)
    println("Saldo final: ${cuenta.consultarSaldo()}")
}
