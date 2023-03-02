package com.example.guessnogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     RadioGroup rg;
     RadioButton opta ,optb ,optc ,optd;
     Button subbtn,guessbtn,repeatbtn,againbtn,startbtn,quitbtn,sub1btn;
     EditText editText;
     TextView textView,text1;
     int count=1,num=0,guess,answer ;
    boolean isrunning = true;




    String[] option={"select your choice "};
    String[] istopt={"pattern A"};
    String[] twoopt={"pattern B"};
    String[] threeopt={"pattern C"};
    String[] fouropt={"pattern D"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectxml();


            subbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    int id=-1;
                    id = rg.getCheckedRadioButtonId();
                    switch (id) {
                        case R.id.istopt:
                            num = istopt(count);
                            Toast.makeText(getApplicationContext(), "  selected pattern A", Toast.LENGTH_SHORT).show();
                            break;

                        case  R.id.twoopt:
                            num = twoopt(count);
                            Toast.makeText(getApplicationContext(), "  selected pattern B", Toast.LENGTH_SHORT).show();
                            break;

                        case  R.id.threeopt:
                            num = threeopt(count);
                            Toast.makeText(getApplicationContext(), "  selected pattern C", Toast.LENGTH_SHORT).show();
                            break;

                        case  R.id.fouropt:
                            num = fouropt(count);
                            Toast.makeText(getApplicationContext(), "  selected pattern D", Toast.LENGTH_SHORT).show();
                            break;


                    }
                    //Toast.makeText(getApplicationContext(),"   no is " ,Toast.LENGTH_SHORT).show();
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(" no is "+ num);
                    subbtn.setVisibility(View.GONE);
                    guessbtn.setVisibility(View.VISIBLE);
                    repeatbtn.setVisibility(View.VISIBLE);
                    againbtn.setVisibility(View.GONE);
                    startbtn.setVisibility(View.GONE);
                    quitbtn.setVisibility(View.GONE);
                    editText.setVisibility(View.GONE);
                    sub1btn.setVisibility(View.GONE);
                    rg.setVisibility(View.GONE);
//                    textView.setVisibility(View.GONE);




                }




            });



            repeatbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                     count++;
                     int repeat;
                     repeat=rg.getCheckedRadioButtonId();
                     switch(repeat){
                         case R.id.istopt:
                             num = istopt(count);

                             break;

                         case  R.id.twoopt:
                             num = twoopt(count);

                             break;

                         case  R.id.threeopt:
                             num = threeopt(count);

                             break;

                         case  R.id.fouropt:
                             num = fouropt(count);

                             break;


                     }

                    text1.setText(" no is "+ num);
                    subbtn.setVisibility(View.GONE);
                    guessbtn.setVisibility(View.VISIBLE);
                    repeatbtn .setVisibility(View.VISIBLE);
                    againbtn.setVisibility(View.GONE);
                    startbtn.setVisibility(View.GONE);
                    quitbtn.setVisibility(View.GONE);
                   editText.setVisibility(View.GONE);
                    sub1btn.setVisibility(View.GONE);
                   // textView.setVisibility(View.GONE);

                }
            });
            againbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count++;



                    subbtn.setVisibility(View.GONE);
                    guessbtn.setVisibility(View.VISIBLE);
                    repeatbtn .setVisibility(View.VISIBLE);
                    againbtn.setVisibility(View.GONE);
                    startbtn.setVisibility(View.GONE);
                    quitbtn.setVisibility(View.GONE);
                    //editText.setVisibility(View.GONE);
                    sub1btn.setVisibility(View.GONE);

                }
            });
            startbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changeopt();
                    subbtn.setVisibility(View.VISIBLE);
                    guessbtn.setVisibility(View.GONE);
                    repeatbtn .setVisibility(View.GONE);
                    againbtn.setVisibility(View.GONE);
                    startbtn.setVisibility(View.GONE);
                    quitbtn.setVisibility(View.GONE);
                    //editText.setVisibility(View.GONE);
                    sub1btn.setVisibility(View.GONE);

                }
            });
            quitbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isrunning = false;
                    System.exit(0);
                    Toast.makeText(getApplicationContext()," thanks for playing ",Toast.LENGTH_SHORT).show();

                }
            });
            sub1btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (guess)
                    {
                        case 1:
                            answer = istopt(count);
                        case 2:
                            answer = twoopt(count);

                        case 3:
                            answer = threeopt(count);

                        case 4:
                            answer = fouropt(count);



                    }
                    if (guess == answer)
                    {
                        text1.setText(" u win");
                    }
                    else {
                        text1.setText(" u loose");
                    }
                }
            });
            guessbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    editText.setVisibility(View.VISIBLE);
                    subbtn.setVisibility(View.VISIBLE);

                    guessbtn.setVisibility(View.GONE);
                    repeatbtn .setVisibility(View.GONE);
                    againbtn.setVisibility(View.GONE);
                    startbtn.setVisibility(View.GONE);
                    quitbtn.setVisibility(View.GONE);
                    sub1btn.setVisibility(View.GONE);

                   // EditText=getText(R.id.editText);
//



                }

            });
        }







    public int istopt(int count) {
        int a = 2 + count;
        return a;

    }

    public int twoopt(int count) {
        int b = 3 * count;
        return b;
    }

    public int threeopt(int count) {
        int c = 4 * count;
        return c;
    }

    public int fouropt(int count) {
        int d = 5 * count;
        return d;
    }
    public void changeopt()
    {
        textView.setText(option[count]);
        opta.setText(istopt[count]);
        optb.setText(twoopt[count]);
        optc.setText(threeopt[count]);
        optd.setText(fouropt[count]);
    }

    public void connectxml() {
        opta=findViewById(R.id.istopt);
        optb=findViewById(R.id.twoopt);
        optc=findViewById(R.id.threeopt);
        optd=findViewById(R.id.fouropt);
        rg= findViewById(R.id.rg);
        subbtn=findViewById(R.id.subbtn);
        guessbtn=findViewById(R.id.guessbtn);
        repeatbtn=findViewById(R.id.repeatbtn);
        againbtn=findViewById(R.id.againbtn);
        startbtn=findViewById(R.id.startbtn);
        quitbtn=findViewById(R.id.quitbtn);
        sub1btn=findViewById(R.id.sub1btn);
        text1=findViewById(R.id.text1);
        editText=findViewById(R.id.editText);
    }

}

