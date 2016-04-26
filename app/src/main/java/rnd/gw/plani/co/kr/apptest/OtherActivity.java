package rnd.gw.plani.co.kr.apptest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {

    ArrayList al;
    ArrayAdapter<String > arrayAdapter;

    private static final String URL = "147.46.109.56:10423/";
    private static final String HANDLER_NAME = "echo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Toast.makeText(this,"other",Toast.LENGTH_SHORT).show();

//        SwipeFlingAdapterView flingContainer =
//                (SwipeFlingAdapterView) findViewById(R.id.frame);
//        arrayAdapter = new ArrayAdapter<String>(this,
//                R.layout.item, R.id.helloText, al );
//        flingContainer.setAdapter(arrayAdapter);
        Button btn = (Button)findViewById(R.id.btn_connect);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
