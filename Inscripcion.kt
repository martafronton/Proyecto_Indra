class Inscripcion {
    var usuario=Usuario()
    var evento=Evento()
    var fecha= 0

    constructor(usuario: Usuario, evento: Evento, fecha: Int) {
        this.usuario = usuario
        this.evento = evento
        this.fecha = fecha
        listaInscripciones.add(this)
    }
    companion object{
        var listaInscripciones=ArrayList<Inscripcion>()

    }
}

