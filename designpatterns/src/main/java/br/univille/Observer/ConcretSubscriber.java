package br.univille.observer;

public class ConcretSubscriber 
    implements Subscriber {

    public void update(String context){
        System.out.println(context);
    }
    

}
