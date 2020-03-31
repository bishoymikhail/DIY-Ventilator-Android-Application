package com.example.ventilatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;


public class MainActivity extends AppCompatActivity {
    ElegantNumberButton humiditybtn;
    ElegantNumberButton Tempbtn;
    ElegantNumberButton Obtn;
    ElegantNumberButton PIPbtn;
    ElegantNumberButton PEEPbtn;
    ElegantNumberButton RRbtn;
    ElegantNumberButton Ibtn;
    ElegantNumberButton Ebtn;
    ElegantNumberButton Heightbtn;
    ElegantNumberButton Weightbtn;

    Switch HumidifierSwitch;
    Switch OxygenSwitch;
    Switch BiPapSwitch;
    Switch CPapSwitch;
    Switch assistSwitch;
    String OSwitch;
    String HSwitch;
    String operatingMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        humiditybtn = (ElegantNumberButton)findViewById(R.id.humidityButton);
        humiditybtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=humiditybtn.getNumber();
                Log.e("NUM",num);
            }
        });
        Tempbtn = (ElegantNumberButton)findViewById(R.id.TempButton);
        Tempbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=Tempbtn.getNumber();
                Log.e("NUM",num);
            }
        });
        Obtn = (ElegantNumberButton)findViewById(R.id.TempButton);
        Obtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=Obtn.getNumber();
                Log.e("NUM",num);
            }
        });
        PIPbtn = (ElegantNumberButton)findViewById(R.id.PIPButton);
        PIPbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=PIPbtn.getNumber();
                Log.e("NUM",num);
            }
        });
        PEEPbtn = (ElegantNumberButton)findViewById(R.id.PEEPButton);
        PEEPbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=PEEPbtn.getNumber();
                Log.e("NUM",num);
            }
        });
        RRbtn = (ElegantNumberButton)findViewById(R.id.RRButton);
        RRbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=RRbtn.getNumber();
                Log.e("NUM",num);
            }
        });
        Ibtn = (ElegantNumberButton)findViewById(R.id.IButton);
        Ibtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=Ibtn.getNumber();
                Log.e("NUM",num);
            }
        });
        Ebtn = (ElegantNumberButton)findViewById(R.id.EButton);
        Ebtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=Ebtn.getNumber();
                Log.e("NUM",num);
            }
        });
        Heightbtn = (ElegantNumberButton)findViewById(R.id.HeightButton);
        Heightbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=Heightbtn.getNumber();
                Log.e("NUM",num);
            }
        });
        Weightbtn = (ElegantNumberButton)findViewById(R.id.WeightButton);
        Weightbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=Weightbtn.getNumber();
                Log.e("NUM",num);
            }
        });

        HumidifierSwitch = (Switch) findViewById(R.id.HumidifierSwitch);
        HumidifierSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                HSwitchCheck(isChecked);
            }
        });

        OxygenSwitch = (Switch) findViewById(R.id.OxygenSwitch);
        OxygenSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                OSwitchCheck(isChecked);
            }
        });

        BiPapSwitch = (Switch) findViewById(R.id.biPap);
        BiPapSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String value = "B";
                operatingModeCheck(isChecked, value);
            }
        });

        CPapSwitch= (Switch) findViewById(R.id.cPap);
        CPapSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String value = "C";
                operatingModeCheck(isChecked, value);
            }
        });

        assistSwitch= (Switch) findViewById(R.id.assist);
        assistSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String value = "A";
                operatingModeCheck(isChecked, value);
            }
        });
    }
        public void HSwitchCheck (boolean checked){
        String text;
        if (checked) {
            text = "true";
        } else {
            text = "false";
        }
        switch (text) {
            case "true":
                HSwitch = "1";
                break;
            case "false":
                HSwitch = "0";
                break;
        }
        Log.d("Humidifier switch", HSwitch);
    }

    public void OSwitchCheck (boolean checked){
        String text;
        if (checked) {
            text = "true";
        } else {
            text = "false";
        }
        switch (text) {
            case "true":
                OSwitch = "1";
                break;
            case "false":
                OSwitch = "0";
                break;
        }
        Log.d("Oxygen switch", OSwitch);
    }

    public void operatingModeCheck(boolean checked, String operatingType) {
        Switch biPapSwitch = (Switch) findViewById(R.id.biPap);
        Switch cPapSwitch = (Switch) findViewById(R.id.cPap);
        Switch assistSwitch = (Switch) findViewById(R.id.assist);
        if(operatingType.equalsIgnoreCase("B") && checked) {
            assistSwitch.setEnabled(false);
            cPapSwitch.setEnabled(false);
        } else if (operatingType.equalsIgnoreCase("C") && checked) {
            assistSwitch.setEnabled(false);
            biPapSwitch.setEnabled(false);
        } else if(operatingType.equalsIgnoreCase("A") && checked) {
            cPapSwitch.setEnabled(false);
            biPapSwitch.setEnabled(false);
        } else if (operatingType.equalsIgnoreCase("B") && !checked) {
            assistSwitch.setEnabled(true);
            cPapSwitch.setEnabled(true);
        } else if (operatingType.equalsIgnoreCase("C") && !checked) {
            assistSwitch.setEnabled(true);
            biPapSwitch.setEnabled(true);
        } else if (operatingType.equalsIgnoreCase("A") && !checked) {
            cPapSwitch.setEnabled(true);
            biPapSwitch.setEnabled(true);
        }
    }
}
