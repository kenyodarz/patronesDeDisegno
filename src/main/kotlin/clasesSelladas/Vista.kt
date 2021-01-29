class Vista {
    var misFormas = listOf<Forma>()
    var canvas = Canvas()

    fun dibujar() {
        for (forma in misFormas) {
            dibujarForma(forma)
        }
    }

    fun dibujarForma(forma: Forma)
}
