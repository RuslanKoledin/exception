package interfacee;

public class Pipe implements tool{
    private double diameter ;

    public Pipe() {
    }

    public Pipe(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Труба с диаметром " + diameter + " играет");
    }
}
