package com.tutorials.a8086basics;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorial extends Activity {

    private Button tutorial1;
    private Button tutorial2;
    private Button tutorial3;
    private Button tutorial4;
    private Button tutorial5;
    private Button tutorial6;
    private Button tutorial7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        tutorial1 = findViewById(R.id.tutorial1);
        tutorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openArchitecture();
            }
        });
        tutorial2 = findViewById(R.id.tutorial2);
        tutorial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPinDiagram();
            }
        });
        tutorial3 = findViewById(R.id.tutorial3);
        tutorial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opemAddressingModes();
            }
        });
        tutorial4 = findViewById(R.id.tutorial4);
        tutorial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstructionSet();
            }
        });
        tutorial5 = findViewById(R.id.tutorial5);
        tutorial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOperationMode();
            }
        });
        tutorial6 = findViewById(R.id.tutorial6);
        tutorial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimingDiagram();
            }
        });
        tutorial7 = findViewById(R.id.tutorial7);
        tutorial7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openAssemblerDirectives();
            }
        });
}
public void openArchitecture(){
    Intent intent = new Intent(this,Architecture.class);
    startActivity(intent);
}
public void openPinDiagram(){
    Intent intent = new Intent(this,PinDiagram.class);
    startActivity(intent);
}
public void opemAddressingModes(){
    Intent intent = new Intent(this,AddressingModes.class);
    startActivity(intent);
}
public void openInstructionSet(){
    Intent intent = new Intent(this,InstructionSet.class);
    startActivity(intent);
}
public void openOperationMode(){
    Intent intent = new Intent(this,OperationMode.class);
    startActivity(intent);
}
public void openTimingDiagram(){
    Intent intent = new Intent(this,TimingDiagram.class);
    startActivity(intent);
}
public void openAssemblerDirectives(){
    Intent intent = new Intent(this,AssemblerDirective.class);
    startActivity(intent);
}
}
