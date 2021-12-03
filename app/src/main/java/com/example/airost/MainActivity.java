package com.example.airost;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.android.material.snackbar.Snackbar;

import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22;
    int junction=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button13=(Button) findViewById(R.id.button13);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);
        button18=(Button) findViewById(R.id.button18);
        button19=(Button) findViewById(R.id.button19);
        button20=(Button) findViewById(R.id.button20);
        button21=(Button) findViewById(R.id.button21);
        button22=(Button) findViewById(R.id.button22);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            junction=1;



            AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Are you sure you are going to junction "+junction+" ?");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {   Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                    snackbar.show();
                    access(1);
                    button1.setBackgroundColor(Color.BLUE);
                    button2.setBackgroundColor(Color.RED);
                    button3.setBackgroundColor(Color.RED);
                    button4.setBackgroundColor(Color.RED);
                    button5.setBackgroundColor(Color.RED);
                    button6.setBackgroundColor(Color.RED);
                    button7.setBackgroundColor(Color.RED);
                    button8.setBackgroundColor(Color.RED);
                    button9.setBackgroundColor(Color.RED);
                    button10.setBackgroundColor(Color.RED);
                    button11.setBackgroundColor(Color.RED);
                    button12.setBackgroundColor(Color.RED);
                    button13.setBackgroundColor(Color.RED);
                    button14.setBackgroundColor(Color.RED);
                    button15.setBackgroundColor(Color.RED);
                    button16.setBackgroundColor(Color.RED);
                    button17.setBackgroundColor(Color.RED);
                    button18.setBackgroundColor(Color.RED);
                    button19.setBackgroundColor(Color.RED);
                    button20.setBackgroundColor(Color.RED);
                    button21.setBackgroundColor(Color.RED);
                    button22.setBackgroundColor(Color.RED);


            }
    } );
        builder.show();}

    });







            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    junction=2;



                    AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                            snackbar.show();
                            access(2);

                            button1.setBackgroundColor(Color.RED);
                            button2.setBackgroundColor(Color.BLUE);
                            button3.setBackgroundColor(Color.RED);
                            button4.setBackgroundColor(Color.RED);
                            button5.setBackgroundColor(Color.RED);
                            button6.setBackgroundColor(Color.RED);
                            button7.setBackgroundColor(Color.RED);
                            button8.setBackgroundColor(Color.RED);
                            button9.setBackgroundColor(Color.RED);
                            button10.setBackgroundColor(Color.RED);
                            button11.setBackgroundColor(Color.RED);
                            button12.setBackgroundColor(Color.RED);
                            button13.setBackgroundColor(Color.RED);
                            button14.setBackgroundColor(Color.RED);
                            button15.setBackgroundColor(Color.RED);
                            button16.setBackgroundColor(Color.RED);
                            button17.setBackgroundColor(Color.RED);
                            button18.setBackgroundColor(Color.RED);
                            button19.setBackgroundColor(Color.RED);
                            button20.setBackgroundColor(Color.RED);
                            button21.setBackgroundColor(Color.RED);
                            button22.setBackgroundColor(Color.RED);
                        }




                    });
                    builder.show();



    }});

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=3;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(3);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.BLUE);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=4;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(4);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.BLUE);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=5;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(5);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.BLUE);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=6;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(6);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.BLUE);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=7;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(7);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.BLUE);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=8;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(8);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.BLUE);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=9;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(9);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.BLUE);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=10;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(10);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.BLUE);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=11;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(11);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.BLUE);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=12;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(12);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.BLUE);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=13;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(13);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.BLUE);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=14;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(14);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.BLUE);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=15;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(15);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.BLUE);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=16;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(16);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.BLUE);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=17;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(17);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.BLUE);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=18;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(18);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.BLUE);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=19;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(19);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.BLUE);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
junction=0;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to starting point?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards starting point, please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(0);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.BLUE);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=20;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(20);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.BLUE);
                        button22.setBackgroundColor(Color.RED);
                    }




                });
                builder.show();



            }});
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                junction=21;



                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Are you sure you are going to junction "+junction+" ?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    { Snackbar  snackbar=Snackbar.make(v,"The car is heading towards junction "+junction+" please hold on",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                        access(21);
                        button1.setBackgroundColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                        button13.setBackgroundColor(Color.RED);
                        button14.setBackgroundColor(Color.RED);
                        button15.setBackgroundColor(Color.RED);
                        button16.setBackgroundColor(Color.RED);
                        button17.setBackgroundColor(Color.RED);
                        button18.setBackgroundColor(Color.RED);
                        button19.setBackgroundColor(Color.RED);
                        button20.setBackgroundColor(Color.RED);
                        button21.setBackgroundColor(Color.RED);
                        button22.setBackgroundColor(Color.BLUE);
                    }




                });
                builder.show();



            }});


    }
public void access(int junction){
    JsonPlaceHolderApi jsonPlaceHolderApi = RetrofitClient.getRetrofitInstance().create(JsonPlaceHolderApi.class);
    Call<getjunction> call = jsonPlaceHolderApi.getPosts(junction);
    call.enqueue(new Callback<getjunction>() {
        @Override
        public void onResponse(Call<getjunction> call, Response<getjunction> response) {

            Toast.makeText(MainActivity.this,response.body().toString(),Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onFailure(Call<getjunction> call, Throwable t) {

        }
    });}
   }


