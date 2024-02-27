package src;
/**
 * @author Rodrigo Ramirez Y Dilary Cruz
 * @description Interfaz que define los métodos para el funcionamiento de la pila
 */

 public interface IStack<T> {
    /**
    * @description Agrega un elemento a la parte superior de la pila
    * @param value
    */
    void push(T value);

    /**
    * @description Elimina y retorna el elemento que se encuentra en la parte superior de la pila
    * @return T
    */
    T pop();

    /**
     * Retorna el elemento que se encuentra en la parte superior de la pila sin eliminarlo
     * @return T
     */
    T peek();
}
