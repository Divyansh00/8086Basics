package com.tutorials.a8086basics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Programs extends Activity {

    private Button program1;
    private Button program2;
    private Button program3;
    private Button program4;
    private Button program5;
    private Button program6;
    private Button program7;
    private Button program8;
    private Button program9;
    private Button program10;
    private Button program11;
    private Button program12;
    private Button program13;
    private Button program14;
    private Button program15;
    private Button program16;
    private Button program17;
    private Button program18;
    private Button program19;
    private Button program20;
    private Button program21;
    private Button program22;
    private Button program23;
    private Button program24;
    private Button program25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        program1 = findViewById(R.id.program1);
        program1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP1();
            }
        });
        program2 = findViewById(R.id.program2);
        program2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP2();
            }
        });
        program3 = findViewById(R.id.program3);
        program3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP3();
            }
        });
        program4 = findViewById(R.id.program4);
        program4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP4();
            }
        });
        program5 = findViewById(R.id.program5);
        program5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP5();
            }
        });
        program6 = findViewById(R.id.program6);
        program6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP6();
            }
        });
        program7 = findViewById(R.id.program7);
        program7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP7();
            }
        });
        program8 = findViewById(R.id.program8);
        program8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP8();
            }
        });
        program9 = findViewById(R.id.program9);
        program9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP9();
            }
        });
        program10 = findViewById(R.id.program10);
        program10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP10();
            }
        });
        program11 = findViewById(R.id.program11);
        program11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP11();
            }
        });
        program12 = findViewById(R.id.program12);
        program12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP12();
            }
        });
        program13 = findViewById(R.id.program13);
        program13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP13();
            }
        });
        program14 = findViewById(R.id.program14);
        program14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP14();
            }
        });
        program15 = findViewById(R.id.program15);
        program15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openP15(); }
        });
        program16 = findViewById(R.id.program16);
        program16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openP16(); }
        });
        program17 = findViewById(R.id.program17);
        program17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP17();
            }
        });
        program18 = findViewById(R.id.program18);
        program18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP18();
            }
        });
        program19 = findViewById(R.id.program19);
        program19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP19();
            }
        });
        program20 = findViewById(R.id.program20);
        program20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP20();
            }
        });
        program21 = findViewById(R.id.program21);
        program21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP21();
            }
        });
        program22 = findViewById(R.id.program22);
        program22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP22();
            }
        });
        program23 = findViewById(R.id.program23);
        program23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP23();
            }
        });
        program24 = findViewById(R.id.program24);
        program24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP24();
            }
        });
        program25 = findViewById(R.id.program25);
        program25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openP25();
            }
        });
    }
    public void openP1(){
        Intent intent = new Intent(this,P1Activity.class);
        startActivity(intent);
    }
    public void openP2(){
        Intent intent = new Intent(this,P2Activity.class);
        startActivity(intent);
    }
    public void openP3(){
        Intent intent = new Intent(this,P3Activity.class);
        startActivity(intent);
    }
    public void openP4(){
        Intent intent = new Intent(this,P4Activity.class);
        startActivity(intent);
    }
    public void openP5(){
        Intent intent = new Intent(this,P5Activity.class);
        startActivity(intent);
    }
    public void openP6(){
        Intent intent = new Intent(this,P6Activity.class);
        startActivity(intent);
    }
    public void openP7(){
        Intent intent = new Intent(this,P7Activity.class);
        startActivity(intent);
    }
    public void openP8(){
        Intent intent = new Intent(this,P8Activity.class);
        startActivity(intent);
    }
    public void openP9(){
        Intent intent = new Intent(this,P9Activity.class);
        startActivity(intent);
    }
    public void openP10(){
        Intent intent = new Intent(this,P10Activity.class);
        startActivity(intent);
    }
    public void openP11(){
        Intent intent = new Intent(this,P11Activity.class);
        startActivity(intent);
    }
    public void openP12(){
        Intent intent = new Intent(this,P12Activity.class);
        startActivity(intent);
    }
    public void openP13(){
        Intent intent = new Intent(this,P13Activity.class);
        startActivity(intent);
    }
    public void openP14(){
        Intent intent = new Intent(this,P14Activity.class);
        startActivity(intent);
    }
    public void openP15(){
        Intent intent = new Intent(this,P15Activity.class);
        startActivity(intent);
    }
    public void openP16(){
        Intent intent = new Intent(this,P16Activity.class);
        startActivity(intent);
    }
    public void openP17(){
        Intent intent = new Intent(this,P17Activity.class);
        startActivity(intent);
    }
    public void openP18(){
        Intent intent = new Intent(this,P18Activity.class);
        startActivity(intent);
    }
    public void openP20(){
        Intent intent = new Intent(this,P21Activity.class);
        startActivity(intent);
    }
    public void openP21(){
        Intent intent = new Intent(this,P22Activity.class);
        startActivity(intent);
    }
    public void openP19(){
        Intent intent = new Intent(this,P20Activity.class);
        startActivity(intent);
    }
    public void openP22(){
        Intent intent = new Intent(this,P23Activity.class);
        startActivity(intent);
    }
    public void openP23(){
        Intent intent = new Intent(this,P24Activity.class);
        startActivity(intent);
    }public void openP24(){
        Intent intent = new Intent(this,P25Activity.class);
        startActivity(intent);
    }public void openP25(){
        Intent intent = new Intent(this,P26Activity.class);
        startActivity(intent);
    }
}
