package adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle.R;

import java.util.List;

import models.Tortuga;

public class TortugaAdapter extends RecyclerView.Adapter<TortugaAdapter.TortugaHolder> {


    List<Tortuga> ListasTortuga;

    public TortugaAdapter(List<Tortuga> listasTortuga) {
        ListasTortuga = listasTortuga;
    }

    @NonNull
    @Override
    public TortugaAdapter.TortugaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View vistatortuga =ly.inflate(R.layout.itemtortuga,parent,false);
        return new TortugaHolder(vistatortuga);
    }

    @Override
    public void onBindViewHolder(@NonNull TortugaAdapter.TortugaHolder holder, int position) {
        holder.setData(ListasTortuga.get(position));
        holder.itemView.setBackgroundColor(ListasTortuga.get(position).getColor());
    }

    @Override
    public int getItemCount() {
        return ListasTortuga.size();
    }

    // COSNTRUCTOR
    public class TortugaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtNombre, txtArma, txtDescripcion;
        ImageView imgTortuga;

        Tortuga tortuga;


        public TortugaHolder(@NonNull View itemView) {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtArma = itemView.findViewById(R.id.txtArma);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            imgTortuga = itemView.findViewById(R.id.imgTortuga);
            itemView.setOnClickListener(this);
        }

        public void setData(Tortuga tortuga) {
            this.tortuga=tortuga;
            txtNombre.setText(tortuga.getNombre());
            txtArma.setText(tortuga.getArma());
            txtDescripcion.setText(tortuga.getDescripcion());
        }

        @Override
        public void onClick(View view) {
//            intent = new Intent(this,TortugaActivity.class);
        }
    }
}
// como pasar datos de una actividad a otra
// datos primitivos si