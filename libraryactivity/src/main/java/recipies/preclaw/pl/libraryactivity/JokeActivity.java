package recipies.preclaw.pl.libraryactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    static String JOKE_KEY = "joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView tv = findViewById(R.id.joke_tv);
        Bundle bundle = getIntent().getExtras();
        if(getIntent().hasExtra(JOKE_KEY)){
            String joke = bundle.getString(JOKE_KEY);

            tv.setText(joke);
        }


    }

}
