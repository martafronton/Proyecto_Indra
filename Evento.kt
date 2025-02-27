class Evento {
    var nombre=""
    var fecha=0
    var duracion=0
    var ubicacion=Ubicacion()
    var categoria=Categoria.CHARLA
    var organizador=Organizador()
    var nummaximo=100
    var fichaUsuarios=ArrayList<Usuario>()

    constructor()
    constructor(nombre: String, fecha: Int, ubicacion: Ubicacion, categoria:Categoria, organizador: Organizador, nummaximo:Int) {
        this.nombre = nombre
        this.fecha = fecha
        this.ubicacion = ubicacion
        this.categoria = categoria
        this.organizador = organizador
        this.nummaximo=nummaximo
        totalEventos++

    }
    companion object{
        var totalEventos=0
    }
    fun inscribir(usuario:Usuario,fecha:Int):Inscripcion{
        var inscripcion=Inscripcion()
        var inscribir=true
        if(fichaUsuarios.size>nummaximo){
            inscribir=false
        }
        for(i in fichaUsuarios.indices) {
            if (fichaUsuarios[i] == usuario) {
                inscribir = false
            }
        }
        if(inscribir) {
            fichaUsuarios.add(usuario)
            usuario.listaEventos.add(this)
            inscripcion = Inscripcion(usuario, this, fecha)
        }
        return inscripcion
    }
    fun contarUsuariosInscritos(): Int {
        return fichaUsuarios.size
    }
   override fun toString(): String {
        return "Evento: $nombre Fecha: $fecha Ubicación: ${ubicacion.direccion} Categoría: ${categoria.name} Organizador: ${organizador.nombre}"
    }

}