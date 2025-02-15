package com.example.baitap1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtA,edtB,edtC;
    AppCompatButton btnTinh,btnWeb;
    TextView ketqua;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        btnTinh = findViewById(R.id.bnTinh);
        btnWeb = findViewById(R.id.bnWeb);
        ketqua = findViewById(R.id.ketqua);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhuongTrinh phuongTrinh = new PhuongTrinh();
                phuongTrinh.setA(Integer.parseInt(edtA.getText().toString()));
                phuongTrinh.setB(Integer.parseInt(edtB.getText().toString()));
                phuongTrinh.setC(Integer.parseInt(edtC.getText().toString()));
                ketqua.setText(phuongTrinh.tinhToan().toString());
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                startActivity(intent);
            }
        });
    }
}