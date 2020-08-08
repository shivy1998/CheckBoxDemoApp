package lockdown.org.checkboxdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnSubmit;
    CheckBox cbFriends, cbNewsPaper, cbOthers, cbWebsite;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnSubmit = findViewById(R.id.btnSubmit);
        cbFriends = findViewById(R.id.cbFriends);
        cbWebsite = findViewById(R.id.cbWebsite);
        cbNewsPaper = findViewById(R.id.cbNewsPaper);
        cbOthers = findViewById(R.id.cbOthers);
        btnSubmit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                StringBuffer sb = new StringBuffer();
                if (cbFriends.isChecked())
                {
                    sb.append("Friends ");
                }
                if (cbWebsite.isChecked()) {
                    sb.append("Website ");
                }
                if (cbNewsPaper.isChecked()) {
                    sb.append("Newspaper ");
                }
                if (cbOthers.isChecked()) {
                    sb.append("Others ");
                }
                Toast.makeText(MainActivity.this, "Selected options : " + sb.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}