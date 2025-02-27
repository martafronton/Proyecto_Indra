class Usuario {
    var nombre=""
    var correo=""
    var contrasenia=""
    var listaEventos=ArrayList<Evento>()

    constructor()
    constructor(nombre: String, correo: String, contrasenia:String) {
        this.nombre = nombre
        this.correo = correo
        this.contrasenia = contrasenia
        totalUsuarios++
    }
    companion object{
        var totalUsuarios=0
    }


    fun inscribir(evento:Evento){
        var inscribirse=true
        var inscripcion=Inscripcion()
        if(evento.fichaUsuarios.size+1>evento.nummaximo){
            inscribirse=false
        }
        for(i in listaEventos.indices){
            if(listaEventos[i]==evento){
                inscribirse=false
            }
        }
        if(inscribirse) {
            listaEventos.add(evento)
            evento.fichaUsuarios.add(this)
            inscripcion = Inscripcion(this, evento, 100)
        }
    }
    fun cancelarSuscripcion(evento:Evento){
        for(i in listaEventos.indices){
            if(listaEventos[i].nombre==evento.nombre){
                listaEventos.removeAt(i)
                evento.fichaUsuarios.remove(this)
            }
        }
    }

    fun recuperarConstrasenia(correo:String):String{
        return if(correo==this.correo){
            this.contrasenia
        }else
        "No has introducido el correo correcto, intentalo de nuevo"
    }
    override fun toString(): String {
        return "Nombre: $nombre"
    }

    fun cambiarContraseña(contraseniaAntigua:String, contraseniaNueva:String){
        if(contraseniaAntigua==this.contrasenia){
            this.contrasenia=contraseniaNueva
        }
    }
}

