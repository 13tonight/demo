package feb13.abstractionExample;

public abstract class Phone {

    public  abstract void call();


}
abstract class mobile extends Phone{

    public abstract void cordless();
}
abstract class smartphone extends mobile{
    public abstract void mobile();
}
 class AIphone extends smartphone{


     @Override
     public void call() {
         System.out.println("calling");
     }

     @Override
     public void cordless() {
         System.out.println("using a cordless phone");
     }

     @Override
     public void mobile() {
         System.out.println("mobile phone");
     }
 }