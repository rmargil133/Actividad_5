fun main() {
    val nota = 7

    when (nota) {
        in 0..4 -> print("Suspenso")
        in 5..6 -> print("Aprobado")
        in 7..8 -> print("Notable")
        in 9..10 -> print("Sobresaliente")
        else -> print("El valor introducido no es correcto")
    }
}
