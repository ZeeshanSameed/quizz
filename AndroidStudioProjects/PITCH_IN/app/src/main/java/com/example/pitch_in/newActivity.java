package com.example.pitch_in;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class newActivity extends AppCompatActivity {

    String[] type = { "Traditional","Auctional"};
    String[] member = { "Customize","Random"};
    RadioGroup radioType , radioMembers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        EditText saveAmount = findViewById(R.id.saveAmount);
        EditText payment = findViewById(R.id.payment);
        EditText period = findViewById(R.id.period);
//        RadioGroup radioType , radioMembers;


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice, type);
//        //Find TextView control
//        AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.type1);
//        //Set the number of characters the user must type before the drop down list is shown
//        acTextView.setThreshold(1);
//        //Set the adapter
//        acTextView.setAdapter(adapter);
//
//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice, member);
//        //Find TextView control
//        AutoCompleteTextView acTextView1 = (AutoCompleteTextView) findViewById(R.id.members1);
//        //Set the number of characters the user must type before the drop down list is shown
//        acTextView1.setThreshold(1);
//        //Set the adapter
//        acTextView1.setAdapter(adapter1);

        RadioGroup radioType1 = (RadioGroup) findViewById(R.id.radioType);

        radioType1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioTraditional:
                        // do operations specific to this selection
                        Toast.makeText(newActivity.this, "Traditional", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioAuctional:
                        // do operations specific to this selection
                        Toast.makeText(newActivity.this, "Auctional", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        RadioGroup radioType2 = (RadioGroup) findViewById(R.id.radioMembers);

        radioType2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioRandom:
                        // do operations specific to this selection
                        Toast.makeText(newActivity.this, "Random", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioCustomize:
                        // do operations specific to this selection
                        Toast.makeText(newActivity.this, "Customize", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }



    }

