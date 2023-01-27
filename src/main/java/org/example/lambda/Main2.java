package org.example.lambda;

public class Main2 {
    public static void main(String[] args) {
    Cat cat=new Cat();
    cat.setName("biralu kali");
    cat.setAge(2);

    Dog dog= new Dog();
    dog.setName("Rohan");
    dog.setAge(10);
    Printables dogPrintables=(dogsuffic)-> System.out.println("hello for the dog "+dog.getName());
    Printables trigrePrintables=(wildcat)-> System.out.println("WILD CAT MEW "+wildcat);


  Printables lamdaPprintiables=
            (s)->{
                System.out.println(cat.getName()+" said '");
                System.out.println("maw whmaw "+s);
                System.out.println("'");
            };
    printThings(dogPrintables);
     printThings(lamdaPprintiables);
    }


    public  static  void printThings(Printables things){
        things.print("!");
    }
}
