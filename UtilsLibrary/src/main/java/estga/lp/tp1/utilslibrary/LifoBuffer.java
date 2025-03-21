/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Stack;

public class LifoBuffer<T> {
    private Stack<T> stack;

    public LifoBuffer() {
        stack = new Stack<>();
    }

    public void adicionarElemento(T elemento) {
        stack.push(elemento);
    }

    public T removerElemento() {
        return stack.pop();
    }

    public void listarElementos() {
        for (T elemento : stack) {
            System.out.println(elemento);
        }
    }
}

