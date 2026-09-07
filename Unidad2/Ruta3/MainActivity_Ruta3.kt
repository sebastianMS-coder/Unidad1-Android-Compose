import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.ceil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Cambia entre TipTimeApp() y ArtSpaceApp() para tu video
            TipTimeApp()
        }
    }
}

@Composable
fun TipTimeApp() {
    // Guarda el texto ingresado y el estado del switch
    var amountInput by remember { mutableStateOf("") }
    var roundUp by remember { mutableStateOf(false) }

    // Calcula la propina al instante
    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tip = if (roundUp) ceil(amount * 0.15) else amount * 0.15

    Column(
        modifier = Modifier.padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Calcular Propina (15%)", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        
        OutlinedTextField(
            value = amountInput,
            onValueChange = { amountInput = it },
            label = { Text("Monto de la cuenta") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        
        Row(
            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("¿Redondear propina?")
            Spacer(modifier = Modifier.weight(1f))
            Switch(checked = roundUp, onCheckedChange = { roundUp = it })
        }
        
        Text(
            text = "Propina: $${String.format("%.2f", tip)}", 
            fontSize = 20.sp, 
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ArtSpaceApp() {
    // Controla que obra de arte se muestra
    var currentArtwork by remember { mutableStateOf(1) }

    val imageResource = when (currentArtwork) {
        1 -> R.drawable.artwork_1 // Recuerda agregar estas imagenes a res/drawable
        2 -> R.drawable.artwork_2
        else -> R.drawable.artwork_3
    }
    
    val title = when (currentArtwork) {
        1 -> "Noche Estrellada"
        2 -> "Mona Lisa"
        else -> "El Grito"
    }
    
    val artist = when (currentArtwork) {
        1 -> "Vincent van Gogh (1889)"
        2 -> "Leonardo da Vinci (1503)"
        else -> "Edvard Munch (1893)"
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = null,
            modifier = Modifier.weight(1f).padding(16.dp)
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = title, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = artist, fontSize = 16.sp)
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { if (currentArtwork > 1) currentArtwork-- else currentArtwork = 3 }) {
                Text("Anterior")
            }
            Button(onClick = { if (currentArtwork < 3) currentArtwork++ else currentArtwork = 1 }) {
                Text("Siguiente")
            }
        }
    }
}
