package com.nathquintero.tiendavirtual;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private ArrayList<ProductAdapter> listObjects;

    public ProductAdapter(ArrayList<Product> listObjects){
        this.listObjects= listObjects;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater
                .from(parent.getContext())
                .from(R.layout.item_product,parent,false);
        return new ViewHolder(myView);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView myImage;
        private ImageView nameProduct, priceProduct;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            myImage= itemView.findViewById(R.id.iv_product);
            nameProduct= itemView.findViewById(R.id.tv_name_product_item);
            priceProduct= itemView.findViewById(R.id.tv_price_product_item);
        }
    }
}
