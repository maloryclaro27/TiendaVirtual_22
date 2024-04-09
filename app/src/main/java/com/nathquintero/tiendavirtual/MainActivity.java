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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> listproducts = new ArrayList<>();
    private RecyclerView rvProductsMain;

    private Toolbar topAppBar;

    private User userSession = new User();

    private ImageView userImageProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFakeData();

        userImageProfil = findViewById(R.id.iv_profile_home_user);
        Picasso.get().load(userSession.getUrlImageProfil()).into(userImageProfil);
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
                    startActivity(new Intent(MainActivity.this, CategoryActivity.class));
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
        Product producto1 = new Product("Camiseta The Smiths", "Unisex", 80000.0, "https://www.jaimitocamisetas.com/cdn/shop/files/camisetathesmithsqueenisdead.png?v=1692301051&width=1946");
        Product producto2 = new Product("Camiseta Blink-182", "Unisex", 70000.0, "https://w7.pngwing.com/pngs/555/229/png-transparent-t-shirt-blink-182-tour-amazon-com-california-t-shirt-tshirt-logo-active-shirt.png");
        Product producto3 = new Product("Camiseta Kanye West", "Unisex", 80000.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fdroveclo.com%2Fdrove-black-power-kanye-west%2F&psig=AOvVaw1N4pvrfiHjJqWw4CE1Zy_u&ust=1712763266192000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCMjbs966tYUDFQAAAAAdAAAAABAE");
        Product producto4 = new Product("Camiseta The Smiths", "Unisex", 75000.0, "https://ceberro.com/wp-content/uploads/2022/10/minimal-flat-lay-tee-mockup-featuring-a-plain-background-95-el-11.png");
        Product producto5 = new Product("Camiseta The Beatles", "Unisex", 80000.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwing.com%2Fes%2Ffree-png-troal&psig=AOvVaw2x3SuiSp60g0U1aAW6W28G&ust=1712763460262000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCKDy97q7tYUDFQAAAAAdAAAAABAE");
        listproducts.add(producto1);
        listproducts.add(producto2);
        listproducts.add(producto3);
        listproducts.add(producto4);
        listproducts.add(producto5);

        userSession.setName("Malory");
        userSession.setEmail("mclaro834@unab.edu.co");
        userSession.setPassword("holaxd");
        userSession.setPhone("3154453945");
        userSession.setUrlImageProfil("https://www.dzoom.org.es/wp-content/uploads/2020/02/portada-foto-perfil-redes-sociales-consejos.jpg");
    }
}