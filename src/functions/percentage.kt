package functions

fun main(){
    val percentage = calculate(marks=245 ,totallmarks=700)    //arguments
    println("The percentage is $percentage %")

}
fun calculate(marks:Int, totallmarks:Int):Float{               //parameters
    return (marks.toFloat() / totallmarks) * 100

}