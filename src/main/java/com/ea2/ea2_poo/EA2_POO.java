
package com.ea2.ea2_poo;
import com.model.Persona;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


public class EA2_POO {
    
    public static void main(String[] args) {
        
        String Nombre = "";
        String Apellido ="";
        int Edad = 0;
        String Genero = "";
        Scanner scanner = new Scanner(System.in);
        
        
        Persona persona = new Persona (Nombre,Apellido,Genero,Edad);
        //HashMap<String, Persona> personas = new HashMap<>();
        ArrayList<Persona> personas = new ArrayList<>();
        boolean continuar = true;
        
        
        
        while(continuar){
            System.out.println("Ingrese Sí para continuar o Salir para terminar ejecución");
            String respuesta = scanner.nextLine(); 
            if (respuesta.equalsIgnoreCase("Salir")){
                continuar = false;
            }else{
            
            System.out.print("Ingrese el nombre:");
            Nombre = scanner.nextLine();
            persona.setNombre(Nombre);

            System.out.print("Ingrese el nombre:");
            Apellido = scanner.nextLine();
            persona.setApellido(Apellido);

            System.out.print("Ingrese el nombre:");
            Genero = scanner.nextLine();
            persona.setGenero(Genero);
            
            System.out.print("Ingrese el nombre:");
            Edad = scanner.nextInt();
            persona.setEdad(Edad);
                        
            personas.add(persona);
            }
        }
        
        System.out.print("Información Ingresada:");
        /*for (int i = 0; i < personas.size(); i++) {
            System.out.print(personas.get(i));
        */
        for ( Persona personaIt : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Género: " + persona.getGenero());
            System.out.println("-----------------------");
        }
        
        
        
        System.out.print("El promedio de las edades ingresadas es: " + promedioEdades(personas, Edad) + ".");
        
        
        
        System.out.print("Cual genero deseas copntabilizar");
        String generoBuscado =  scanner.nextLine();
        if (generoBuscado == "Femenino"){
            System.out.print("La cantidad de " + generoBuscado + "es:" + contarGenero(personas, "Femenino") + ".");
        }else if(generoBuscado == "Masculino"){
           System.out.print("La cantidad de " + generoBuscado + "es:" + contarGenero(personas, "Masculino") + "."); 
        }
    
    }
    
    
    public static int promedioEdades(ArrayList<Persona> personas, int Edad){
        int promedioEdad = 0;
        int contador = 0;
        for (Persona persona : personas) {
            promedioEdad += Edad;
            contador += 1;
        }
            promedioEdad = promedioEdad/contador;
            return promedioEdad;
        }
    
    public static int contarGenero(ArrayList<Persona> personas, String generoBuscado) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(generoBuscado)) {
                contador++;
            }
        }
        return contador;
    }
}
