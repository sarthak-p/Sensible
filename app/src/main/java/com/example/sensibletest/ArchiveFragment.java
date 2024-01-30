package com.example.sensibletest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sensibletest.databinding.FragmentArchiveBinding; // Assuming you have a corresponding layout file named fragment_archive.xml with view binding enabled

import java.util.ArrayList;

public class ArchiveFragment extends Fragment {
    private FragmentArchiveBinding binding;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentArchiveBinding.inflate(inflater, container, false);

        itemList = new ArrayList<>();
        itemList.add("http://google.com"); // Add initial items to the list
        itemList.add("https://www.youtube.com");
        //listView = (ListView) findViewById(R.id.listLinks);
        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(requireActivity(), android.R.layout.simple_list_item_1, itemList);
        binding.listLinks.setAdapter(adapter); // Use binding to access the ListView

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
