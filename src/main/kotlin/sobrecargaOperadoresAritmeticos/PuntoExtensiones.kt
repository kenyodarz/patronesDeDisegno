operator fun Punto.plus(otroPunto: Punto): Punto {
    return Punto(x + otroPunto.x, y + otroPunto.y)
}

operator fun Punto.times(otroPunto: Punto): Punto {

}

operator fun Punto.div(otroPunto: Punto): Punto {

}

operator fun Punto.rem(otroPunto: Punto): Punto {

}
operator fun Punto.minus(otroPunto: Punto): Punto {
    return Punto(x - otroPunto.x, y - otroPunto.y)
}