package com.example.appvideojuegos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private String usuarioLogueado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioLogueado = getIntent().getStringExtra("USUARIO_KEY");
        if (usuarioLogueado == null) {
            usuarioLogueado = "rodaman";
        }

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        if (savedInstanceState == null) {
            cargarFragment(new HomeFragment());
        }

        bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragmentSeleccionado = null;
            if (item.getItemId() == R.id.nav_games) {
                fragmentSeleccionado = new HomeFragment();
            } else if (item.getItemId() == R.id.nav_profile) {
                fragmentSeleccionado = ProfileFragment.newInstance(usuarioLogueado);
            }

            if (fragmentSeleccionado != null) {
                cargarFragment(fragmentSeleccionado);
                return true;
            }
            return false;
        });
    }

    private void cargarFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}