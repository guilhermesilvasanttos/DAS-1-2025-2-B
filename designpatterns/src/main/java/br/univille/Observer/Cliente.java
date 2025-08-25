package br.univille.observer;
public class Cliente {
    public static void main(String[] args){
        //Publicador
        var grupoFamilia = new publisher();

        var zezinho = new ConcretSubscriber();
        var huguinho = new ConcretSubscriber();
        
        //Entrou no grupo da familia
        grupoFamilia.Subscriber(zezinho);
        grupoFamilia.Subscriber(huguinho);

        grupoFamilia.setMainState("Bom Dia");
        //botão enviar
        grupoFamilia.notifySubscribers();
    }

}
