// EJERCICIO 1
// ¿Puedes leer el código en este programa y adivinar el resultado (sin ejecutarlo en el Playground de Kotlin)?
fun main() {
    println("1")
    println("2")
    println("3")
}
// Respuesta:
    1
    2
    3

// EJERCICIO 2
// Usa el Playground de Kotlin para crear un programa que genere los siguientes mensajes:
// I'm
// learning
// Kotlin!
// Respuesta:
fun main() {
    println("I'm")
    println("learning")
    println("Kotlin!")
}

// EJERCICIO 3
// Copia y pega este programa en el Playground de Kotlin.
fun main() {
    println("Tuesday")
    println("Thursday")
    println("Wednesday")
    println("Friday")
    println("Monday")
}
// Corrige el programa para que imprima este resultado:
Monday
Tuesday
Wednesday
Thursday
Friday
// Respuesta:
fun main() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
}

// EJERCICIO 4
// Corrige el error de este programa para que produzca el resultado deseado.
fun main() {
    println("Tomorrow is rainy")
// Resultado deseado:
Tomorrow is rainy
// Respuesta:
// Error 
Syntax error: Expecting '}'.
// Código corregido:
fun main() {
    println("Tomorrow is rainy")
}

// EJERCICIO 5
// Corrige el error de este programa para que produzca el resultado deseado.
fun main() {
    printLine("There is a chance of snow")
}
// Resultado deseado:
There is a chance of snow
// Respuesta:
// Error 
Unresolved reference 'printLine'.
// Código corregido:
fun main() {
    println("There is a chance of snow")
}

// EJERCICIO 6
// Corrige el error de este programa para que produzca el resultado deseado.
fun main() {
    println("Cloudy") println("Partly Cloudy") println("Windy")
}
// Resultado deseado:
Cloudy
Partly Cloudy
Windy
// Respuesta:
// Error 
Unresolved reference 'println'.
// Código corregido:
fun main() {
    println("Cloudy") 
    println("Partly Cloudy") 
    println("Windy")
}

// EJERCICIO 7
// Corrige el error de este programa para que produzca el resultado deseado.
fun main() (
    println("How's the weather today?")
)
// Resultado deseado:
How s the weather today?
// Respuesta:
// Error 
Function 'main' must have a body.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
Syntax error: Expecting a top level declaration.
// Código corregido:
fun main() {
    println("How's the weather today?")
}



// PROBLEMAS PRÁCTICOS: CONCEPTOS BÁSICOS DE KOTLIN

//EJERCICIO 1
// ¿Puedes escribir una función main() que imprima estos mensajes en cuatro líneas separadas?
Use the val keyword when the value doesnt change. 
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it. 
When you call a function, you pass arguments for the parameters.
//Respuesta:
fun main() {
    println("Use the val keyword when the value doesn't change. \nUse the var keyword when the value can change.\nWhen you define a function, you define the parameters that can be passed to it. \nWhen you call a function, you pass arguments for the parameters.")
}


//EJERCICIO 2
// Este programa imprime un mensaje que le notifica al usuario que recibió un mensaje de chat de un amigo.
fun main() { 
    println("New chat message from a friend'}
}
// ¿Puedes determinar la causa raíz de los errores de compilación de este programa y corregirlos?
// Si, mal uso de los símbolos para la función "println".
// ¿El código usa los símbolos apropiados para indicar la apertura y el cierre de la cadena y el argumento de la función?
// No, se esta usando llaves "}" como cierre, pero en este caso se debe de usar ")" para la palabra clave "println". Ademas el contenido dentro esta con una comilla, para este caso se usa 2 comillas ".
fun main() { 
    println("New chat message from a friend")
}


//EJERCICIO 3
// Este programa informa a los usuarios sobre la próxima oferta promocional de un artículo en particular.
// Tiene una plantilla de cadenas, que se basa en la variable discountPercentage para el porcentaje de descuento y la variable item para el artículo en oferta. Sin embargo, existen errores de compilación en el código.
fun main() {
    var discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
// ¿Puedes determinar la causa raíz de esos errores y corregirlos?
// Si, las variables declaradas con val son inmutables
// ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
// Daría a un error, un mensaje diciendo que no se puede actualizar o reasignar valores a las variables "offer" y "discountPercentage"


//EJERCICIO 4
// Este programa muestra una cantidad total de personas en una fiesta. Entre ellas, hay adultos y niños. 
// La variable numberOfAdults contiene la cantidad de adultos en el grupo, y la variable numberOfKids, la cantidad de niños
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
// ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
// Si, total vendría a ser 2030
// ¿Puedes encontrar el problema del código y corregirlo de modo que imprima este resultado?
// Si, para que 2 variables se sumen, es decir se use un operador, ambos deben ser numeros, ya sean enteros o decimales, en este caso son string, por lo que existe concatenación.
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}


//EJERCICIO 5
// Este programa muestra el salario total que recibe un empleado este mes. 
// El salario total se divide en dos partes: la variable baseSalary, que es lo que el empleado recibe todos los meses, y la variable bonusAmount, que es una bonificación adicional otorgada al empleado.
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
// ¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
// Si, la variable totalSalary se imprimiría como: 5000 + 1000
// Cuando ejecutas el código en el Playground de Kotlin, ¿se imprime el resultado que esperabas?
// No, solo se imprime una suma, para sumar ambas variables no llega a ser necesario el uso de las comillas ya que se quiere sumar 2 variables numericas.


//EJERCICIO 6
//En este ejercicio, escribirás un programa que realice operaciones matemáticas básicas y, luego, imprima el resultado.

//La función main() contiene un error de compilación:
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
// ¿Puedes corregir el error de modo que el programa imprima este resultado?
// 10 + 5 = 15
// Para este caso se tendría que declarar una nueva variable "result", de la siguiente manera
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    
    println("$firstNumber + $secondNumber = $result")
}

// El código funciona, pero la lógica para sumar dos números se encuentra dentro de la variable de resultado, lo que hace que el código sea menos flexible a la hora de volver a usarlo. 
// En su lugar, puedes extraer la operación de suma en una función add() para que el código se pueda volver a usar. Para ello, actualiza el código con el que se muestra a continuación. 
// Observa que el código ahora presenta una nueva variable val, llamada thirdNumber, e imprime el resultado de esta variable nueva con firstNumber.
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
// Define add() function below this line
// Definimos la funcion add()
fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

// Ahora tienes una función reutilizable capaz de sumar dos números.
// ¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? 
// Modifica la función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera.
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val anotherResult2 = subtract(firstNumber, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $anotherResult2")
}

fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun subtract(num1: Int, num2: Int): Int{
    return num1 - num2
}


// EJERCICIO 7
// Gmail tiene una función que envía notificaciones al usuario cada vez que se intenta acceder a una cuenta en un dispositivo nuevo.
// En este ejercicio, escribirás un programa que muestra un mensaje a los usuarios con esta plantilla de mensaje:
// There's a new sign-in request on operatingSystem for your Google Account emailId.
// Deberás implementar una función que acepte un parámetro operatingSystem y un parámetro emailId, cree un mensaje en el formato dado y lo muestre.
// Por ejemplo, si se llamó a la función con "Chrome OS" para el operatingSystem y "sample@gmail.com" para el emailId, se debería mostrar esta cadena:
// There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.

// ¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
// Define your displayAlertMessage() below this line.

// ¿El programa imprime este resultado?
// There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId." 
}

// Sin embargo, en algunos escenarios, notas que no puedes determinar el sistema operativo del usuario. En esos casos, deberás especificar el nombre del sistema operativo como Unknown OS. 
// Puedes optimizar aún más el código para que no necesites pasar el argumento Unknown OS cada vez que se llame a la función.
// ¿Puedes encontrar una manera de optimizar el código con esta información de modo que imprima este resultado?
/* There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.
* There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 
* There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.*/
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId." 
}


// EJERCICIO 8
// El podómetro es un dispositivo electrónico que cuenta la cantidad de pasos que se dan. 
// En la actualidad, casi todos los teléfonos celulares, relojes inteligentes y equipos para hacer ejercicio cuentan con podómetros integrados. 
// La app de Salud y fitness usa los podómetros integrados a fin de calcular la cantidad de pasos que se dan. Esta función calcula la cantidad de calorías que quema el usuario en función de los pasos que da.
// ¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las variables utilizados en este programa según las prácticas recomendadas?
fun main() {
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}
// Según las practicas recomendadas los nombres de las funciones comienzan con una palabra minuscula y seguido a ellas cada palabra comienza con mayuscula. Por lo que:
// PEDOMETERstepsTOcalories --> pedometerStepsToCalories
// CaloriesBURNEDforEachStep --> caloriesBurnedForEachStep
// TotalCALORIESburned --> totalCaloriesBurned


// EJERCICIO 9
// Los teléfonos celulares modernos tienen una función integrada que registra el tiempo de uso (es decir, el tiempo que usas el teléfono cada día).
// En este ejercicio, implementarás una función que compara la cantidad de minutos que usaste el teléfono hoy y ayer. La función acepta dos parámetros de números enteros y muestra un valor booleano.
// El primer parámetro contiene la cantidad de minutos de uso de hoy, y el segundo, la cantidad de minutos de uso de ayer. 
// La función muestra un valor true si pasaste más tiempo en el teléfono hoy que ayer. De lo contrario, muestra un valor false.
/* Por ejemplo, si llamaste a la función con estos argumentos con nombre:
timeSpentToday = 300 y timeSpentYesterday = 250, la función muestra un valor true.
timeSpentToday = 300 y timeSpentYesterday = 300, la función muestra un valor false.
timeSpentToday = 200 y timeSpentYesterday = 220, la función muestra un valor false. */
fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println(compararTiempo(timeSpentToday, timeSpentYesterday))
}

fun compararTiempo(tiempo1: Int, tiempo2: Int): Boolean {
    return tiempo1 > tiempo2
}


// EJERCICIO 10
// En este programa, se muestra el clima de diferentes ciudades. Incluye el nombre de la ciudad, las temperaturas máxima y mínima del día, y las probabilidades de lluvia.
fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
// Hay muchas similitudes en el código que imprime el clima de cada ciudad. Por ejemplo, hay frases que se repiten varias veces, como "City:" y "Low temperature:". 
// Los códigos similares y repetidos crean el riesgo de que se produzcan errores en tu programa. Puede que hayas escrito mal una de las ciudades o que hayas olvidado uno de los detalles del clima.
// ¿Puedes crear una función que imprima los detalles del clima de una sola ciudad para reducir la repetición en la función main() y, luego, hacer lo mismo en las ciudades restantes?
// ¿Puedes actualizar la función main() para llamar a la función que creaste para cada ciudad y pasar los detalles apropiados del clima como argumentos?
fun main() {
    val city = "Ankara"
    val lowTemperature = 27
    val highTemperature = 31
    val chanceOfRain = 82
    imprimirDetallesClima(city, lowTemperature, highTemperature, chanceOfRain)
}

fun imprimirDetallesClima(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city \nLow temperature: $lowTemperature, High temperature: $highTemperature \nChance of rain: $chanceOfRain%")
}




























