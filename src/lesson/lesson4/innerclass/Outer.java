package lesson.lesson4.innerclass;

public class Outer {
    public class Inner{
        private String name;

        public Inner(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }
}
