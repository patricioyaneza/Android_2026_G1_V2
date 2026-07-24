package com.example.proyecto01g1;

import android.os.Bundle;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDividir;
    Button btnLimpiar;
    EditText txtNumero1;
    EditText txtNumero2;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // asociar variable con los elementos disponibles en la vista
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtResultado = findViewById(R.id.txtResultado);


        btnSumar.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            int resultado = numero1 + numero2;
            txtResultado.setText("Resultado: " + resultado);
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime());
            Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
        });

        // Ejercicio 1: Realizar las otras operaciones aritmeticas.
        btnRestar.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            int resultado = numero1 - numero2;
            txtResultado.setText("Resultado: " + resultado);
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime());// oculta el teclado
        });
        btnMultiplicar.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            int resultado = numero1 * numero2;
            txtResultado.setText("Resultado: " + resultado);
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime());// oculta el teclado
        });
        btnDividir.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(txtNumero1.getText().toString());
            int numero2 = Integer.parseInt(txtNumero2.getText().toString());
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime());// oculta el teclado

            if (numero2 == 0) {
                Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show();
                txtResultado.setText("");
                return;
            }
            // Tarea: buscar las diferentes sintaxis de la sentencia if
            // Tarea: Agregar al IDE, una IA (gemini u otra que se pueda agregar)
            int resultado = numero1 / numero2;
            txtResultado.setText("Resultado: " + resultado);
        });
        btnLimpiar.setOnClickListener(view -> {
            txtNumero1.setText(""); // limpia los text
            txtNumero2.setText("");
            txtResultado.setText("");
            txtNumero2.getWindowInsetsController().hide(WindowInsets.Type.ime()); // oculta el teclado
        });


    }
}