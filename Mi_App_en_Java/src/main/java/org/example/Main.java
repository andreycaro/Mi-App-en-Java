package org.example;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Properties para cargar las propiedades desde el archivo pom.xml
        Properties properties = new Properties();


        // Obtener las propiedades definidas en pom.xml
        String nombreProducto = properties.getProperty("nombreProducto");
        int cantidadProducto = Integer.parseInt(properties.getProperty("cantidadProducto"));
        var precioProducto = Double.parseDouble(properties.getProperty("precioProducto"));
        boolean seCompraHoy = Boolean.parseBoolean(properties.getProperty("seCompraHoy"));
        int dia = Integer.parseInt(properties.getProperty("diaCompra"));
        int mes = Integer.parseInt(properties.getProperty("mesCompra"));
        int anio = Integer.parseInt(properties.getProperty("anioCompra"));

        // Datos
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Cantidad de Producto: " + cantidadProducto);
        System.out.println("Precio del Producto: " + precioProducto);
        System.out.println("Se Compra Hoy (true/false): " + seCompraHoy);
        System.out.println("Fecha de Compra: " + dia + "-" + mes + "-" + anio);
    }
}
