package gustavo.me.gustavocalzada.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // CREA EL ACTIVITY
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int matematicas = 5;
        int quimica =  5;
        int fisica = 5;
        int promedio = 0;

        promedio = (matematicas + quimica + fisica) / (3);

        if(promedio >= 6) {
            Toast.makeText(this,"Alumno Aprobado", Toast.LENGTH_SHORT).show();
        } else if(promedio <= 5) {
            Toast.makeText(this, "Alumno Reprobado", Toast.LENGTH_SHORT).show();
        }


        



    }
}