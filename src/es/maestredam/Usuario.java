package es.maestredam;

import java.util.ArrayList;
import java.util.List;
	
public class Usuario {
    private String nombre;
    private List<Producto> cesta;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.cesta = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        cesta.add(producto);
    }

    public void verProductos() {
        for (Producto producto : cesta) {
            System.out.println(producto);
        }
    }
    public void eliminarProducto(Producto producto) {
    	cesta.remove(producto);
    }

    public double getPrecioTotal() {
        double total = 0;
        for (Producto producto : cesta) {
            total += producto.getPrecio();
        }
        return total;
    }
        public static void eliminarProductoCesta(List<Producto> cesta, String nombreProducto) {
            boolean productoEncontrado = false;
            for (int i = 0; i < cesta.size(); i++) {
                Producto producto = cesta.get(i);
                if (producto.getNombre().equals(nombreProducto)) {
                    cesta.remove(i);
                    productoEncontrado = true;
                    break;
                }
            }
            if (productoEncontrado) {
                System.out.println("Producto \"" + nombreProducto + "\" eliminado correctamente.");
            } else {
                System.out.println("El producto \"" + nombreProducto + "\" no se encontró en la cesta.");
            }
        }
    
    }


	class Producto {
	    private String codigo;
	    private String nombre;
	    private double precio;

	    public Producto(String codigo, String nombre, double precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public String toString() {
	        return String.format("%s - %s: %.2f EUR", codigo, nombre, precio);
	    }
	}



