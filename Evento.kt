class Evento {
    var nombre=""
    var fecha=0
    var ubicacion=Ubicacion()
    var categoria=Categoria.CHARLA
    var organizador=Organizador()
    var fichaUsuarios=ArrayList<Usuario>()

    constructor()
    constructor(nombre: String, fecha: Int, ubicacion: Ubicacion, categoria:Categoria, organizador: Organizador) {
        this.nombre = nombre
        this.fecha = fecha
        this.ubicacion = ubicacion
        this.categoria = categoria
        this.organizador = organizador
    }

    fun inscribir(usuario:Usuario,fecha:Int){
        fichaUsuarios.add(usuario)
        usuario.listaEventos.add(this)
        var inscripcion=Inscripcion(usuario,this, fecha)
    }
}