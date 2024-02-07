package lesson.lesson2;

public class Exercise2 {

    double xOff, yOff, zOff;
    int x1 = 2, x2 = 0;
    int y1 = 1, y2 = 0;
    int z1 = 3, z2 = 6;
    
    public static void main(String[] args) {
        
        Exercise2 exercise2 = new Exercise2();
        double d = exercise2.calculate();

        System.out.printf("Distance: %.2f", d);
    }

    public double calculate(){
        this.xOff = Math.pow(this.x1 - this.x2, 2);
        this.yOff = Math.pow(this.y1 - this.y2, 2);
        this.zOff = Math.pow(this.z1 - this.z2, 2);

        return Math.sqrt(this.xOff + this.yOff + this.zOff);
    }
}
