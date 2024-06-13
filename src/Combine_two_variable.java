public class Combine_two_variable {
    public static void main(String[] args) {
        String x = "water";
        String y = "cold-water";
        x=y;
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        String a = "milk";
        String b = "cold-mild";
        b=a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        String c = "juice";
        String d = "cold-juice";
        String temp;
        temp =c;/*In this method you can chane the declaretio of data type*/
        c=d;
        d=temp;
        System.out.println("c: "+c);
        System.out.println("d: "+d);

    }
}

