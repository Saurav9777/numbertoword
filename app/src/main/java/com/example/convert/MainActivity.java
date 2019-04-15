package com.example.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view){
        EditText editText = (EditText)findViewById(R.id.edtText);
        TextView textView = (TextView) findViewById(R.id.txtView2);

        int numberToConvert = Integer.parseInt(editText.getText().toString());

        String return_val_in_english =   NumberToWords.convert(numberToConvert);

        Toast.makeText(MainActivity.this,"Ammount "+" "+ return_val_in_english.toString(), Toast.LENGTH_LONG).show();

        textView.setText(return_val_in_english);
    }
}
