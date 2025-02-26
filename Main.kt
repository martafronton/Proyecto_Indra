//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
var Marta=Usuario("marta","hola@gmail.com")
    var LaMutua=Organizador("LaMutua","Organizadores@gmail.com")
    var Parque=Ubicacion(false,"Calle Pino")
    var evento1=LaMutua.organizarEvento("Charla",12022025,Parque,Categoria.CHARLA,LaMutua)
    Marta.inscribir(evento1)
    var inscripciones=ArrayList<Inscripcion>()
    for(i in LaMutua.listaEventos.indices){
        println(LaMutua.listaEventos[i].nombre)
    }
    for(i in Marta.listaEventos.indices){
        println(Marta.listaEventos[i].nombre)
    }
    for(i in evento1.fichaUsuarios.indices){
        println(evento1.fichaUsuarios[i].nombre)
    }
    for(h in Inscripcion.listaInscripciones.indices){
        println(Inscripcion.listaInscripciones[h].usuario.nombre)
        println(Inscripcion.listaInscripciones[h].evento.nombre)
    }
}