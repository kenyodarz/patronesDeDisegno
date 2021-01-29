open class Usuario {
    val precioBase = 200.0

    fun obtenerPrecio(): Double {
        if (this is UsusarioBasico) {
            return 0.0
        } else if (this is UsuarioPlata) {
            return precioBase * 1.1
        } else if (this is UsuarioOro) {
            return precioBase * 1.2
        } else {
            return precioBase
        }
    }
}

class UsusarioBasico: Usuario()
class UsuarioPlata: Usuario()
class UsuarioOro: Usuario()
