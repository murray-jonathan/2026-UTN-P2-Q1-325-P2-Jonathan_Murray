/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaparcial2;
import java.util.ArrayList;
/**
 *
 * @author Joni
 */
public class Caja<T extends Identificable>{
    private ArrayList<T> elementos;
    
    public void agregar(T elemento){
        elementos.add(elemento);
    }
    
    
    public void listar(){
        if(elementos.isEmpty()){
            System.out.println("No hay elementos");
        }else{
            for(T t : elementos){
                System.out.println(t);
            }
        }
    }
    
    public T buscar(int codigo){
        for (T t : elementos) {
            if (t.getCodigo() == codigo) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }
    
    
    
    
    
    
    
    
    
    
    
}
