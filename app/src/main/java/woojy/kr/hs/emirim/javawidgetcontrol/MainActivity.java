package woojy.kr.hs.emirim.javawidgetcontrol;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //중요함

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        TextView text3 = (TextView) findViewById(R.id.text3);
        TextView text4 = (TextView) findViewById(R.id.text4);

        text1.setText("First TextView");
        text1.setTextSize(30);
        text1.setBackgroundColor(Color.rgb(255,0,255));
        text1.setTextColor(Color.WHITE);

        text2.setText(R.string.text_str);
        text2.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);

        text3.setText(R.string.text_str1);
        text3.setBackgroundColor(Color.GRAY);
        text3.setTextSize(20);
        text3.setTypeface(Typeface.MONOSPACE);

        text4.setText(R.string.text_str2);
        text4.setTextColor(Color.GRAY);
        text4.setBackgroundColor(Color.WHITE);
    }
}
