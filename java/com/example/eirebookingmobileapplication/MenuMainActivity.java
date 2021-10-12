package com.example.eirebookingmobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.eirebookingmobileapplication.FeedPages.FeedMainActivity;
import com.example.eirebookingmobileapplication.LoginPages.LoginMainActivity;
import com.example.eirebookingmobileapplication.MenuFragments.BookingDetailsActivity;
import com.example.eirebookingmobileapplication.MenuFragments.ContactActivity;
import com.example.eirebookingmobileapplication.MenuFragments.CouponActivity;
import com.example.eirebookingmobileapplication.MenuFragments.HomeFragment;
import com.example.eirebookingmobileapplication.MenuFragments.NotificationsActivity;
import com.example.eirebookingmobileapplication.SettingsPages.SettingsMainActivity;
import com.example.eirebookingmobileapplication.SurveyPages.SurveyIntroMainActivity;
import com.google.android.material.navigation.NavigationView;

public class MenuMainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        //Default Home Fragment
        HomeFragment homeFragment = new HomeFragment();
        setFragment(homeFragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_feeds){
            Intent intent = new Intent(MenuMainActivity.this, FeedMainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.nav_home){
            HomeFragment homeFragment = new HomeFragment();
            setFragment(homeFragment);
        }
        else if (id == R.id.nav_accom){
            Intent intent = new Intent(MenuMainActivity.this, AccommodationsMainActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_login){
            Intent intent = new Intent(MenuMainActivity.this, LoginMainActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_notification){
            Intent intent = new Intent(MenuMainActivity.this, NotificationsActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_booking_details){
            Intent intent = new Intent(MenuMainActivity.this, BookingDetailsActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_survey){
            Intent intent = new Intent(MenuMainActivity.this, SurveyIntroMainActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_coupon){
            Intent intent = new Intent(MenuMainActivity.this, CouponActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_contact) {
            Intent intent = new Intent(MenuMainActivity.this, ContactActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_settings){
            Intent intent = new Intent(MenuMainActivity.this, SettingsMainActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    public void onBackPressed(){
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}