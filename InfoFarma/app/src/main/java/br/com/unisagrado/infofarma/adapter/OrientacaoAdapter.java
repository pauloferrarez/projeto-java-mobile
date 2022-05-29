package br.com.unisagrado.infofarma.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.unisagrado.infofarma.R;
import br.com.unisagrado.infofarma.model.Orientacao;

public class OrientacaoAdapter extends RecyclerView.Adapter<OrientacaoAdapter.MyViewHolder> {

    private final Context context;
    private final List<Orientacao> orientacoes;

    public OrientacaoAdapter(Context context, List<Orientacao> orientacoes) {
        this.context = context;
        this.orientacoes = orientacoes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.orientacao_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtTituloOrient.setText(orientacoes.get(position).getTitulo());
        holder.txtDescOrient.setText(orientacoes.get(position).getDescricao());
    }

    @Override
    public int getItemCount() {
        return orientacoes.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtTituloOrient, txtDescOrient;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTituloOrient = itemView.findViewById(R.id.txtTituloOrient);
            txtDescOrient = itemView.findViewById(R.id.txtDescOrient);
        }
    }
}
