fun main(args: Array<String>) {

  /*
    var a = 5
    var b = 6
    println(a.plus(b)) // Suma a + b y lo imprime
    println(a.compareTo(b)) // compara si a es mayor muestra 1, si es igual 0, y si a es menor muestra -1


   */
   /*
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

    */

// Break

    for (i in 1..3){
        println("El numero es: $i")

        for (j in 1..4){
            if (j.equals(3)) break
            println("El segundo numero es: $j")
        }
    }

    println("Segundo Ejemplo")

    TerminaTodoElCiclo@ for (i in 1..3){
        println("\ni: $i")
        for (j in 1..3){
            println("\nj: $j")
            for (k in 1..5){
                if (k.equals(3)) break@TerminaTodoElCiclo
                println("k: $k")
            }
        }
    }

    // continue y label

    esComoBreak@ for (i in 1..3){
        println("\ni: $i")
        for (j in 1..3){
            println("\nj: $j")
            for (k in 1..5){
                if (k.equals(3)) continue@esComoBreak
                println("k: $k")
            }
        }
    }



}