package com.example.proyecto01g1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuActivity extends AppCompatActivity {

    private FloatingActionButton fabPrincipal;
    private FloatingActionButton fabCalculadora;
    private FloatingActionButton fabOpcion2;
    private FloatingActionButton fabOpcion3;
    private boolean open = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
// permite agregar y se despliegue el menu FAB
        fabPrincipal = findViewById(R.id.fabPrincipal);
        fabCalculadora = findViewById(R.id.fabCalculadora);
        fabOpcion2 = findViewById(R.id.fabOpcion2);
        fabOpcion3 = findViewById(R.id.fabOpcion3);

        fabPrincipal.setOnClickListener(view -> {
            if (open) {
                fabCalculadora.show();
                fabOpcion2.show();
                fabOpcion3.show();
            } else {
                fabCalculadora.hide();
                fabOpcion2.hide();
                fabOpcion3.hide();
            }
            open = !open;
        });
        fabCalculadora.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalculadoraActivity.class);
            startActivity(intent);
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_calculadora){
            Intent intent = new Intent(this, CalculadoraActivity.class);
            startActivity(intent);
            return true;
        }
        if(id == R.id.action_logout){
            finishAffinity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}