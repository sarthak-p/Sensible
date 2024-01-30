package com.example.sensibletest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class GroupsActivity extends AppCompatActivity {
    private ListView listView;
    private FloatingActionButton addGrpBtn;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        setTitle("Sensible");

        listView = (ListView) findViewById(R.id.listGroups);
        addGrpBtn = (FloatingActionButton) findViewById(R.id.addGrpBtn);
        itemList = new ArrayList<>();

        // Initialize the adapter with the initial item list
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        addGrpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String newItem = "New Item " + (itemList.size() + 1);

                // Add item to the data source
                //itemList.add(newItem);

                // Notify the adapter that the data set has changed so the ListView can update
                //adapter.notifyDataSetChanged();
                AlertDialog.Builder builder = new AlertDialog.Builder(GroupsActivity.this);
                builder.setTitle("Create Group:");

                // Inflate and set the layout for the dialog
                // Pass null as the parent view because it's going in the dialog layout
                View dialogView = LayoutInflater.from(GroupsActivity.this).inflate(R.layout.add_group, null);
                final EditText editText = dialogView.findViewById(R.id.etNewItem);
                builder.setView(dialogView);

                // Set up the buttons
                builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String newItem = editText.getText().toString().trim();
                        if (!newItem.isEmpty()) {
                            itemList.add(newItem);
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog dialog = builder.create();
                // Show keyboard automatically when the dialog appears
                dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
                dialog.show();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the data model item for the clicked position
                String item = adapter.getItem(position);

                // Create an Intent to start your new activity
                Intent intent = new Intent(GroupsActivity.this, ChatActivity.class);

                // Use extras to pass data to the new activity:
                intent.putExtra("item_key", item);

                // Start the new activity
                startActivity(intent);
            }
        });
    }


}


