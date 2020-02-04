package com.jasminekaur.rectanglecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtWidth, txtHeight, txtAreaLabel, txtAreaValue, txtPerimeterLabel, txtPerimeterValue;

    EditText eTxtWidth, eTxtHeight;

    Button btn;


    void initViews() {

        txtWidth = findViewById(R.id.textViewWidth);
        txtHeight = findViewById(R.id.textViewHeight);

        eTxtWidth = findViewById(R.id.editTextWidth);
        eTxtHeight = findViewById(R.id.editTextHeight);

        txtAreaLabel = findViewById(R.id.textViewAreaLabel);
        txtAreaValue = findViewById(R.id.textViewAreaValue);

        txtPerimeterLabel = findViewById(R.id.textViewPerimeterLabel);
        txtPerimeterValue = findViewById(R.id.textViewPerimeterValue);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button:
                String width = eTxtWidth.getText().toString();
                String height = eTxtHeight.getText().toString();
                Double area = Double.valueOf(height) * Double.valueOf(width);
                txtAreaValue.setText(String.format("%.2f", area));

                Double perimeter = 2 * Double.valueOf(width) + 2 * Double.valueOf(height);
                txtPerimeterValue.setText(String.format("%.2f", perimeter));

                break;
        }
    }
}
