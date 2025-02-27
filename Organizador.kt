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
        var evento=Evento(nombre,fecha,ubicacion,categoria, organizador, 100)
        listaEventos.add(evento)
        return evento
    }
    fun modificarEvento(nuevoNombre:String, nuevaFecha:Int, nuevaUbicacion:Ubicacion, nuevaCategoria:Categoria,nuevoOrganizador:Organizador){
        Evento(nuevoNombre, nuevaFecha, nuevaUbicacion, nuevaCategoria, nuevoOrganizador, 100)
    }
    fun cancelarEvento(evento:Evento){
        for(i in listaEventos.indices) {
            if (listaEventos[i]==evento){
                listaEventos.remove(evento)
            }
        }
    }
    override fun toString(): String {
        return "Nombre: $nombre, Eventos con nosotros:${listaEventos.size}"
    }
}