package gustavo.me.gustavocalzada.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;  //EditText para el textview numerico
    private  EditText et2;
    private TextView tv1;  //TextView para el textview suma


    @Override
    protected void onCreate(Bundle savedInstanceState) { // CREA EL ACTIVITY
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Clase R es una clase que AndroidStudio que nos sirve como puente de comunicación entre la parte lógica y gráfica

        et1 = (EditText)findViewById(R.id.num1); //Encuentra la vista por su ID, en la clase R
        et2 = (EditText)findViewById(R.id.num2);
        tv1 = (TextView)findViewById(R.id.resultado);
    }

    //Este método realiza la Suma
    public void Sumar(View view1){
        String valor1 = et1.getText().toString(); //Almacena en valor1 el valor de et1 y lo convierte a String
        String valor2 = et2.getText().toString();

        int num1 =  Integer.parseInt(valor1); //Ahora como es puro numero, lo convertimos a Entero haciendo un parseo
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2 ;

        String resultado = String.valueOf(suma); //Se hace un parseo de entero a String para mostrarlo
        tv1.setText(resultado);
    }


}