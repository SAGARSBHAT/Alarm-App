package com.example.alaram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton fabbtn;


    private FirebaseAuth mauth;

    private DatabaseReference data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






       




        toolbar=findViewById(R.id.toolbar);
        fabbtn=findViewById(R.id.fabbtn);




        setSupportActionBar(toolbar);
getSupportActionBar().setTitle("ALARAM");





fabbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        startActivity(new Intent(getApplicationContext(),DialogActivity.class));

    }
});




    }
}