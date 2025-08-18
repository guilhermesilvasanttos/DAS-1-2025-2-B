package br.univille.singleton;

public class Singleton {
    private static Singleton instance; //static primeiro a ser carregado na memoria

    private singleton() {
        // Construtor privado para evitar instanciamento externo
        
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
