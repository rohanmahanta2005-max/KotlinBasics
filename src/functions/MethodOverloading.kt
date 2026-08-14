package functions

fun main(){
    greet()
    greet(name = "Rohan")
    greet( firstname = "Rohan", surname = "Mahanta")
}

fun greet(){
    println("Hello Student")
}
fun greet(name: String){
    println("Hello $name")
}
fun greet(firstname: String, surname: String){
    println("Hello $firstname $surname")
}