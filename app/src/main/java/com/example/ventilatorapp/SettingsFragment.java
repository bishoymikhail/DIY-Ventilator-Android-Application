package com.example.ventilatorapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {
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

    public static Fragment newInstance() {
        SettingsFragment settingsFragment = new SettingsFragment();
        return settingsFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        humiditybtn = (ElegantNumberButton) view.findViewById(R.id.humidityButton);
        humiditybtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = humiditybtn.getNumber();
                Log.e("NUM", num);
            }
        });
        Tempbtn = (ElegantNumberButton) view.findViewById(R.id.TempButton);
        Tempbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = Tempbtn.getNumber();
                Log.e("NUM", num);
            }
        });
        Obtn = (ElegantNumberButton) view.findViewById(R.id.TempButton);
        Obtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = Obtn.getNumber();
                Log.e("NUM", num);
            }
        });
        PIPbtn = (ElegantNumberButton) view.findViewById(R.id.PIPButton);
        PIPbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = PIPbtn.getNumber();
                Log.e("NUM", num);
            }
        });
        PEEPbtn = (ElegantNumberButton) view.findViewById(R.id.PEEPButton);
        PEEPbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = PEEPbtn.getNumber();
                Log.e("NUM", num);
            }
        });
        RRbtn = (ElegantNumberButton) view.findViewById(R.id.RRButton);
        RRbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = RRbtn.getNumber();
                Log.e("NUM", num);
            }
        });
        Ibtn = (ElegantNumberButton) view.findViewById(R.id.IButton);
        Ibtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = Ibtn.getNumber();
                Log.e("NUM", num);
            }
        });
        Ebtn = (ElegantNumberButton) view.findViewById(R.id.EButton);
        Ebtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = Ebtn.getNumber();
                Log.e("NUM", num);
            }
        });
        Heightbtn = (ElegantNumberButton) view.findViewById(R.id.HeightButton);
        Heightbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = Heightbtn.getNumber();
                Log.e("NUM", num);
            }
        });
        Weightbtn = (ElegantNumberButton) view.findViewById(R.id.WeightButton);
        Weightbtn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = Weightbtn.getNumber();
                Log.e("NUM", num);
            }
        });

        HumidifierSwitch = (Switch) view.findViewById(R.id.HumidifierSwitch);
        HumidifierSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                HSwitchCheck(isChecked);
            }
        });

        OxygenSwitch = (Switch) view.findViewById(R.id.OxygenSwitch);
        OxygenSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                OSwitchCheck(isChecked);
            }
        });

        BiPapSwitch = (Switch) view.findViewById(R.id.biPap);
        BiPapSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String value = "B";
                operatingModeCheck(isChecked, value, view);
            }
        });

        CPapSwitch = (Switch) view.findViewById(R.id.cPap);
        CPapSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String value = "C";
                operatingModeCheck(isChecked, value, view);
            }
        });

        assistSwitch = (Switch) view.findViewById(R.id.assist);
        assistSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String value = "A";
                operatingModeCheck(isChecked, value, view);
            }
        });
    }

    private void HSwitchCheck(boolean checked) {
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

    private void OSwitchCheck(boolean checked) {
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


    private void operatingModeCheck(boolean checked, String operatingType, View view) {
        Switch biPapSwitch = (Switch) view.findViewById(R.id.biPap);
        Switch cPapSwitch = (Switch) view.findViewById(R.id.cPap);
        Switch assistSwitch = (Switch) view.findViewById(R.id.assist);
        if (operatingType.equalsIgnoreCase("B") && checked) {
            assistSwitch.setEnabled(false);
            cPapSwitch.setEnabled(false);
        } else if (operatingType.equalsIgnoreCase("C") && checked) {
            assistSwitch.setEnabled(false);
            biPapSwitch.setEnabled(false);
        } else if (operatingType.equalsIgnoreCase("A") && checked) {
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
