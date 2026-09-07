import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Cambia entre DiceRollerApp() y LemonadeApp() para tu video
            DiceRollerApp()
        }
    }
}

@Composable
fun DiceRollerApp() {
    // Guarda el estado del dado, empieza en 1
    var result by remember { mutableStateOf(1) }

    // Elige la imagen segun el numero
    val imageResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = "Dado"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random() }) {
            Text(text = "Tirar dado")
        }
    }
}

@Composable
fun LemonadeApp() {
    // Variables para el paso actual y cuantas veces exprimir
    var currentStep by remember { mutableStateOf(1) }
    var squeezeCount by remember { mutableStateOf(0) }

    val imageRes = when(currentStep) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    
    val textRes = when(currentStep) {
        1 -> "Toca el limonero para un limon"
        2 -> "Toca el limon para exprimirlo"
        3 -> "Toca la limonada para beberla"
        else -> "Toca el vaso vacio para reiniciar"
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = textRes, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))
        // La imagen funciona como boton
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier.clickable {
                when (currentStep) {
                    1 -> {
                        currentStep = 2
                        squeezeCount = (2..4).random() // clics aleatorios
                    }
                    2 -> {
                        squeezeCount--
                        if (squeezeCount == 0) currentStep = 3
                    }
                    3 -> currentStep = 4
                    4 -> currentStep = 1
                }
            }
        )
    }
}
