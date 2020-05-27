package sg.edu.rp.c346.id18015497.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.textView4);
        button = findViewById(R.id.button);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int year = intentReceived.getIntExtra("year",0);
        int sem = intentReceived.getIntExtra("sem",0);
        int credit = intentReceived.getIntExtra("credit",0);
        String venue = intentReceived.getStringExtra("venue");

        String tvOutput = (String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %d\nVenue: %s",code,name,year,sem,credit,venue));
        tvAnswer.setText(tvOutput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
