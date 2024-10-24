package adapters;

import android.content.Context;
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
        holder.imageView.setImageResource(ListasTortuga.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return ListasTortuga.size();
    }

    // COSNTRUCTOR
    public class TortugaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtNombre, txtArma, txtDescripcion;
        ImageView imgTortuga;
        ImageView imageView;
        Tortuga tortuga;
        Context context;


        public TortugaHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtArma = itemView.findViewById(R.id.txtArma);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            imageView = itemView.findViewById(R.id.imgTortuga);
            itemView.setOnClickListener(this);

                    txtNombre.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent intento = new Intent(v.getContext(), DatosTortuga.class);
                            intento.putExtra("tortuga", tortuga);
                            context.startActivity(intento);
                        }
                    });
        }

        public void setData(Tortuga tortuga) {
            this.tortuga=tortuga;
            txtNombre.setText(tortuga.getNombre());
            txtArma.setText(tortuga.getArma());
            txtDescripcion.setText(tortuga.getDescripcion());
            imageView.setImageResource(tortuga.getImagen());


        }


        @Override
        public void onClick(View view) {

        }
    }
}
// como pasar datos de una actividad a otra
// datos primitivos si