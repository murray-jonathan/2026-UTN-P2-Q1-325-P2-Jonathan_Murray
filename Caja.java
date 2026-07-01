import java.io.Serializable;
import java.util.ArrayList;

public class Caja<T extends Identificable> implements Serializable {
    private ArrayList<T> elementos;
    
     public Caja(){
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento){
        elementos.add(elemento);
    }

    public void eliminar(T elemento){
        elementos.remove(elemento);
    }

    public void listar(){
        if (elementos.isEmpty()) {
            System.out.println("No hay elementos");
        }else{
            for (T t : elementos) {
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
