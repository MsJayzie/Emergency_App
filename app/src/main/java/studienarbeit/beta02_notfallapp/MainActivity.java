package studienarbeit.beta02_notfallapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button1(View view) {
        Intent intent1 = new Intent(getApplicationContext(),Button1.class);
        startActivity(intent1);
    }
    public void Button2(View view) {
        Intent intent2 = new Intent(getApplicationContext(),Button2.class);
        startActivity(intent2);
    }
    public void Button3(View view) {
        Intent intent3 = new Intent(getApplicationContext(),Button2.class);
        startActivity(intent3);
    }
    public void Button4(View view) {
        Intent intent4 = new Intent(getApplicationContext(),Button2.class);
        startActivity(intent4);
    }
    public void Einstellungen(View view) {
        Intent intent4 = new Intent(getApplicationContext(),Einstellungen.class);
        startActivity(intent4);
    }

}
