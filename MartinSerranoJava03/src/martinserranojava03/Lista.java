package martinserranojava03;


public class Lista<T> {
    
    //creamos nuestro nodo//
    
    private nodo inicio; //lo llamaremos inicio//
    private nodo ultima;
    private nodo actual;

    //Constructor de lista//
    public Lista(){
        
    }
    //Getter y Setter para la clase Lista//
    
    public nodo getInicio() {
        return inicio;
    }
    
    public nodo getFin() {
    return actual;
    }

    public nodo getActual() {
    return actual;
    }
    
    public void setInicio(nodo inicio) {
        this.inicio = inicio;
    }
    
    public void setFin(nodo ult) {
        this.ultima = ult;
    }

    public void setActual(nodo actual) {
        this.actual = actual;
    }
      
    void setInicio(Lista inicio) {
         }
       //montamos un metodo para insertar en la lista lo nodos//
    
    public int insertarNodo(int numero, int sal, String tit){
        nodo aux = new nodo(new Cuenta(numero, sal, tit));
        //si el inicio es null simplemente lo metemos//
        if (inicio == null){ //comprobamos que inicio sea o no null// 
            inicio = aux; //si lo es simplemente igualamos a inicio//
            actual=aux; ////tambien al actual//
            ultima = aux; //y a la ultima//
        }else{
            ultima.setSiguiente(aux); //si no simplemente movemos los punteros//
            aux.setAnterior(ultima); //lo mismo//
            ultima = aux; //y lo colocamos el ulti
        }
        numero++;
        return numero;
    }
    
    //creamos una funcion para introducir datos//
    public int introDat(int num) {
        int nuevaCuenta = num;
        nuevaCuenta = insertarNodo(nuevaCuenta, 531, "Ramirez");
        nuevaCuenta = insertarNodo(nuevaCuenta, 757434, "Iglesia");
        nuevaCuenta = insertarNodo(nuevaCuenta, 324236, "Pedro");
        return nuevaCuenta;
    }
  

    //creamos la clase anonima nodo//

    class nodo<T>{
        
        //creamos los atributos de la clase nodo//
       private T dato; //para guardar los datos//
       private nodo siguiente; //para aceder al nodo siguiente con un puntero//
       private nodo anterior; //para aceder al nodo anterior con un punntero//
       
        //creamos los constructores de la clase nodo//
       
        public nodo(T dato) {
            this.dato = dato;
            siguiente = null;
            anterior = null;
        }
        
        //Getter and Setter//
        
        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public nodo  getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(nodo siguiente) {
            this.siguiente = siguiente;
        }

        public nodo getAnterior() {
            return anterior;
        }

        public void setAnterior(nodo anterior) {
            this.anterior = anterior;
        }
    }
}