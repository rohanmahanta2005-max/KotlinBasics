package functions

fun main(){

    // calculateMarks(maths = 80, science = 75, english = 90)   // arguments
    orderFood(item = "Maggie",quantity = 4)
    orderFood(item = "Chicken Burger",quantity = 2)
}
fun calculateMarks(maths:Int, science:Int, english:Int){     //Parameters
    val total = maths + science + english
    println("Apke total marks hain $total")
}
fun orderFood(item:String, quantity:Int){
    println("Apka order hain $item,$quantity plates")
}
