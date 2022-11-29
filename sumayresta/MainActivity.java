package firebase.app.sumayresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private RadioButton rb1, rb2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);

        tv3 = (TextView) findViewById(R.id.tv3);
    }

    public void operaciones(View view) {
        int num1, num2;
        int suma, resta;

        num1 = Integer.parseInt(et1.getText().toString());
        num2 = Integer.parseInt(et2.getText().toString());

        if (rb1.isChecked() == true) {
            suma = num1 + num2;
            tv3.setText("RESULTADO:  " + suma);

        } else {
            if (rb2.isChecked() == true) {
                resta = num1 - num2;
                tv3.setText("RESULTADO:  " + resta);
            }
        }
    }
}