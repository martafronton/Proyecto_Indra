class Organizador {
    var nombre=""
    var correo=""
    var listaEventos=ArrayList<Evento>()

    constructor()
    constructor(nombre: String, correo: String) {
        this.nombre = nombre
        this.correo = correo
    }


    fun organizarEvento(nombre: String, fecha: Int, ubicacion: Ubicacion, categoria:Categoria, organizador: Organizador):Evento{
        var evento=Evento(nombre,fecha,ubicacion,categoria, organizador)
        listaEventos.add(evento)
        return evento
    }
    fun modificarEvento(nuevoNombre:String, nuevaFecha:Int, nuevaUbicacion:Ubicacion, nuevaCategoria:Categoria,nuevoOrganizador:Organizador):Evento{
        return Evento(nuevoNombre, nuevaFecha, nuevaUbicacion, nuevaCategoria, nuevoOrganizador)
    }
    fun eliminarEvento(evento:Evento){
        listaEventos.remove(evento)
    }
}