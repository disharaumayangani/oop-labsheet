public class AccessModifiersDemo {

    private int private Var = 10;
    double default Var = 20.0;
    protected Boolean protected Var;
    public String public Var = "Hello, world!";

    public int getPrivateVar () {
        return private Var;
    }

    public double getDefaultVar () {
        return default Var;
    }

    protected boolean getProtectedVar () {
        return protected Var;
    }

    public String getPublicVar () {
        return publicVar;
    }
}

class SubclassDemo extends AccessModifiersDemo {

    public void displayProtectedVar () {
        System.out.println("Protected variable: " + getProtectedVar ());
    }
}

public class Main{
 

    public static void main (String [] args) {
          AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo ();

        System.out.println("Private variable: " + accessModifiersDemo. GetPrivateVar ());
        System.out.println("Default variable: " + accessModifiersDemo. GetDefaultVar ());
        System.out.println("Protected variable: " + accessModifiersDemo. GetProtectedVar ());
        System.out.println("Public variable: " + accessModifiersDemo. GetPublicVar ());
    }
}
