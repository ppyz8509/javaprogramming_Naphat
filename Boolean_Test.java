public class Boolean_Test {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z = x || y;
        System.out.println("give x = false, y = true and z = x || y then");
        System.out.println("!x = " + !x);
        System.out.println("x && y = " + (x && y));
        System.out.println("z = " + z);
        System.out.println("x || z =" + (x && z));
        System.out.println("x || x =" + (y && x));
    }
    
}