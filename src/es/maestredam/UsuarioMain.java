package es.maestredam;

public class UsuarioMain {

	public static void main(String[] args) {
		// Creo un par de productos
		Producto iphone11 = new Producto("0001", "iPhone 11", 1000);
		Producto mac      = new Producto("0002", "MacBook Pro", 2000 );
		
		// Creo un usuario
		Usuario userJohn  = new Usuario("john");
		
		// El usuario agrega dos productos a su "Cesta"
		userJohn.agregarProducto(iphone11);
		userJohn.agregarProducto(mac);
		
		// Visualizo el contenido de la cesta
		System.out.println("Cesta de John");
		System.out.println("-------------");
		
		userJohn.verProductos();
		System.out.printf("--%nTotal: %.2f EUR%n", 
				userJohn.getPrecioTotal());
		userJohn.eliminarProducto(mac);
		
		
		System.out.println("Cesta nueva");
		userJohn.verProductos();
		System.out.printf("--%nTotal: %.2f EUR%n", 
				userJohn.getPrecioTotal());
		
		userJohn.eliminarProductoCesta();

	}

}
