package lesson1;

public class StringHandler {

    private String str;

    public StringHandler(String str){
        this.str = str;
    }

    public String geString(){
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }

    @Override
    public String toString(){
        return "String Handler were called " + str;
    }
}
