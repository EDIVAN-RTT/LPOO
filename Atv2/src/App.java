public class App {
    public static void main(String[] args) throws Exception {
        Animal animal0, animal1, animal2, animal3;

        animal0 = new Animal();
        animal0.emitirSom();

        animal1 = new Gato();
        animal1.emitirSom();

        animal2 = new Cachorro();
        animal2.emitirSom();

        animal3 = new Preguiça();
        animal3.emitirSom();
    }
}
