data class Rectangulo(val ancho: Int, val alto: Int): Comparable<Rectangulo>{
    val area
        get() = ancho * alto

    override fun compareTo(other: Rectangulo): Int {
        return area.compareTo(other.area)
    }
}
