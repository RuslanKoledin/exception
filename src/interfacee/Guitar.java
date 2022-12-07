package interfacee;

public class Guitar implements tool{
    private int numberOfStrings;

    public Guitar() {
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("гитара с " + numberOfStrings + " струнами играет!");
    }
}
