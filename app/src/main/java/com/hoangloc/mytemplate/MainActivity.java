package com.hoangloc.mytemplate;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        FragmentTransaction transaction;
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, new FragmentMain());
        transaction.commit();

        NavigationView navigationView =  findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        Intent intent;
                        switch (menuItem.getItemId()){
                            case R.id.nav_tab:
                                Toast.makeText(getBaseContext(),"Tab Activity", Toast.LENGTH_SHORT).show();
                                intent = new Intent(getApplicationContext(), ActivityTab.class);
                                startActivity(intent);
                                break;
                            case R.id.nav_gallery:
                                Toast.makeText(getBaseContext(),"ScrollView Activity", Toast.LENGTH_SHORT).show();
                                intent = new Intent(getApplicationContext(), ActivityScrollView.class);
                                startActivity(intent);
                                break;
                            case R.id.nav_manage:
                                Toast.makeText(getBaseContext(),"Login Activity", Toast.LENGTH_SHORT).show();
                                intent = new Intent(getApplicationContext(), ActivityLogin.class);
                                startActivity(intent);
                                break;
                            case R.id.nav_slideshow:
                                Toast.makeText(getBaseContext(),"Setting Activity", Toast.LENGTH_SHORT).show();
                                intent = new Intent(getApplicationContext(), ActivitySetting.class);
                                startActivity(intent);
                                break;
                            default:
                                break;

                        }
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();
                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here
                        return true;
                    }
                });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
//                Toast.makeText(getBaseContext(),"Ahihi", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
