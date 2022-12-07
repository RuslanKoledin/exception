package interfacee;

public class Drum implements tool{
    private double size ;

    public Drum(){}

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("барабан с длинной барабанов " + size + " играет !");
    }
}
