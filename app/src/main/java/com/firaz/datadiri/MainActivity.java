package com.firaz.datadiri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtName, edtNPM;
    private Button btnDataDiri;
    private TextView showNama, showNPM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText)findViewById(R.id.edt_name);
        edtNPM = (EditText)findViewById(R.id.edt_npm);
        btnDataDiri = (Button)findViewById(R.id.btn_datadiri);
        showNama = (TextView)findViewById(R.id.show_nama);
        showNPM = (TextView)findViewById(R.id.show_npm);
        btnDataDiri.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btn_datadiri) {
            String name = edtName.getText().toString().trim();
            String NPM = edtNPM.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(name)) {
                isEmptyFields = true;
                edtName.setError("Nama tidak boleh kosong");
            }
            if (TextUtils.isEmpty(NPM)) {
                isEmptyFields = true;
                edtNPM.setError("NPM tidak boleh kosong");
            }
            if(!isEmptyFields) {
                showNama.setText("Nama Lengkap: "+String.valueOf(name));
                showNPM.setText("NPM: "+String.valueOf(NPM));
            }
        }
    }
}