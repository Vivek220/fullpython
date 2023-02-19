 abstract class animal{
    abstract void walk();

}
class horse extends animal{
    public void walk(){
        System.out.println("walk with four legs");

    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("walk with two legs");
    }
}
public class abstraction {
    public static void main(String args[]){
        horse Horse1=new horse();
        Horse1.walk();

        animal aa=new animal();//here we got error due to  abstract the animal class 
        aa.walk();


    }
    
}
