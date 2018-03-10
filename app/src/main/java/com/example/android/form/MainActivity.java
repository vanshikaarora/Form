package com.example.android.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
boolean value1=false,value2=false,value3=false,value=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.stream1:
                if (checked)
                    value1=true;
                      break;
            case R.id.stream2:
                if (checked)
                    value1=false;
                break;
        }
    }
    public void onClickedyear(View view) {
        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()) {
            case R.id.year1:
                if (checked)
                    value2=false;
                break;

            case R.id.year2:
                if (checked)
                    value2=false;
                break;
            case R.id.year3:
                if (checked)
                    value2=true;
                break;
            case R.id.year4:
                if (checked)
                    value2=false;
                break;
        }
    }
    public void onClickedbranch(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.branch1:
                if (checked)
                    value3=true;
                break;
            case R.id.branch2:
                if (checked)
                    value3=false;
                break;
            case R.id.branch3:
                if (checked)
                    value3=false;
                break;
            case R.id.year4:
                if (checked)
                    value3=false;
                break;
        }
    }
    public void onCheckboxclicked(View view){
        boolean checked1 = ((CheckBox) view).isChecked();

    }
    public void submitorder(View view)
    {EditText text1 = (EditText)findViewById(R.id.user_id);
    String name=text1.getText().toString();
    EditText text2 = (EditText)findViewById(R.id.user_password);
    String password=text2.getText().toString();
    CheckBox  hasChecked= (CheckBox) findViewById(R.id.interest3);
    boolean value= hasChecked.isChecked();

    if (name.equals("17JE003035") && password.equals("7028106") && value1==true && value2==true && value3==true && value ==true)
        displayMessage("Your credentials are verified. Login successful!");
    else displayMessage("Sorry you cannot access the page!");

    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.summary);
        priceTextView.setText(message);
    }
}
