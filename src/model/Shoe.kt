package model

class Shoe(name: String, description: String, sku: Int, var brand: String):
    Product(name,description,sku) {    // Clases para datos  o data class

    override fun create(): String{
        return "\nCreate shoe"
    }

    override fun read(): String{
        return "\nRead shoe"
    }

    override fun update(): String{
        return "\nUpdate shoe"
    }

    override fun delete(): String{
        return "\nDelete shoe"
    }



    override fun toString(): String {
        return super.toString() + "\nSKU: $sku \nBrand: $brand \nModelo: $model \nSize: $size \nColor: $color"
    }

    init {
        println("SKU ID: $sku")
        println("Brand: $brand")
    }

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