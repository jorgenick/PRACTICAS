package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.dominio.ClienteCuentaCorriente;
import ar.edu.unju.fi.dominio.ClienteGrandesCompras;

public class ClienteManager {
	
	private static List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	public void cargarClientes() {
		
		ClienteCuentaCorriente cliente1 = new ClienteCuentaCorriente(37460306,"jorge tolaba","jtolaba@gmail","palpala");
		listaClientes.add(cliente1);
		ClienteGrandesCompras cliente2 = new ClienteGrandesCompras(dniNoRepetido(37450306),"franco tolaba","jtolaba@gmail","palpala");
		listaClientes.add(cliente2);
		ClienteCuentaCorriente cliente3 = new ClienteCuentaCorriente(123135,"diego tolaba","jtolaba@gmail","palpala");
		listaClientes.add(cliente3);
		ClienteGrandesCompras cliente4 = new ClienteGrandesCompras(123135,"juan murillo","jtolaba@gmail","palpala");
		listaClientes.add(cliente4);
		ClienteGrandesCompras cliente5 = new ClienteGrandesCompras(123135,"mario tolaba","jtolaba@gmail","palpala");
		listaClientes.add(cliente5);
		
	for (Cliente cliente : listaClientes) 
	System.out.println(cliente);
	}
	
	public void registrarUnaCompra() {
		
		
	}
	
	public long dniNoRepetido(long dni) {
		
		Scanner scanner = new Scanner(System.in);

		long dniNoRep = 0;
		boolean igualdad = false;
		boolean norep = false;

		while (norep == false) {
			for (Cliente cliente : listaClientes) {
				if (cliente.getDni() == dni) {
					igualdad = true;

					if (igualdad == false) {
					norep = true;
					dniNoRep = dni;
					}
					else {
						System.out.println("El dni ya existe ingrese otro numero");
						dni = scanner.nextLong();
					}
				}
			}
		}
	
		
		return dniNoRep;
	}
	
	public Cliente registrarCliente() {
		
		 long dni;
		 String nombre;
		 String email;
		 String localidad;
		 
		System.out.println("-------SELECCIONE TIPO DE CLIENTE----------");
		System.out.println("1- CLIENTES CUENTA CORRIENTE");
		System.out.println("2- CLIENTE GRANDES COMPRAS ");
		
		Scanner scanner = new Scanner(System.in);
		int tipoCliente = scanner.nextInt();
		
		switch (tipoCliente) {
		case 1:
			
			System.out.println("ud ha seleccionado CLIENTE cuenta corriente");
			System.out.println("ingrese dni");
			
			System.out.println("ingrese nombre");
			
			System.out.println("ingrese eMail");
			
			System.out.println("ingrese Localidad");
			
			break;
			
		case 2:
			System.out.println("ud ha selccionado cliente grandes compras");
			
			break;

		default:
			System.out.println("no corresponde a ningun tipo de cliente");
			break;
		}
		
		
		
		return null;
		
		
	}
	
}
