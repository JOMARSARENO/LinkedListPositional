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
interface PositionList<T> {
    public int size();
    public boolean isEmtpy();
    public PositionList<T> first();
    public PositionList<T> last();
    public PositionList<T> before(PositionList<T> p) throws IlligalException;
    public PositionList<T> after(PositionList<T> p) throws IlligalException;
    public PositionList<T> addFirst(T e);
    public PositionList<T> addLast(T e);
    public PositionList<T> addBefore(PositionList<T> p, T e) throws IlligalArgumentExeption;
    public PositionList<T> addAfter(PositionList<T> p, T e) throws IlligalArgumentExeption;
    public T set(PositionList<T> p,  T e) throws IlligalArgumentExeption;
    public T remove(PositionList<T> p) throws IlligalArgumentExeption;
}
