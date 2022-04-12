package br.com.unisagrado.infofarma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String dataTitle[], dataDescription[];


    public  MyAdapter(Context context, String txtTitle[], String txtDescription[]){
        this.context = context;
        dataTitle = txtTitle;
        dataDescription = txtDescription;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtMedicamento.setText(dataTitle[position]);
        holder.txtDescricao.setText(dataDescription[position]);
        holder.txtPosicao.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return dataTitle.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtMedicamento, txtDescricao, txtPosicao;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMedicamento = itemView.findViewById(R.id.txtMedicamento);
            txtDescricao = itemView.findViewById(R.id.txtDescricao);
            txtPosicao = itemView.findViewById(R.id.txtPosicao);
        }
    }
}
