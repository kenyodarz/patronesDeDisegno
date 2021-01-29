fun main() {

}

fun calcularFactorialIterativo(n: Int): Int {
    var resultado = 1;
    for (i in 2..n) {
        resultado *= i
    }
    return resultado
}


