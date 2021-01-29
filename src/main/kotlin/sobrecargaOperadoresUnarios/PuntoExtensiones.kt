operator fun Punto.plus(otroPunto: Punto): Punto {
    return Punto(x + otroPunto.x, y + otroPunto.y)
}

operator fun Punto.times(escala: Int): Punto {
    return Punto(x * escala, y * escala)
}

operator fun Punto.minus(otroPunto: Punto): Punto {
    return Punto(x - otroPunto.x, y - otroPunto.y)
}


