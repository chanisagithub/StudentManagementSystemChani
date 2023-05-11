/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icet.sms.db;

import com.icet.sms.model.Student;

/**
 *
 * @author chanisa
 * @param <T>
 */ 
public class List<T> {
    private Node head;
    public List(){
    }
    
    public boolean add(T objt){ //add to the last index
       Node n1=new Node(objt);
       if(head==null){
        head=n1;
       }else{
       Node lastnode=head;
       while(lastnode.next!=null){
           lastnode=lastnode.next;
        }
       lastnode.next=n1;
       }
       return true;
    }
    
    public boolean set(T objt) {
        return set(search(objt), objt);
    }
    
    public boolean set(int index, T objt){
        Node n1=new Node(objt);
        if(index>=0 && index<size()){
            if(index==0){
                n1.next=head.next;
                head=n1;
            }else{
                Node temp=head;
                int count=0;
                while(count<index-1){
                        temp=temp.next;
                        count++;
                }
                n1.next=temp.next.next;
                temp.next=n1;
            }
                return true;
        }
        return false;
	}
    
    public boolean delete(int index){
        if(index>=0 && index<=size()){
            if(index == 0){
                head=head.next;
                return true;
            }
            Node temp=head;
            for(int i=1; i<index; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return true;
        }
        return false;
    }
    
     public boolean remove(T objt){
        return delete(search(objt));
    }
    
    public T get(T objt){
        Node temp=head;
        while(temp!=null){
            if(temp.obj.equals(objt)){
                return temp.obj;
            }
            temp=temp.next;
        }
        return null;
    }
    
    public boolean isExist(T objt){
        return search(objt)!=-1;
    }
    
    public int search(T objt){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.obj.equals(objt)){
                 return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }
    
    public Object[] toArray(){
        Object[] Array=new Object[size()];
        Node temp=head;
        for(int i=0; i<size(); i++){
        Array[i]=temp.obj;
        temp=temp.next;
        }
        return Array;
    }
  
    public int size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
        count++;
        temp=temp.next;
        }
        return count;
    }

    class Node {
        private T obj;
        private Node next;
        public Node(T obj){
            this.obj=obj;
        }
    }
}