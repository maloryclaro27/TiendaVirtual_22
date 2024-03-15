package com.nathquintero.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> listproducts = new ArrayList<>();
    private RecyclerView rvProductsMain;

    private Toolbar topAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFakeData();

        rvProductsMain = findViewById(R.id.rv_products_main);
        topAppBar = findViewById(R.id.top_app_bar_list_product);
        ProductAdapter myAdapter = new ProductAdapter(listproducts);
        rvProductsMain.setAdapter(myAdapter);

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.item_add_product) {
                    startActivity(new Intent(MainActivity.this, FormProductActivity.class));
                    return true;
                } else if (item.getItemId() == R.id.item_add_category) {
                    Toast.makeText(MainActivity.this, "Clic e}n ADD CATEGORY", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        GridLayoutManager myGrid = new GridLayoutManager(getApplicationContext(), 1);

        LinearLayoutManager myLinear = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        StaggeredGridLayoutManager myStagger = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);


        rvProductsMain.setLayoutManager(myGrid);

    }

    private void loadFakeData() {
        Product producto1 = new Product("Gafas de sol", "Oklay, para hombre", 75000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto2 = new Product("Gafas de sol", "Calvin Klein, para hombre", 65000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto3 = new Product("Gafas de sol", "Carolina Herrera, para dama", 75000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto4 = new Product("Gafas de sol", "Balenciaga, para dama", 55000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto5 = new Product("Gafas de sol", "Versache, para dama", 80000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        listproducts.add(producto1);
        listproducts.add(producto2);
        listproducts.add(producto3);
        listproducts.add(producto4);
        listproducts.add(producto5);
    }
}