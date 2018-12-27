package com.example.saika.a05diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageview,imageView2;
    private ImageButton imageButton;
    private Random random=new Random();
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageview=findViewById(R.id.iv1);
        imageView2=findViewById(R.id.iv2);
        imageButton=findViewById(R.id.imageButton2);

//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               int a= rollDice();
//               int b= rollDice2();
//               String c=String.valueOf(a+b);
//                rotatedice();
//                Log.d("hlo",c );
//                Toast.makeText(getApplicationContext(),c,Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
    }


    public void btnclick(View view){
        int a= rollDice();
        int b= rollDice2();
        String c=String.valueOf(a+b);
        rotatedice();

        Toast.makeText(getApplicationContext(),c,Toast.LENGTH_SHORT).show();

}
    private void rotatedice(){
        animation=AnimationUtils.loadAnimation(this,R.anim.animation);
        imageview.startAnimation(animation);
        imageView2.startAnimation(animation);
    }

    private int rollDice(){
        int randomNumber=random.nextInt(6)+1;

        switch (randomNumber){
            case 1:
                imageView2.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.two);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.three);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.four);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.five);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.six);
                break;
        }
        return randomNumber;
    }

    private int  rollDice2(){
        int randomNumber2=random.nextInt(6)+1;

        switch (randomNumber2){
            case 1:
                imageview.setImageResource(R.drawable.one);
                break;
            case 2:
                imageview.setImageResource(R.drawable.two);
                break;
            case 3:
                imageview.setImageResource(R.drawable.three);
                break;
            case 4:
                imageview.setImageResource(R.drawable.four);
                break;
            case 5:
                imageview.setImageResource(R.drawable.five);
                break;
            case 6:
                imageview.setImageResource(R.drawable.six);
                break;
        }
        return randomNumber2;
    }
}

