package com.nathquintero.tiendavirtual;

public class Category {
    private String nombre_categoria;
    private String color_categoria;
    private String icono_categoria;

    public Category() {
    }

    public Category(String nombre_categoria, String color_categoria, String icono_categoria) {
        this.nombre_categoria = nombre_categoria;
        this.color_categoria = color_categoria;
        this.icono_categoria = icono_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getColor_categoria() {
        return color_categoria;
    }

    public void setColor_categoria(String color_categoria) {
        this.color_categoria = color_categoria;
    }

    public String getIcono_categoria() {
        return icono_categoria;
    }

    public void setIcono_categoria(String icono_categoria) {
        this.icono_categoria = icono_categoria;
    }
}
