/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estga.lp.tp1.utilslibrary;

import java.util.LinkedList;
import java.util.Queue;

public class FifoBuffer<T> {
    private Queue<T> queue;

    public FifoBuffer() {
        queue = new LinkedList<>();
    }

    public void adicionarElemento(T elemento) {
        queue.add(elemento);
    }

    public T removerElemento() {
        return queue.poll();
    }

    public void listarElementos() {
        for (T elemento : queue) {
            System.out.println(elemento);
        }
    }
}

