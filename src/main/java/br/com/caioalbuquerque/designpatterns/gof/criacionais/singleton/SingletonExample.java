package br.com.caioalbuquerque.designpatterns.gof.criacionais.singleton;

/**
 * It is very useful for expensive resources in terms of creation costs.
 * Examples of there resources are loggers, DB connections, shared items, config items and other resources.
 *
 * @author Caio Henrique Albuquerque
 * @since 27/04/2022
 */
public class SingletonExample {
    private static SingletonExample INSTANCE;

    private SingletonExample() {}

    public static SingletonExample getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }

        return INSTANCE;
    }

    // getters and setters
}