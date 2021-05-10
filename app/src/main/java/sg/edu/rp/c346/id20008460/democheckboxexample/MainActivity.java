package sg.edu.rp.c346.id20008460.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    Button btnCheck;
    TextView disView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        disView = findViewById(R.id.textView);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "Inside onClick");
                if (checkBox.isChecked()) {
                    double pay = calcPay(100,20) ;
                    disView.setText("Discount given, pay " + pay);
                }

                else {
                    disView.setText("The discount is not given");
                }

                Toast.makeText(MainActivity.this, "Button Click",
                        Toast.LENGTH_LONG).show();


            }
        });
    }

    private double calcPay(double price, double discount) {
        return price * (1 - discount / 100);

    }
}