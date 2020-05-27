package sg.edu.rp.c346.id18015497.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtPassMod1;
    TextView txtPassMod2;
    TextView txtPassMod3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPassMod1 = findViewById(R.id.textView);
        txtPassMod2 = findViewById(R.id.textView2);
        txtPassMod3 = findViewById(R.id.textView3);

        txtPassMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67R");
                startActivity(intent);
            }
        });

        txtPassMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C322");
                intent.putExtra("name", "Data Centre and Cloud Mgmt");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E61G");
                startActivity(intent);
            }
        });

        txtPassMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C382");
                intent.putExtra("name", "IT Service Delivery");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67R");
                startActivity(intent);
            }
        });
    }
}
