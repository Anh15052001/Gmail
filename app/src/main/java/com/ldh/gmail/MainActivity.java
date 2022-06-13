package com.ldh.gmail;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    ImageView imageView_menu;
    NavigationView navigationView;
    private ListView listView;
    List<Item> arrayList;
    Adapter adapter;
    Context context;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        //  toolbar = (Toolbar) findViewById(R.id.toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        imageView_menu = (ImageView) findViewById(R.id.imageView_menu);
        textView = (TextView)findViewById(R.id.search);

        imageView_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(navigationView);

            }
        });
        context = this;
        listView = (ListView)findViewById(R.id.listMail);
        arrayList = new ArrayList<>();
        arrayList.add(new Item("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", "E", R.drawable.ic_baseline_star_border));
        arrayList.add(new Item("Chris Abad", "Help make Campain Monitor", "11:22 AM", "C", R.drawable.ic_baseline_star_border));
        arrayList.add(new Item("Tuto.com", "8h de formation gratuite", "11:04 AM", "T", R.drawable.ic_baseline_star_border));
        arrayList.add(new Item("support", "Hello world, Im Viet Anh", "10:26 AM", "S", R.drawable.ic_baseline_star_border));
        arrayList.add(new Item("Matt from lonic", "The new lonic Cretor", "7:56 PM", "M", R.drawable.ic_baseline_star_border));
        adapter = new Adapter(this, R.layout.list_row, arrayList);
        listView.setAdapter(adapter);
        


    }
}