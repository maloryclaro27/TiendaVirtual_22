package com.nathquintero.tiendavirtual;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> listCategories;

    public CategoryAdapter(ArrayList<Category> listCategories) {
        this.listCategories = listCategories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listCategories.get(position));
    }

    @Override
    public int getItemCount() {
        return listCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView iconImageView;
        private TextView nameTextView;
        private View colorView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImageView = itemView.findViewById(R.id.iv_category);
            nameTextView = itemView.findViewById(R.id.tv_name_category_item);
            colorView = itemView.findViewById(R.id.btn_color_category_item);
        }

        public void bind(Category category) {
            nameTextView.setText(category.getNombre_categoria());

            Log.d("CategoryAdapter", "Color de la categoría: " + category.getColor_categoria());

            // Asignar color dinámico al botón
            colorView.setBackgroundColor(Color.parseColor(category.getColor_categoria()));
        }
    }
}
