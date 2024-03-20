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
        Product producto1 = new Product("Gafas de sol", "Oklay, para hombre", 75000.0, "https://w7.pngwing.com/pngs/693/844/png-transparent-towelie-youtube-comedy-central-youtube-white-child-text.png");
        Product producto2 = new Product("Gafas de sol", "Calvin Klein, para hombre", 65000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto3 = new Product("Gafas de sol", "Carolina Herrera, para dama", 75000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto4 = new Product("Gafas de sol", "Balenciaga, para dama", 55000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto5 = new Product("Gafas de sol", "Versache, para dama", 80000.0, "https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
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