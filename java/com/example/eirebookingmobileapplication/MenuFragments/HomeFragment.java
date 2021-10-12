package com.example.eirebookingmobileapplication.MenuFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.eirebookingmobileapplication.AccommodationsMainActivity;
import com.example.eirebookingmobileapplication.PaymentsPages.PaymentActivity;
import com.example.eirebookingmobileapplication.R;

public class HomeFragment extends Fragment{

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapter;
    String[] counties;

    Intent intent;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_home, container, false);

        counties  = new String[]{
                "Carlow", "Cavan","Clare","Cork", "Donegal","Dublin",
                "Galway","Kerry", "Kildare", "Kilkenny", "Laois",
                "Leitrim","Limerick","Longford","Louth","Mayo",
                "Meath","Monaghan","Offaly","Roscommon","Sligo",
                "Tipperary", "Waterford","Westmeath","Wicklow"
        };

        intent = new Intent(getActivity(), AccommodationsMainActivity.class);
        Button enter_button = (Button)view.findViewById(R.id.enter_button);
        enter_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Accommodations Activity
                startActivity(intent);
            }
        });

        autoCompleteTextView = (AutoCompleteTextView)view.findViewById(R.id.county_auto_text);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.support_simple_spinner_dropdown_item, counties);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        return view;
    }

}