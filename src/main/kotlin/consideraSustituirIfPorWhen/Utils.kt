fun unaFuncionCualquiera(x: Any): Int {
    if (x is String) {
        return x.length
    } else if (x is Int) {
        if (x > 5 && x < 10) {
            return 1
        } else {
            return 2
        }
    } else {
        return 0
    }
}
