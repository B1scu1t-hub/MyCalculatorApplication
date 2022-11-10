package com.example.mycalculatorapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mycalculatorapplication.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editTextNumber01);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editTextNumber02);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number1 + MainActivity.number2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        view.findViewById(R.id.subtract).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editTextNumber01);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editTextNumber02);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number2 - MainActivity.number1;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            };
    });

        view.findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editTextNumber01);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editTextNumber02);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number2 * MainActivity.number1;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            };
        });

        view.findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editTextNumber01);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editTextNumber02);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number2 / MainActivity.number1;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            };
        });


}}