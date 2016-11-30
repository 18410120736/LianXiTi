package com.bwie.test;

public class Person {
	private int id;  
    
    private Person prev;  
      
    private Person next;  
  
    public Person getPrev()  
    {  
        return prev;  
    }  
  
    public void setPrev(Person prev)  
    {  
        this.prev = prev;  
    }  
  
    public Person getNext()  
    {  
        return next;  
    }  
  
    public void setNext(Person next)  
    {  
        this.next = next;  
    }  
  
    public int getId()  
    {  
        return id;  
    }  
  
    public void setId(int id)  
    {  
        this.id = id;  
    }  
      
    /* 
     * 报数方法 
     */  
    public void baoShu(Person person){
    	
    }
      
}
