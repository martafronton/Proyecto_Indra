class Inscripcion {
    var usuario=Usuario()
    var evento=Evento()
    var fecha= 0
    constructor()
    constructor(usuario: Usuario, evento: Evento, fecha: Int) {
        this.usuario = usuario
        this.evento = evento
        this.fecha = fecha
        listaInscripciones.add(this)
        totalInscripciones++
    }
    companion object{
        var listaInscripciones=ArrayList<Inscripcion>()
        var totalInscripciones=0

    }
    override fun toString(): String {
        return "El usuario ${usuario.nombre} se inscribió en el evento ${evento.nombre} el día $fecha"
    }
}

