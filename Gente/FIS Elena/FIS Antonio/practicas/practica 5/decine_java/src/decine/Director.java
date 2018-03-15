/*  
 *  Fundamentos de Ingenieria del Software
 *  Grado en Ingeniería Informática
 * 
 *  2014 © Copyleft - All Wrongs Reserved
 *
 *  Ernesto Serrano <erseco@correo.ugr.es>
 *  Carlos Garrancho
 *  Pablo Martinez
 * 
 */
package decine;

public class Director {
    private String nombre;
    private String nacionalidad;
    private String webOficial;
    
    Director (String nombre, String nacionalidad, String web){
        this.nombre=nombre;
        this.nacionalidad = nacionalidad;
        this.webOficial = web;
    }
    
    
    protected String getNombre() {     
        return this.nombre;
    }
    
}