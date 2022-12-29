package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int couter=0;
    int[]aa={0,0,0,0,0,0,0,0,0};
    public void drop(View view)
    {

        ImageView image =(ImageView) view;
        TextView textView=(TextView) findViewById(R.id.textViewttt);
        int a= Integer.parseInt(view.getTag().toString());
        if(aa[a]==0) {
            if (couter == 0) {
                if (aa[a] == 0) {
                    image.setTranslationY(-1500);
                    image.setImageResource(R.drawable.img_2);
                    aa[a] = 2;
                    image.animate().translationYBy(1500).setDuration((500));
                    couter++;
                    textView.animate().setDuration(500);
                    textView.setText("O's Turn");
                    couter = 1;
                }
            } else {
                if (aa[a] == 0) {
                    image.setTranslationY(-1500);
                    image.setImageResource(R.drawable.img_1);
                    aa[a] = 1;
                    image.animate().translationYBy(1500).setDuration((500));
                    couter = 0;
                    textView.animate().setDuration(500);
                    textView.setText("X's Turn");

                }
            }
            int d=0;
            for(int i=0;i<9;i++)
            {
                if(aa[i]==0)
                {
                    d=1;
                    break;
                }
            }
            if(d==0)
            {
                textView.setText("Game Draw");
            }
            if ((aa[0] == 1 && aa[1] == 1 && aa[2] == 1) || (aa[3] == 1 && aa[4] == 1 && aa[5] == 1) || (aa[6] == 1 && aa[7] == 1 && aa[8] == 1) || (aa[0] == 1 && aa[3] == 1 && aa[6] == 1) || (aa[1] == 1 && aa[4] == 1 && aa[7] == 1) || (aa[2] == 1 && aa[5] == 1 && aa[8] == 1) || (aa[0] == 1 && aa[4] == 1 && aa[8] == 1) || (aa[2] == 1 && aa[4] == 1 && aa[6] == 1)) {
                textView.setText("O Won Game");
                for(int i=0;i<9;i++)
                {
                    aa[i]=1;
                }
            }
            if ((aa[0] == 2 && aa[1] == 2 && aa[2] == 2) || (aa[3] == 2 && aa[4] == 2 && aa[5] == 2) || (aa[6] == 2 && aa[7] == 2 && aa[8] == 2) || (aa[0] == 2 && aa[3] == 2 && aa[6] == 2) || (aa[1] == 2 && aa[4] == 2 && aa[7] == 2) || (aa[2] == 2 && aa[5] == 2 && aa[8] == 2) || (aa[0] == 2 && aa[4] == 2 && aa[8] == 2) || (aa[2] == 2 && aa[4] == 2 && aa[6] == 2)) {
                textView.setText("X Won Game");
                for(int i=0;i<9;i++)
                {
                    aa[i]=2;
                }
            }
        }
    }


    public void reset(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        ActivityCompat.finishAffinity(MainActivity2.this);

    }
}