package edu.softwarica.android.assignment.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed_weight, ed_height;
    TextView txt_bmi;
    Button btn_bmi;
    BMI bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed_weight = findViewById(R.id.ed_weight);
        ed_height = findViewById(R.id.ed_height);
        txt_bmi = findViewById(R.id.txt_bmi);
        btn_bmi = findViewById(R.id.btn_bmi);
        btn_bmi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast toast;
        float bmiValue;
        switch (v.getId()) {
            case R.id.btn_bmi:
                bmi = new BMI(Float.parseFloat(ed_weight.getText().toString()),
                        Float.parseFloat(ed_height.getText().toString()));
                bmiValue = bmi.bmiCalulate();
                txt_bmi.setText("BMI: " + bmiValue);
                txt_bmi.setVisibility(View.VISIBLE);
                if (bmiValue < 18.5){
                    toast = Toast.makeText(this, "Underweight", Toast.LENGTH_LONG);
                    toast.show();
                }else if(bmiValue < 24.9){
                    toast = Toast.makeText(this, "Normal", Toast.LENGTH_LONG);
                    toast.show();
                }else if (bmiValue < 29.9){
                    toast = Toast.makeText(this, "Overweight", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    toast = Toast.makeText(this, "Obesity", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            default:
                break;
        }
    }
}
