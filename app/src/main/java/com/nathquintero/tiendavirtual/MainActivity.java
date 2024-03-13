package com.nathquintero.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> listproducts= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFakeData();
    }

    private void loadFakeData(){
        Product producto1= new Product("Gafas de sol","Oklay, para hombre", 75000.0,"https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto2= new Product("Gafas de sol","Calvin Klein, para hombre", 65000.0,"https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto3= new Product("Gafas de sol","Carolina Herrera, para dama", 75000.0,"https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto4= new Product("Gafas de sol","Balenciaga, para dama", 55000.0,"https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        Product producto5= new Product("Gafas de sol","Versache, para dama", 80000.0,"https://drive.google.com/file/d/1G4MpvvEdY3emIbtN0reeI8deMiSVVA0t/view?usp=sharing");
        listproducts.add(producto1);
        listproducts.add(producto2);
        listproducts.add(producto3);
        listproducts.add(producto4);
        listproducts.add(producto5);
    }
}