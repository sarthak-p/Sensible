package com.example.sensibletest;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sensibletest.databinding.FragmentNotesBinding;

public class NotesFragment extends Fragment {
    private FragmentNotesBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNotesBinding.inflate(inflater, container, false);

        // Load saved text when creating the view
        binding.textInput.setText(loadText());

        // Set a focus change listener to save the text when edited or focus is lost
        binding.textInput.setOnFocusChangeListener((view, hasFocus) -> {
            if (!hasFocus) {
                saveText(binding.textInput.getText().toString());
            }
        });

        return binding.getRoot();
    }

    private void saveText(String text) {
        SharedPreferences prefs = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("notes", text);
        editor.apply();
    }

    private String loadText() {
        SharedPreferences prefs = getActivity().getPreferences(Context.MODE_PRIVATE);
        return prefs.getString("notes", ""); // Default value is an empty string
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up resources
        binding = null;
    }
}
