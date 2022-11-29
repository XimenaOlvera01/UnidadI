package firebase.app.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre;
    private Button Limpiar;
    private Button Inicio;
    private TextView Nombree;
    private EditText PrimerApellido;
    private EditText SegundoApellido;
    private EditText Gmail;
    private EditText NumeroTelefonico;
    private EditText Localidad;
    private TextView AP;
    private TextView AM;
    private TextView GmailCorreo;
    private TextView Cel;
    private TextView Localida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = (EditText) findViewById(R.id.Nombre);
        Limpiar = (Button) findViewById(R.id.Limpiar);
        Nombree = (TextView) findViewById(R.id.Nombree);
        PrimerApellido = (EditText) findViewById(R.id.PrimerApellido);
        SegundoApellido = (EditText) findViewById(R.id.SegundoApellido);
        Gmail = (EditText) findViewById(R.id.Gmail);
        NumeroTelefonico = (EditText) findViewById(R.id.NumeroTelefonico);
        Localidad = (EditText) findViewById(R.id.Localidad);
        AP = (TextView) findViewById(R.id.AP);
        AM = (TextView) findViewById(R.id.AM);
        GmailCorreo = (TextView) findViewById(R.id.GmailCorreo);
        Cel = (TextView) findViewById(R.id.Cel);
        Localida = (TextView) findViewById(R.id.Localida);


        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar.setText("");
                Nombree.setText("");
                AP.setText("");
                AM.setText("");
                GmailCorreo.setText("");
                Cel.setText("");
                Localida.setText("");
            }
        });
    }
}