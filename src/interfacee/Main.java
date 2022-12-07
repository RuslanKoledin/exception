package interfacee;

public class Main {
    public static void main(String[] args) {


        Guitar guitar = new Guitar(7);
        Drum drum = new Drum(20d);
        Pipe pipe = new Pipe(32.1);

        tool [] tools = new tool[3];
        tools[0] = guitar;
        tools[1] = drum ;
        tools[2] = pipe;


        for (int i = 0; i < tools.length;i++){
            tools[i].play();
            System.out.println("_________________________");
        }


    }
}
