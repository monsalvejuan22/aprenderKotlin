package model

class Camara {
    private var isOn: Boolean = false
    private var resolution = 640



    fun setResolution(resolution: Int) {        // se usa para recibir informacion
        this.resolution = resolution
    }

    fun getResolution(): Int {                  // se usa para enviar informacion por eso el return
        return this.resolution
    }

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun camaraStatus(): String {
        return  if (isOn) "Camara is Turned" else "Camara is not Turned"
    }
}