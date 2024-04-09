package com.nathquintero.tiendavirtual;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CategoryAdapter adapter;
    private ArrayList<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Cargar datos de categorías (solo como ejemplo)
        loadCategories();

        // Configurar RecyclerView
        recyclerView = findViewById(R.id.rv_categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(adapter);
    }

    // Método para cargar datos de categorías (solo como ejemplo)
    private void loadCategories() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Electrónicos", "#FF5733", "url_imagen_electronica"));
        categoryList.add(new Category("Ropa", "#3366FF", "url_imagen_ropa"));
        categoryList.add(new Category("Alimentos", "#33FF33", "url_imagen_alimentos"));
        // Agrega más categorías según sea necesario
    }
}
