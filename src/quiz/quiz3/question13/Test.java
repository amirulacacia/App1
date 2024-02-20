package quiz.quiz3.question13;

interface Rideable {
    void ride(String name);
}

class Animal {

}

class Horse extends Animal implements Rideable {
    @Override
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal horse = new Horse();
        ((Horse) horse).ride("Emma"); // Correct
        // horse.ride("EMMA"); // Wrong because there is no ride method on Animal class
        ((Rideable) horse).ride("emma"); // Correct
        // (Horse)horse.ride("EMMA"); // Wrong because there is no ride method on Animal class
        // (Rideable)(Horse)horse.ride("EMMA"); // Wrong because it evaluate the the dot first which is horse.ride("EMMA"), then casting to Horse
        // (Rideable)horse.ride("emma"); //Wrong because it evaluate the the dot first which is horse.ride("EMMA"), then casting to Rideable
        ((Rideable) (Horse) horse).ride("EMMA"); // Correct
        ((Horse) (Rideable) horse).ride("emma"); // Correct
        // (Horse)(Rideable)horse.ride("EMMA"); //Wrong because it evaluate the the dot first which is horse.ride("EMMA"), then casting to Rideable
    }
}
