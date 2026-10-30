package com.example.appvideojuegos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class JuegoAdapter extends BaseAdapter {

    private final Context context;
    private final List<Juego> listaJuegos;

    public JuegoAdapter(Context context, List<Juego> listaJuegos) {
        this.context = context;
        this.listaJuegos = listaJuegos;
    }

    @Override
    public int getCount() {
        return listaJuegos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaJuegos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_juego, parent, false);
        }

        Juego juego = listaJuegos.get(position);

        ImageView ivJuego = convertView.findViewById(R.id.iv_juego);
        TextView tvTitulo = convertView.findViewById(R.id.tv_titulo_juego);
        TextView tvDescripcion = convertView.findViewById(R.id.tv_descripcion_juego);
        TextView tvPlataforma = convertView.findViewById(R.id.tv_plataforma_juego);
        TextView tvPrecio = convertView.findViewById(R.id.tv_precio_juego);

        tvTitulo.setText(juego.getTitulo());
        tvDescripcion.setText(juego.getDescripcion());
        tvPlataforma.setText(juego.getPlataforma());
        tvPrecio.setText(juego.getPrecio());

        Picasso.with(context)
                .load(juego.getImagenResId())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(ivJuego);

        return convertView;
    }
}