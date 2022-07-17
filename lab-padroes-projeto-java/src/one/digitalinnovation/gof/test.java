package one.digitalinnovation.gof;

public class test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);
        LazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);
    }
}
