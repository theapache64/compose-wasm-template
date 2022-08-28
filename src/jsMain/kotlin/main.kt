import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window(title = "Compose Wasm Template") {
            var count by remember { mutableStateOf(0) }
            Column {

                // Content
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            count--
                        }
                    ) {
                        Text("-")
                    }

                    Text("Count is $count", fontSize = 30.sp)

                    Button(
                        onClick = {
                            count++
                        }
                    ) {
                        Text("+")
                    }
                }

            }
        }
    }
}
