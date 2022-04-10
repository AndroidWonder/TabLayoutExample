package com.tablelayout.javacodegeeks.tablayoutexample;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {
    private RadioGroup group;
    private Button button2;
    private TextView tview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_third, container, false);

        button2 = (Button) view.findViewById(R.id.Button02);
        group = (RadioGroup) view.findViewById(R.id.radio);
        tview = (TextView) view.findViewById(R.id.TextView01);
        //set listener for clear button
        button2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v){
                if (group != null) {
                    group.clearCheck();
                    tview.setText("Choose Now !");
                }

            }
        });

        return view;
    }
}
