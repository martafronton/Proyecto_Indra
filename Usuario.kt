class Usuario {
    var nombre=""
    var correo=""
    var listaEventos=ArrayList<Evento>()

    constructor()
    constructor(nombre: String, correo: String) {
        this.nombre = nombre
        this.correo = correo
    }


    fun inscribir(evento:Evento){
        listaEventos.add(evento)
        evento.fichaUsuarios.add(this)
        var inscripcion=Inscripcion(this,evento, 100)
    }
    fun cancelarSuscripcion(evento:Evento){
        for(i in listaEventos.indices){
            if(listaEventos[i].nombre==evento.nombre){
                listaEventos.removeAt(i)
            }
        }
        evento.fichaUsuarios.remove(this)
    }
}

