package com.example.appvideojuegos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ListView lvJuegos = view.findViewById(R.id.lv_juegos);

        List<Juego> lista = new ArrayList<>();

        lista.add(new Juego(
                "EA Sports FC 26",
                "Simulación de fútbol de última generación con gráficos hiperrealistas y licencias mundiales.",
                "PS5 / Xbox / PC",
                "$ 290.000",
                R.drawable.ea_fc
        ));

        lista.add(new Juego(
                "Grand Theft Auto V",
                "Historia de acción y mundo abierto en Los Santos siguiendo las vidas de tres criminales.",
                "PS5 / Xbox / PC",
                "$ 120.000",
                R.drawable.gta_v
        ));

        lista.add(new Juego(
                "Call of Duty: Warzone",
                "Combate táctico Battle Royale masivo en línea donde el último escuadrón gana.",
                "Multiplataforma",
                "Gratis",
                R.drawable.cod_warzone
        ));

        lista.add(new Juego(
                "Minecraft",
                "Aventura y supervivencia en un mundo infinito compuesto enteramente por bloques.",
                "PC / Consolas / Móvil",
                "$ 90.000",
                R.drawable.minecraft
        ));

        lista.add(new Juego(
                "God of War Ragnarök",
                "Viaje épico a través de los nueve reinos nórdicos junto a Kratos y Atreus.",
                "PlayStation / PC",
                "$ 260.000",
                R.drawable.god_of_war
        ));

        JuegoAdapter adapter = new JuegoAdapter(requireContext(), lista);
        lvJuegos.setAdapter(adapter);

        return view;
    }
}