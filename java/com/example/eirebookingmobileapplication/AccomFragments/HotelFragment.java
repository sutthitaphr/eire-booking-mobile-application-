package com.example.eirebookingmobileapplication.AccomFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eirebookingmobileapplication.PaymentsPages.PaymentActivity;
import com.example.eirebookingmobileapplication.R;

public class HotelFragment extends Fragment {

    Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acc_hotel, container, false);

        intent = new Intent(getActivity(), PaymentActivity.class);

        Button hotel_book_now1 = (Button)view.findViewById(R.id.hotel_book_now);
        hotel_book_now1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now2 = (Button)view.findViewById(R.id.hotel_book_now2);
        hotel_book_now2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now3 = (Button)view.findViewById(R.id.hotel_book_now3);
        hotel_book_now3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now4 = (Button)view.findViewById(R.id.hotel_book_now4);
        hotel_book_now4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now5 = (Button)view.findViewById(R.id.hotel_book_now5);
        hotel_book_now5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now6 = (Button)view.findViewById(R.id.hotel_book_now6);
        hotel_book_now6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now7 = (Button)view.findViewById(R.id.hotel_book_now7);
        hotel_book_now7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now8 = (Button)view.findViewById(R.id.hotel_book_now8);
        hotel_book_now8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now9 = (Button)view.findViewById(R.id.hotel_book_now9);
        hotel_book_now9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        Button hotel_book_now10 = (Button)view.findViewById(R.id.hotel_book_now10);
        hotel_book_now10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Launch the Payment Activity
                startActivity(intent);
            }
        });

        return view;
    }
}
