package com.example.atividade3;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bgTela;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgTela = findViewById(R.id.tela);
        texto = findViewById(R.id.texto);

        bgTela.setOnTouchListener( new OnSwipeTouchListener(MainActivity.this) {

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                texto.setText(getResources().getText(R.string.tvCima));
                texto.setTextColor( getRandomColor() );
                bgTela.setBackgroundColor( getRandomColor() );
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                texto.setText( getResources().getText(R.string.tvBaixo) );
                texto.setTextColor( getRandomColor() );
                bgTela.setBackgroundColor( getRandomColor() );
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                texto.setText( getResources().getText(R.string.tvEsquerda) );
                texto.setTextColor( getRandomColor() );
                bgTela.setBackgroundColor( getRandomColor() );
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                texto.setText( getResources().getText(R.string.tvDireita) );
                texto.setTextColor( getRandomColor() );
                bgTela.setBackgroundColor( getRandomColor() );
            }

        } );

    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

}
