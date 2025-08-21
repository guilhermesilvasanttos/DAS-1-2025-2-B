package br.univille.singleton;
public class Observer {
     public void update(String message) {
      //Implementação
        System.out.println("Observando: " + message);
     }
     //2**
       public void notify(String message) {
         //notificação
         System.out.println("Notificando: " + message);  
      }
      //Assinante .
       public void subscribe(Observer observer) {
         System.out.println("Inscrito: " + observer);
      }
         public void unsubscribe(Observer observer) {
            System.out.println("Desinscrito: " + observer);
      }
}

