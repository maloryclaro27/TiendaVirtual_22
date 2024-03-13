package com.nathquintero.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;

public class FormProductActivity extends AppCompatActivity {
    private Button btnSaveForm;
    private TextInputLayout nameTextField, descriptionTextField, priceTextField;

    private TextInputLayout imageUrlTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_product);
        btnSaveForm= findViewById(R.id.btn_save_product);
        nameTextField= findViewById(R.id.et_name_product_form);
        descriptionTextField= findViewById(R.id.et_description_product_form);
        priceTextField= findViewById(R.id.et_price_product_form);
        imageUrlTextField= findViewById(R.id.et_img_url_product_form);

        btnSaveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo lo que escriba de aqui para abajo se activa cuando el usuario, hce click en el boton

                Toast.makeText(FormProductActivity.this, "no me toques", Toast.LENGTH_SHORT).show();
                String name= nameTextField.getEditText().getText().toString().trim();
                String description= descriptionTextField.getEditText().getText().toString().trim();
                String price= priceTextField.getEditText().getText().toString().trim();
                String img_url= imageUrlTextField.getEditText().getText().toString().trim();
                if (name.isEmpty()){
                    nameTextField.setError("Necesitas un examen visual? porque te falta ingresar tu nombre");
                    return;
                }else if (name.length()>20){
                    nameTextField.setError("Te pasas");
                }
                if (description.isEmpty()){
                    descriptionTextField.setError("No soy adivino, porfa dime como es el producto");
                    return;
                }
                if (price.isEmpty()){
                    priceTextField.setError("Entonces le pongo precio yo?");
                    return;
                }
                if (img_url.isEmpty()){
                    imageUrlTextField.setError("Parece que aun estas mal de la vista, Necesitas un examen visual?");
                    return;
                }

                Product myNewProduct= new Product("Computador", "lenovo", 2000.0, "no hay");


            }
        });
    }
}