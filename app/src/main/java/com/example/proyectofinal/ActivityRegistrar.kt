package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectofinal.ui.theme.ProyectoFinalTheme
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.AdapterView
import android.view.View
import android.widget.Button

class ActivityRegistrar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        val btn: Button = findViewById(R.id.btn_ya_tiene_cuenta)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}


            val spinner: Spinner = findViewById(R.id.spinnerGenero)
        // Datos para el Spinner
        val generos = arrayOf("Genero","Femenino", "Masculino")

        // Crear un ArrayAdapter usando los datos y un diseño simple para el Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, generos)

        // Especificar el diseño para el menú desplegable (opcional)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Establecer el ArrayAdapter en el Spinner
        spinner.adapter = adapter

        // Manejar selecciones en el Spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Obtener el elemento seleccionado
                val selectedItem = generos[position]
                // Puedes hacer lo que desees con el elemento seleccionado
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Acción cuando no se ha seleccionado nada
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoFinalTheme {
        Greeting("Android")
    }
}
