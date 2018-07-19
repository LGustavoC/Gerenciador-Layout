package br.edu.ifpb.gerenciadoreslayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.enviarButton);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        EditText camp = findViewById(R.id.nomeEditText);
        Context cont = getApplicationContext();
        String text = camp.getText().toString();
        int dur = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(cont, text, dur);
        toast.show();
        Intent it = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(it);
    }
}
