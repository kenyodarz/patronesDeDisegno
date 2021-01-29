import java.time.LocalDateTime

class Usuario(val email: String, val contrasena: String) {
    var esPremium: Boolean
    val fechaDeCreacion: LocalDateTime
    
    init {
        esPremium = false
        fechaDeCreacion = LocalDateTime.now()
    }
    
}
