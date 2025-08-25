packeg br.univille.observer;
import java.util.ArrayList;

public class Publisher {
    //private Subscriber[] Subscriber  = new Subscriber[10];
    private ArrayList<Subscriber> subscribers =
        new ArrayList<>();
    private String mainState;{
    }
    public void setMainState(String mainState){
        this.mainState = mainState;
    }
    public void subscribers(Subscriber assinante);
        subscribers.add(assinante);{
        }
    public  void notifySubscribers(){
        for(Subscriber umAssinante; subscribers){
            umAssinante.update(mainState);
        }
    }

}
