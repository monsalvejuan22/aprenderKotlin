import model.Camara
import model.Movie
import model.Shoe

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

    /*
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
     */

    /*

    // Null llamado seguro
    var compute: String?                    // Declaro variable que acepte null
    compute = null                          // DECLARO NULL
    var longitud: Int? = compute?.length    //DECLARO longitud de la variable computer
    println("LONGITUD : $longitud")

    // Operador Elvis

    var teclado: String? =null
    val longitudTeclado: Int = teclado?.length ?: 0  // Si el valor de teclado es null devulve 0
    println("Longitud del teclado: $longitudTeclado")

    val listWithNulls = listOf<Int?>(7, null, null, 4)
    println("Lista con Null: ${listWithNulls}")

    val listWithoutNulls = listWithNulls.filterNotNull()
    println("Numeros validos en la lista: ${listWithoutNulls}")

     */

    /*
    //Array
    val countries = arrayOf("India","Mexico","Colombia","Chile", )

    // Promedio de numeros
    val numbers = intArrayOf(6,6,23,9,2,3,2)
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    var average = sum / numbers.size
    println("Promedio: $average")

    var arrayObjects = arrayOf(1,2,3)
    var intPrimitive = arrayObjects.toIntArray()

    val suma = arrayObjects.sum()
    println("La suma del array es: $suma")

    arrayObjects = arrayObjects.plus(4) // Agrega un elemento con valor 4
    for (a in arrayObjects){
        println("Array: $a")
    }

    arrayObjects = arrayObjects.reversedArray() // Invierte los valores del array
    for (a in arrayObjects){
        println("Array: $a")
    }

    arrayObjects.reverse()      // Funcion que invierte el array
    for (a in arrayObjects){
        println("Array: $a")
    }

     */

    /*
    //Funciones

    val numbers = intArrayOf(6,6,23,9,2,3,2)

    fun averageNumbers(numbers: IntArray): Int{     // funcion que saca el promedio de un array
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum / numbers.size
    }

    println("El promedio de los numeros es: ${averageNumbers(numbers)}")

     */

    /*
    //funcion Lambda

    val saludo = { println("Hola Mundo")}
    saludo()

    val calculateNumber = { n: Int ->
        when (n){
            in 1..3     ->  println("El numero esta entre 1 y 3")
            in 4..7     ->  println("El numero esta entre 4 y 7")
            in 8..10    ->  println("El numero esta entre 8 y 10")
        }
    }
    println(calculateNumber(9))
     */

    /*
    //Clases

    val camara = Camara()
    camara.turnOn ()
    println(camara.camaraStatus())

    camara.setResolution(1080)      // set se usa para enviar dato
    println("La resolucion es: ${camara.getResolution()} ")    // get se usa para traer datos

    var shoe = Shoe()

    shoe.size = 36
    println(shoe.size)

    shoe.model ="zapatos de tacon"
    println(shoe.model)

     */

    /*

    // Data Class y constructor

    var movie = Movie("Coco", "Pixar", 120)  // Contructor primario en el segundario se coloca Init{}
    println("Movie")
    println(movie.title)
    println(movie.creator)
    println("${movie.duration} min")

     */

    // Open class y herencia

    var shoe = Shoe("Shoe", "Blue Shoes", 12345, "Praga")
    println("Shoe: ${shoe}")

    println(shoe.create())

}

