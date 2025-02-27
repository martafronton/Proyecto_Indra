class Ubicacion {
    var online=false
    var direccion="" //tanto si es una dirección física o un enlace, se guardará aquí

    constructor()
    constructor(online: Boolean, direccion: String) {
        this.online = online
        this.direccion = direccion
    }
    override fun toString(): String {
        var lugar=""
        if (online) {
            lugar="Evento online, enlace: $direccion"
        } else {
            lugar="Dirección: $direccion"
        }
        return lugar
    }

}