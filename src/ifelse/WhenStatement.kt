package ifelse

fun main() {
    val timeOfday = "Night"

    when (timeOfday) {
        "Morning" -> println("Poha mil gya morning time pe")
        "Afternoon" -> println("Biriyani mil gya Afternoon time pe")
        "Evening" -> println("Chai mil gya ")
        "Night" -> println("Roti mil gya night me")

    else -> {
        println("Invalid Choice")
       }
    }
}