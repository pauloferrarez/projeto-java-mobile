package br.com.unisagrado.infofarma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.unisagrado.infofarma.model.Medicamento;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    List<Medicamento> medicamentos;

    public  MyAdapter(Context context, List<Medicamento> medicamentos){
        this.context = context;
        this.medicamentos = medicamentos;
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
        holder.txtMedicamento.setText(medicamentos.get(position).getNome());
        holder.txtDescricao.setText(medicamentos.get(position).getDescricao());
        holder.txtPosicao.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return medicamentos.size();
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
