package lesson.lesson8.InterfaceExample;

public abstract class Border {
    public int border(){
        return 2;
    }

    public double border(double thickness){
        return Math.pow(thickness, 2);
    }
}
