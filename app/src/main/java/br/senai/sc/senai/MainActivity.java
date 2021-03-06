package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = findViewById(R.id.et_texto);
        this.editText2 = findViewById(R.id.et_texto2);
    }

    public void onClickBtnMostrar(View v){
        Toast.makeText(MainActivity.this, editText.getText() + " " + editText2.getText(), Toast.LENGTH_LONG).show();
    }

    public void onClickBtnLimpar(View v){
        editText.setText("");
        editText2.setText("");
    }

    public void onClickLimpar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);
        Toast.makeText(MainActivity.this, editText.getText().toString() + " " + editText2.getText().toString(), Toast.LENGTH_LONG).show();

    }



}