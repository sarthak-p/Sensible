/*package com.example.sensibletest.ui.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sensibletest.GroupsActivity;
import com.example.sensibletest.R;
import com.example.sensibletest.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;*/

/*public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ListView listView;
    private FloatingActionButton addGrpBtn;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//
        listView = (ListView) findViewById(R.id.listMembers);
        //addGrpBtn = (FloatingActionButton) findViewById(R.id.addGrpBtn);
        itemList = new ArrayList<>();

        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
        itemList.add("hello");
        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

 */

package com.example.sensibletest.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sensibletest.ChatActivity;
import com.example.sensibletest.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment using binding
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Use binding to access the ListView and FloatingActionButton
        ListView listView = binding.listChat;
        //FloatingActionButton sendBtn = findViewById(); // Assuming your FAB id is fab_send in the XML

        // Initialize the list and adapter
        itemList = new ArrayList<>();
        itemList.add("Wasay: Hello"); // Adding initial items to the list
        itemList.add("Dan: Yo");
        itemList.add("Sarthak: Hey");
        itemList.add("Miguel: What's up?");

        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Initialize the TextInputEditText
        /*TextInputEditText userMsg = binding.textInputEditText;

        // Set a click listener for the FloatingActionButton
        if (getActivity() instanceof ChatActivity) {
            FloatingActionButton fab = ((ChatActivity) getActivity()).fab;

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Handle the click event
                    String newItem = "Wasay: " + userMsg.getText().toString();
                    itemList.add(newItem); // Add new item to the list
                    adapter.notifyDataSetChanged(); // Notify the adapter to refresh the ListView
                    userMsg.setText(""); // Clear the input field
                }
            });
        }*/


        // Return the root view
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Set the binding to null to avoid memory leaks
        binding = null;
    }
}

/*package com.example.sensibletest.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sensibletest.ChatActivity;
import com.example.sensibletest.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;
    private TextInputEditText userMsg;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment using binding
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Initialize the ListView
        ListView listView = binding.listMembers;

        // Initialize the list and adapter
        itemList = new ArrayList<>();
        itemList.add("Wasay: Hello"); // Adding initial items to the list
        itemList.add("Dan: Yo");
        itemList.add("Sarthak: Hey");
        itemList.add("Miguel: What's up?");

        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Initialize the TextInputEditText
        userMsg = binding.textInputEditText;

        // Return the root view
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() instanceof ChatActivity) {
            FloatingActionButton fab = ((ChatActivity) getActivity()).fab;

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Handle the click event
                    String newItem = "Wasay: " + userMsg.getText().toString().trim();
                    if (!newItem.isEmpty()) {
                        itemList.add(newItem); // Add new item to the list
                        adapter.notifyDataSetChanged(); // Notify the adapter to refresh the ListView
                        userMsg.setText(""); // Clear the input field
                    }
                }
            });
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clear references to avoid memory leaks
        binding = null;
    }
}*/

