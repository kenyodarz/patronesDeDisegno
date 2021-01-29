import java.util.concurrent.locks.ReentrantLock

class RecursoCompartido {
    val lock = ReentrantLock()
    var contador = 0

    fun miFuncion() {
        lock.lock()
        try {
            contador++
        }
        finally {
            lock.unlock()
        }
    }
}