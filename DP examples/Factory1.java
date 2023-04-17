  import com.factory.FactoryClass ; //The factory class
  import com.factory.PC; //sub-class
  import com.factory.Server; //sub-class
  //PC and Server classes extend from Computer.

  public static void main(String[] args){

    FactoryClass fc = new FactoryClass();
    Computer comp1 = fc.getComputer("PC",16,499,4.3);
    System.out.println(comp1);


    Computer comp2 = fc.getComputer("Server",30,900,9);
    System.out.println(comp2);

  //Now you can see the output in your console.
  }