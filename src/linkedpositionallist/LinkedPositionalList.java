/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedpositionallist;

/**
 *
 * @author Oneras
 */
public abstract class LinkedPositionalList<T> implements PositionList<T> {

    private static interface PositionaList<T> {
    }

    private static class IlligalStateExeption extends Exception {

        public IlligalStateExeption() {
        }
    }
    private class Node<E> implements PositionaList<E>{
        private E e;
        private Node<E> prev, next;
        
        public Node(Node<E> prev, E e, Node<E> next){
            this.e = e;
            this.prev = prev;
            this.next = next;
        }

        private Node(Object object, Object object0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         * @return the e
         */
        public T getElement() throws IlligalStateExeption {
            return (T) e;
        }

        /**
         * @param e the e to set
         */
        public void setE(E e) {
            this.e = e;
        }

        /**
         * @return the prev
         */
        public Node<E> getPrev() {
            return prev;
        }

        /**
         * @param prev the prev to set
         */
        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        /**
         * @return the next
         */
        public Node<E> getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node<E> next) {
            this.next = next;
        }
        
        public void setElement(E e){
            this.e = e;
        
        } 
    
    }
    
    private Node<T> header, tailer;
    private int size;
    
    public LinkedPositionalList(Node head){
        header = new Node(null, null);
        Node trailer = new Node(head, null, null);
        header.setNext(trailer);
        size = 0;
        
        
    }
    
    private Node<T> validate(Position<T> p) throws IlligalArgumentExeption{
        if(!(p instanceof Node)){
            throw new IlligalArgumentExeption("invalid node.");
            
        }
    }
        Node<T> node = (Node<T>) p;
        
        if(node.getNext() == null){
            throw new IlligalArgumentExeption("Node is the list.");
        
        }
        return Node;
        

}

