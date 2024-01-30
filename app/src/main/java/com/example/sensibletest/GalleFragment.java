package com.example.sensibletest;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sensibletest.databinding.FragmentGalleBinding;
import com.example.sensibletest.databinding.FragmentNotesBinding;

public class GalleFragment extends Fragment {
    private FragmentGalleBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentGalleBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up resources
        binding = null;
    }
}
