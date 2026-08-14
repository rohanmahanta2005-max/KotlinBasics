package oops

class Car {
    var name = ""
    var price = 0                   // these are global variables
    var color = ""
    var fueltype = ""

    fun CarName(naam: String){
        name = naam
        println("Car name is $name")
    }
    fun CarColor( col : String){
        color = col
        println("Car color is $color")
    }
    fun CarFuelType( fuel : String){
        fueltype = fuel
        println(" Exclusive $fueltype varient")
    }
    fun CarPrice(daam: Int){
        price = daam
        println("Car price is Rs.$price /-")
    }
    fun catalogue(){
        println("$name Catalogue.....\n")
    }

}
fun main(){
    var car1 = Car()
    var car2 = Car()


    car1.catalogue()
    car1.CarName(naam = "Mahindra Thar")
    car1.CarColor(col = "Black")
    car1.CarFuelType(fuel = "Diesel")
    car1.CarPrice(daam = 1800000)

 println()
    println()

    car2.catalogue()
    car2.CarName(naam = "Toyota Fortuner")
    car2.CarColor(col = "White")
    car2.CarFuelType(fuel = "Petrol")
    car2.CarPrice(daam = 3900000)


}