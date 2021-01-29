class Cliente (val id: String) {
    var nombre: String
    get() {
        return queryForValue("SELECT NombreCliente FROM Clientes WHERE ClienteID = $id")
    }
    set(value) {
        update("UPDATE Clientes SET NombreCliente = $value WHERE ClienteID = $id")
    }

    var email: String

        get() {
            return queryForValue("SELECT EmailCliente FROM Clientes WHERE ClienteID = $id")
        }
        set(value) {
            update("UPDATE Clientes SET EmailCliente = $value WHERE ClienteID = $id")
        }
}
















private fun queryForValue(s: String): String {
    return ""
}

private fun update(s: String) {

}