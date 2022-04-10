package com.tablelayout.javacodegeeks.tablayoutexample;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private CheckBox check1, check2;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_first, container, false);

        check1 = (CheckBox) view.findViewById(R.id.check01);
        check2 = (CheckBox) view.findViewById(R.id.check02);

        //set listeners for tab1
        check1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) view.findViewById(R.id.check01);
                if (check1.isChecked()) tv.setText("I had lunch !");
                else tv.setText("No time so far");
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) view.findViewById(R.id.check02);
                if (check2.isChecked()) tv.setText("Looks promising");
                else tv.setText("NO !!!");
            }
        });

        return view;
    }
}
