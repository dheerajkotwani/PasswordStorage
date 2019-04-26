package project.dheeraj.passwordstorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText password = findViewById(R.id.edit_text);
        Button submit = findViewById(R.id.button);
        final String pass = "dheeraj";

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.getText().toString().equals(pass))
                {
                    Toast toast=Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity.this, DataDisplay.class);
                    startActivity(intent);
                }
                else
                {
                    Toast toast=Toast.makeText(MainActivity.this,"Incorrect Password "+password.getText().toString(),Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}
