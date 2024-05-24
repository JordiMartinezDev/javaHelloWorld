package newPackageTest;
import newPackageTest.Human;

public class Woman extends Human{
    
    public Woman(int age, String name){
        super(age,name);
    }

    public void giveBirth(){
        System.out("Giving birth to my baby <3");
    }
}
