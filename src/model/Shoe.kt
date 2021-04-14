package model

class Shoe {    // Clases para datos  o data class
    var size = 34        // numero minimo sea 34
        set(value) {
            if (value >= 34)
                field = value
            else
                field = 34
            }



    var color = "White"
    var model = "Boots"  // no se asigne tenis
        set(value) {
            if (value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }


}