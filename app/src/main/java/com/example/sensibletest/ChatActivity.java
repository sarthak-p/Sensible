package com.example.sensibletest;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sensibletest.databinding.FragmentHomeBinding;
import com.example.sensibletest.ui.gallery.GalleryFragment;
import com.example.sensibletest.ui.home.HomeFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.sensibletest.databinding.ActivityChatBinding;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityChatBinding binding;
    public FloatingActionButton fab;

    /*private FragmentHomeBinding binding2;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        //fab = findViewById(R.id.fab);
        // binding2 = FragmentHomeBinding.inflate(inflater, container, false);
        //View root2 = binding2.getRoot();

        // Use binding to access the ListView and FloatingActionButton
        //ListView listView = binding2.listMembers;

        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarChat.toolbar);

        binding.appBarChat.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Still needs to be implemented", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final DrawerLayout drawer = binding.drawerLayout; // Use final or make drawer a field
        NavigationView navigationView = binding.navView;

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_current_group_chat, R.id.nav_members, R.id.nav_calendar, R.id.nav_notes, R.id.nav_archives, R.id.nav_back_groups)
                .setOpenableLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_chat);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.setNavigationItemSelectedListener(item -> {
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            if (id == R.id.nav_current_group_chat) {
                // Update the ActionBar title to the selected menu item's title
                if (getSupportActionBar() != null) {
                    getSupportActionBar().setTitle(item.getTitle());
                }

                // Create a new fragment instance and display it
                HomeFragment homeFragment = new HomeFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_content_chat, homeFragment) // Use the ID of your FrameLayout or Fragment container
                        .addToBackStack(null) // Optionally add the transaction to the back stack
                        .commit();

            }



            if (id == R.id.nav_members) {
                // Update the ActionBar title to the selected menu item's title
                if (getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("Members");
                }

                // Create a new fragment instance and display it
                GalleryFragment membersFragment = new GalleryFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_content_chat, membersFragment) // Use the ID of your FrameLayout or Fragment container
                        .addToBackStack(null) // Optionally add the transaction to the back stack
                        .commit();


            }
            // Update the ActionBar title to the selected menu item's title



            // Handle the rest of the navigation events
            if (id == R.id.nav_back_groups) {
                finish(); // Close this activity and return to the previous one
            }

            drawer.closeDrawer(GravityCompat.START); // Close the drawer
            return true;
        });

        // Retrieve the text passed from the first activity if you intend to use it
        String selectedItemText = getIntent().getStringExtra("item_key");

        // Update specific navigation item title with the text from the previous activity
        MenuItem menuItem = navigationView.getMenu().findItem(R.id.nav_current_group_chat);
        if (menuItem != null && selectedItemText != null) {
            menuItem.setTitle(selectedItemText);
        }*/
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarChat.toolbar);

        fab = binding.appBarChat.fab;
        final DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_current_group_chat, R.id.nav_members, R.id.nav_calendar, R.id.nav_notes, R.id.nav_archives, R.id.nav_back_groups)
                .setOpenableLayout(drawer)
                .build();

        binding.appBarChat.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Still needs to be implemented", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Declare NavController here
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_chat);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_current_group_chat) {
                // Show the FAB when the home fragment is visible
                fab.show();
            } else if (id == R.id.nav_members) {
                // Hide the FAB when the members fragment is visible
                fab.hide();
            } else if (id == R.id.nav_calendar) {
                // Hide the FAB when the members fragment is visible
                fab.hide();
            } else if (id == R.id.nav_notes) {
                // Hide the FAB when the members fragment is visible
                fab.hide();
            } else if (id == R.id.nav_calendar) {
                // Hide the FAB when the members fragment is visible
                fab.hide();
            } else if (id == R.id.nav_gallery) {
                // Hide the FAB when the members fragment is visible
                fab.hide();
            } else if (id == R.id.nav_archives) {
                // Hide the FAB when the members fragment is visible
                fab.hide();
            } else {
                // For other fragments, decide whether you want to show or hide the FAB
                fab.show(); // or fab.hide(); depending on your design
            }

            if (id == R.id.nav_back_groups) {
                finish(); // Close this activity and return to the previous one
            }

            // Use the already declared navController
           /* return NavigationUI.onNavDestinationSelected(item, navController)
                    || super.onOptionsItemSelected(item);*/
            // Let NavController handle navigation
            boolean handled = NavigationUI.onNavDestinationSelected(item, navController);
            if (handled) {
                drawer.closeDrawer(GravityCompat.START);
            }
            return handled;
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_chat);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
