package ejemplocola1;

public class ColaNombres {
    final int MAX = 10; 
    String[] cola;
    int frente;
    int finalCola; 
    
    public ColaNombres(){
        cola = new String[MAX];
        frente = -1;
        finalCola = -1;
    }
    public String pone(String dato){
        if(finalCola < MAX - 1){ 
            finalCola++;
            cola[finalCola] = dato;
            if(finalCola == 0){ 
                frente = 0;
            }
            return "Elemento '" + dato + "' insertado en la cola"; 
        } else {
            return "Desbordamiento - Cola llena";
        }                       
    }   
    
    public String quita(){
        if(frente != -1){ 
            String dato = cola[frente];
            
            if(frente == finalCola){ 
               
                frente = -1;
                finalCola = -1;
            } else {
                frente++;
            }
            return "Se quitó a '" + dato + "' de la cola";
        } else {
            return "Subdesbordamiento - Cola vacía";
        }
    }
   
    public void mostrar(){
        if(frente == -1){
            System.out.println("La cola está vacía, no hay elementos para mostrar.");
        } else {
            System.out.println("--- Contenido de la Cola (De FRENTE a FINAL) ---");
            for (int i = frente; i <= finalCola; i++) {
                System.out.println("[" + i + "] - " + cola[i]);
            }
            System.out.println("------------------------------------------------");
        }
    }
}