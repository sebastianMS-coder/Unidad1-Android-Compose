fun main() {
    // Ejercicio 1: Notificaciones
    printNotificationSummary(51)
    printNotificationSummary(135)

    // Ejercicio 2: Precio entradas cine
    println("Ticket price for age 5 is \$${ticketPrice(5, true)}.")
    println("Ticket price for age 28 is \$${ticketPrice(28, true)}.")
    println("Ticket price for age 87 is \$${ticketPrice(87, false)}.")

    // Ejercicio 3: Conversor de grados
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

    // Ejercicio 4: Catalogo de canciones
    val song1 = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1000000)
    song1.printDescription()
    println(song1.isPopular)

    // Ejercicio 5: Perfil de usuario
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()

    // Ejercicio 6: Telefono plegable
    val foldPhone = FoldablePhone()
    foldPhone.switchOn()
    foldPhone.checkPhoneScreenLight()
    foldPhone.unfold()
    foldPhone.switchOn()
    foldPhone.checkPhoneScreenLight()

    // Ejercicio 7: Subastas
    val winningBid = Bid(5000, "Private Collector")
    println("Item A sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B sold at ${auctionPrice(null, 3000)}.")
}

// --- Funciones y Clases ---

// Ejercicio 1
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

// Ejercicio 2
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

// Ejercicio 3
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

// Ejercicio 4
class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

// Ejercicio 5
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby. ")
        }
        if (referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        println("\n")
    }
}

// Ejercicio 6
open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }
    fun switchOff() {
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight() {
        val state = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $state.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }
    fun fold() {
        isFolded = true
    }
    fun unfold() {
        isFolded = false
    }
}

// Ejercicio 7
class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
