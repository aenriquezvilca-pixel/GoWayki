package com.example.gowayki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val FondoOscuro = Color(0xFF19130F)
private val Terracota = Color(0xFFBC5433)
private val TextoClaro = Color(0xFFFFF8F3)
private val TextoSecundario = Color(0xFFB8AAA1)
private val FondoCampo = Color(0xFF241C17)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegistroUsuarioScreen()
        }
    }
}

@Composable
fun RegistroUsuarioScreen() {
    var nombre by remember { mutableStateOf("") }
    var correo by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = FondoOscuro
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 28.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "GoWayki GO",
                color = Terracota,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Registro de Usuario",
                color = TextoClaro,
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(28.dp))

            OutlinedTextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Nombre") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Terracota,
                    unfocusedBorderColor = Color(0xFF57463B),
                    focusedLabelColor = Terracota,
                    unfocusedLabelColor = TextoSecundario,
                    focusedTextColor = TextoClaro,
                    unfocusedTextColor = TextoClaro,
                    focusedContainerColor = FondoCampo,
                    unfocusedContainerColor = FondoCampo
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedTextField(
                value = correo,
                onValueChange = { correo = it },
                label = { Text("Correo electrónico") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Terracota,
                    unfocusedBorderColor = Color(0xFF57463B),
                    focusedLabelColor = Terracota,
                    unfocusedLabelColor = TextoSecundario,
                    focusedTextColor = TextoClaro,
                    unfocusedTextColor = TextoClaro,
                    focusedContainerColor = FondoCampo,
                    unfocusedContainerColor = FondoCampo
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedTextField(
                value = contrasena,
                onValueChange = { contrasena = it },
                label = { Text("Contraseña") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Terracota,
                    unfocusedBorderColor = Color(0xFF57463B),
                    focusedLabelColor = Terracota,
                    unfocusedLabelColor = TextoSecundario,
                    focusedTextColor = TextoClaro,
                    unfocusedTextColor = TextoClaro,
                    focusedContainerColor = FondoCampo,
                    unfocusedContainerColor = FondoCampo
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* Acción de registro */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Terracota)
            ) {
                Text(text = "Registrarse", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}