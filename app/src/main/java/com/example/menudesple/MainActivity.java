package com.example.menudesple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para mostrar y ocultar el menú
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //Método para asignar las funciones correspondientes a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        } else if(id == R.id.item2){
            Intent i = new Intent(this, MainActivity3.class);
            startActivity(i);
        }else if(id == R.id.item3){
            Intent i = new Intent(this, MainActivity4.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }



}

