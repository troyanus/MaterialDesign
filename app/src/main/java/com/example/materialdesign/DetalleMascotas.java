package com.example.materialdesign;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleMascotas extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_mascotas);
    }
}
