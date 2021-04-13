package model

class Camara {
    private var isOn: Boolean = false

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