/*
Proyecto: Sistema de gestión de tienda online
Objetivo

Crear una aplicación en Java que permita gestionar una tienda online con:

clientes

productos

pedidos

pagos

stock

Debe usar herencia, interfaces, polimorfismo, colecciones y excepciones.

1. Estructura de clases
Clase abstracta: Usuario

Atributos:

id
nombre
email

Métodos:

mostrarInfo()
Clase Cliente (hereda de Usuario)

Atributos:

direccion
ArrayList<Pedido> pedidos

Métodos:

crearPedido()
verPedidos()
Clase Administrador (hereda de Usuario)

Métodos:

añadirProducto()
eliminarProducto()
verInventario()
2. Productos
Clase Producto

Atributos:

id
nombre
precio
stock

Métodos:

reducirStock()
aumentarStock()
mostrarProducto()
Tipos de producto (herencia)

Subclases:

ProductoFisico
ProductoFisico

Producto físico:

peso
costeEnvio

Producto digital:

tamanoArchivo
3. Pedido

Clase Pedido

Atributos:

id
Cliente cliente
ArrayList<Producto> productos
estado
total

Estados posibles:

CREADO
PAGADO
ENVIADO
ENTREGADO

Métodos:

añadirProducto()
calcularTotal()
mostrarPedido()
4. Sistema de pago (interfaces)

Crear interfaz:

MetodoPago

Métodos:

pagar(double cantidad)
Implementaciones
PagoTarjeta
PagoPaypal
PagoTransferencia

Cada una muestra algo como:

Pago realizado con tarjeta
5. Gestión de inventario

Clase Inventario

Atributo:

ArrayList<Producto> productos

Métodos:

buscarProducto()
añadirProducto()
eliminarProducto()
mostrarInventario()
6. Menú principal

Programa principal con menú:

1 Añadir producto
2 Mostrar productos
3 Crear cliente
4 Crear pedido
5 Añadir producto a pedido
6 Pagar pedido
7 Mostrar pedidos
8 Mostrar clientes
9 Salir
7. Reglas importantes

Debes controlar:

Excepciones

comprar producto sin stock

pagar pedido vacío

producto inexistente

8. Conceptos que practicarás

Este proyecto usa:

✔ herencia
✔ clases abstractas
✔ interfaces
✔ polimorfismo
✔ ArrayList
✔ relaciones entre objetos
✔ excepciones
✔ menú interactivo

Es muy parecido a proyectos reales de DAW.

💡 Si quieres, puedo también darte:

la estructura completa de carpetas como si fuera un proyecto real

el diagrama UML

la versión aún más avanzada (nivel proyecto final DAW)

o un proyecto aún más difícil tipo videojuego RPG en Java (muy bueno para practicar POO).*/

public class PruebaTienda {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Vi", "vi@gmail.com");
        // System.out.println(u1);

        ProductoFisico p1 = new ProductoFisico(1.2, 0.2, "Caracol", 2.99);
        // System.out.println(p1);

        Pedido p = new Pedido();
        PagoTarjeta pt = new PagoTarjeta(1234);
        p.pagar(pt);
        p.aniadirProducto(p1);
        System.out.println(p.mostrarPedido());

    }
}