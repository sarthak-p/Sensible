package com.example.sensibletest.ui.gallery;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sensibletest.GroupsActivity;
import com.example.sensibletest.R;
import com.example.sensibletest.databinding.FragmentGalleryBinding;
import com.example.sensibletest.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/*
public class GalleryFragment extends Fragment {

    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;
    private FragmentGalleryBinding binding;
    private FloatingActionButton memberBtn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //GalleryViewModel galleryViewModel =
        //        new ViewModelProvider(this).get(GalleryViewModel.class);
        memberBtn = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ListView listView = binding.listMembers;

        itemList = new ArrayList<>();
        itemList.add("Wasay"); // Adding initial items to the list
        itemList.add("Dan");
        itemList.add("Sarthak");
        itemList.add("Miguel");

        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
        //final TextView textView = binding.textGallery;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        memberBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Enter Member Email:");

                // Use the inflater from the onCreateView parameters to inflate the dialog view
                View dialogView = inflater.inflate(R.layout.add_group, null);
                final EditText editText = dialogView.findViewById(R.id.etNewItem);
                builder.setView(dialogView);

                // Set up the buttons
                builder.setPositiveButton("Invite", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Invite logic
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                // Create and show the AlertDialog
                AlertDialog dialog = builder.create();

                // Make sure the dialog and its window are not null
                if (dialog.getWindow() != null) {
                    dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
                }
                dialog.show();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}*/


public class GalleryFragment extends Fragment {

    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment using binding
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ListView listView = binding.listMembers;
        itemList = new ArrayList<>();
        itemList.add("Wasay"); // Adding initial items to the list
        itemList.add("Dan");
        itemList.add("Sarthak");
        itemList.add("Miguel");

        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(requireActivity(), android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Setting the onClickListener for the FloatingActionButton using binding
        binding.floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Enter Member Email:");

                // Inflate the dialog view
                View dialogView = inflater.inflate(R.layout.add_group, null);
                final EditText editText = dialogView.findViewById(R.id.etNewItem);
                builder.setView(dialogView);

                // Set up the buttons
                builder.setPositiveButton("Invite", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Invite logic here
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                // Show the AlertDialog
                AlertDialog dialog = builder.create();
                if (dialog.getWindow() != null) {
                    dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
                }
                dialog.show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Clean up the binding when the view is destroyed
    }
}

