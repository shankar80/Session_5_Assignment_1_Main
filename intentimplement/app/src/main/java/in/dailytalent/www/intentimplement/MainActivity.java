package in.dailytalent.www.intentimplement;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button vibrate_bt1;
    EditText search_txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        vibrate_bt1=(Button)findViewById(R.id.vibrate_bt);
        search_txt1 = (EditText)findViewById(R.id.search_txt);

        vibrate_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search_txt2= search_txt1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/#q="+search_txt2));
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Vibrate Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
