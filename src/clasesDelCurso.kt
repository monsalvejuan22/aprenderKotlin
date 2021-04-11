fun main(args: Array<String>) {

  /*
    var a = 5
    var b = 6
    println(a.plus(b)) // Suma a + b y lo imprime
    println(a.compareTo(b)) // compara si a es mayor muestra 1, si es igual 0, y si a es menor muestra -1


   */

    //rangos
    // rangos crea rango del 1..10 y lo imprime
    var oneToTen = 1..10

    for (i in oneToTen){
        println(i)
    }


    // declaro Rango A..E
    val aToC ='A'..'E'

    //  rango y lo recorre
    for (letras in 'A'..'D') {
        println(letras)
    }



}