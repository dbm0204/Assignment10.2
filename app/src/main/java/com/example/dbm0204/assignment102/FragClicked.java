package com.example.dbm0204.assignment102;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Intent that paases which layout to inflate
 *
 */
public class FragClicked extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_clicked);

        text=(TextView)findViewById(R.id.textView);
        String data = getIntent().getExtras().getString("DATAPASSED");

        text.setText(data);
    }
}
