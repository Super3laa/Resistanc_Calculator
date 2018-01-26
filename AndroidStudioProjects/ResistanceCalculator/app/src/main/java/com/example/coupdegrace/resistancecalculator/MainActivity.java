package com.example.coupdegrace.resistancecalculator;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    public  Button band1,band2,band3,band4;
    ImageButton about;
    final Context context = this;
    public TextView ans;
    public long x=0,y=0,z=0;
    public  int t= 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about=(ImageButton)findViewById(R.id.about);

        band1 = (Button)findViewById(R.id.band1);
        band2 = (Button)findViewById(R.id.band2);
        band3 = (Button)findViewById(R.id.band3);
        band4 = (Button)findViewById(R.id.band4);

        ans = (TextView)findViewById(R.id.textView2);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);
            }
        });

        band4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog bandDialog = new Dialog(context);
                bandDialog.setContentView(R.layout.tolerance);
                bandDialog.show();
                Button Gold = (Button)bandDialog.findViewById(R.id.Gold);
                Button Silver = (Button)bandDialog.findViewById(R.id.Silver);

                Gold.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t=5;
                        Ans();
                        band4.setText("Gold 5%");
                        band4.setBackgroundResource(R.color.gold);
                        bandDialog.dismiss();

                    }
                });
                Silver.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t=10;
                        Ans();
                        band4.setText("Silver 10%");
                        band4.setBackgroundResource(R.color.silver);
                        bandDialog.dismiss();

                    }
                });

            }
        });


        band3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final Dialog bandDialog = new Dialog(context);
                bandDialog.setContentView(R.layout.color_band);
                bandDialog.show();
                Button red = (Button)bandDialog.findViewById(R.id.Red);
                Button black = (Button)bandDialog.findViewById(R.id.Black);
                Button brown = (Button)bandDialog.findViewById(R.id.Brown);
                Button orange = (Button)bandDialog.findViewById(R.id.Orange);
                Button yellow = (Button)bandDialog.findViewById(R.id.Yellow);
                Button blue = (Button)bandDialog.findViewById(R.id.Blue);
                Button green = (Button)bandDialog.findViewById(R.id.Green);
                Button violet = (Button)bandDialog.findViewById(R.id.Violet);
                Button grey = (Button)bandDialog.findViewById(R.id.Grey);
                Button white = (Button)bandDialog.findViewById(R.id.White);



                red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z = 2;
                        Ans();
                        band3.setText("Red");
                        band3.setBackgroundResource(R.color.red);
                        bandDialog.dismiss();

                    }
                });
                black.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=0;
                        Ans();
                        band3.setText("Black");
                        band3.setBackgroundResource(R.color.black);
                        bandDialog.dismiss();
                    }
                });
                brown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=1;
                        Ans();
                        band3.setText("Brown");
                        band3.setBackgroundResource(R.color.brown);
                        bandDialog.dismiss();
                    }
                });
                orange.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=3;
                        Ans();
                        band3.setText("Orange");
                        band3.setBackgroundResource(R.color.orange);
                        bandDialog.dismiss();
                    }
                });
                yellow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=4;
                        Ans();
                        band3.setText("Yellow");
                        band3.setBackgroundResource(R.color.yellow);
                        bandDialog.dismiss();
                    }
                });
                green.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=5;
                        Ans();
                        band3.setText("Green");
                        band3.setBackgroundResource(R.color.green);
                        bandDialog.dismiss();
                    }
                });
                blue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=6;
                        Ans();
                        band3.setText("Blue");
                        band3.setBackgroundResource(R.color.blue);
                        bandDialog.dismiss();
                    }
                });
                violet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=8;
                        Ans();
                        band3.setText("Violet");
                        band3.setBackgroundResource(R.color.violet);
                        bandDialog.dismiss();
                    }

                });
                grey.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=8;
                        Ans();
                        band3.setText("Grey");
                        band3.setBackgroundResource(R.color.grey);
                        bandDialog.dismiss();
                    }
                });
                white.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z=9;
                        Ans();
                        band3.setText("White");
                        band3.setBackgroundResource(R.color.white);
                        band3.setTextColor(Color.BLACK);
                        bandDialog.dismiss();
                    }
                });



            }
        });














        band2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final Dialog bandDialog = new Dialog(context);
                bandDialog.setContentView(R.layout.color_band);
                bandDialog.show();
                Button red = (Button)bandDialog.findViewById(R.id.Red);
                Button black = (Button)bandDialog.findViewById(R.id.Black);
                Button brown = (Button)bandDialog.findViewById(R.id.Brown);
                Button orange = (Button)bandDialog.findViewById(R.id.Orange);
                Button yellow = (Button)bandDialog.findViewById(R.id.Yellow);
                Button blue = (Button)bandDialog.findViewById(R.id.Blue);
                Button green = (Button)bandDialog.findViewById(R.id.Green);
                Button violet = (Button)bandDialog.findViewById(R.id.Violet);
                Button grey = (Button)bandDialog.findViewById(R.id.Grey);
                Button white = (Button)bandDialog.findViewById(R.id.White);



                red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y = 2;
                        Ans();
                        band2.setText("Red");
                        band2.setBackgroundResource(R.color.red);
                        bandDialog.dismiss();

                    }
                });
                black.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=0;
                        Ans();
                        band2.setText("Black");
                        band2.setBackgroundResource(R.color.black);
                        bandDialog.dismiss();
                    }
                });
                brown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=1;
                        Ans();
                        band2.setText("Brown");
                        band2.setBackgroundResource(R.color.brown);
                        bandDialog.dismiss();
                    }
                });
                orange.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=3;
                        Ans();
                        band2.setText("Orange");
                        band2.setBackgroundResource(R.color.orange);
                        bandDialog.dismiss();
                    }
                });
                yellow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=4;
                        Ans();
                        band2.setText("Yellow");
                        band2.setBackgroundResource(R.color.yellow);
                        bandDialog.dismiss();
                    }
                });
                green.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=5;
                        Ans();
                        band2.setText("Green");
                        band2.setBackgroundResource(R.color.green);
                        bandDialog.dismiss();
                    }
                });
                blue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=6;
                        Ans();
                        band2.setText("Blue");
                        band2.setBackgroundResource(R.color.blue);
                        bandDialog.dismiss();
                    }
                });
                violet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=8;
                        Ans();
                        band2.setText("Violet");
                        band2.setBackgroundResource(R.color.violet);
                        bandDialog.dismiss();
                    }

                });
                grey.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=8;
                        Ans();
                        band2.setText("Grey");
                        band2.setBackgroundResource(R.color.grey);
                        bandDialog.dismiss();
                    }
                });
                white.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        y=9;
                        Ans();
                        band2.setText("White");
                        band2.setBackgroundResource(R.color.white);
                        band2.setTextColor(Color.BLACK);
                        bandDialog.dismiss();
                    }
                });



            }
        });




        band1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final Dialog bandDialog = new Dialog(context);
                bandDialog.setContentView(R.layout.color_band);
                bandDialog.show();
                Button red = (Button)bandDialog.findViewById(R.id.Red);
                final Button black = (Button)bandDialog.findViewById(R.id.Black);
                Button brown = (Button)bandDialog.findViewById(R.id.Brown);
                Button orange = (Button)bandDialog.findViewById(R.id.Orange);
                Button yellow = (Button)bandDialog.findViewById(R.id.Yellow);
                Button blue = (Button)bandDialog.findViewById(R.id.Blue);
                Button green = (Button)bandDialog.findViewById(R.id.Green);
                Button violet = (Button)bandDialog.findViewById(R.id.Violet);
                Button grey = (Button)bandDialog.findViewById(R.id.Grey);
                Button white = (Button)bandDialog.findViewById(R.id.White);



                red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x = 2;
                        Ans();
                        band1.setText("Red");
                        band1.setBackgroundResource(R.color.red);
                        bandDialog.dismiss();

                    }
                });
                black.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=0;
                        Ans();
                        band1.setText("Black");
                        band1.setBackgroundResource(R.color.black);
                        bandDialog.dismiss();
                    }
                });
                brown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=1;
                        Ans();
                        band1.setText("Brown");
                        band1.setBackgroundResource(R.color.brown);
                        bandDialog.dismiss();
                    }
                });
                orange.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=3;
                        Ans();
                        band1.setText("Orange");
                        band1.setBackgroundResource(R.color.orange);
                        bandDialog.dismiss();
                    }
                });
                yellow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=4;
                        Ans();
                        band1.setText("Yellow");
                        band1.setBackgroundResource(R.color.yellow);
                        bandDialog.dismiss();
                    }
                });
                green.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=5;
                        Ans();
                        band1.setText("Green");
                        band1.setBackgroundResource(R.color.green);
                        bandDialog.dismiss();
                    }
                });
                blue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=6;
                        Ans();
                        band1.setText("Blue");
                        band1.setBackgroundResource(R.color.blue);
                        bandDialog.dismiss();
                    }
                });
                violet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=8;
                        Ans();
                        band1.setText("Violet");
                        band1.setBackgroundResource(R.color.violet);
                        bandDialog.dismiss();
                    }

                });
                grey.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=8;
                        Ans();
                        band1.setText("Grey");
                        band1.setBackgroundResource(R.color.grey);
                        bandDialog.dismiss();
                    }
                });
                white.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        x=9;
                        Ans();
                        band1.setText("White");
                        band1.setBackgroundResource(R.color.white);
                        band1.setTextColor(Color.BLACK);
                        bandDialog.dismiss();
                    }
                });



            }
        });






    }

    public void Ans(){
        long val = (long) (((x*10)+y)*(Math.pow(10,z)));
        ans.setText(String.valueOf(val)+" ±"+ String.valueOf(t)+"%"+" Ω");

    }








}
