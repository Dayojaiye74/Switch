package com.dev_app.aswitch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare Switch as a global variable
    Switch isSwitched;
    TextView textView;
    ConstraintLayout layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //Call the Switch and TextView from the XML
        isSwitched = findViewById(R.id.switch1);
          textView = findViewById(R.id.textView);
          layout = findViewById(R.id.layout);

          // call the switch method in the OnCreate
        onSwitchClick(isSwitched);

    }

    //Create a method for the Switch

    public void onSwitchClick(View view) {
        if (isSwitched.isChecked()){
           textView.setText("Thank You for Switching :)");
           layout.setBackgroundColor(getColor(R.color.colorAccent));

        }
        else {
            textView.setText("Switch is Off");
            layout.setBackgroundColor(getColor(R.color.colorDark));


        }
    }
}
