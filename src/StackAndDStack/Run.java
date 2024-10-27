public class Run {
    public static void main(String[] args) {
        DStack num=new DStack();
       num.push(29);
       num.show();
       num.push(42);
       num.show();
       num.push(41);
       num.show();
       num.push(29);
       num.show();
       num.push(42);
       num.show();
       num.push(41);
       num.show();
       num.pop();
       num.show();
        num.pop();
        num.show(); num.pop();
        num.show(); num.pop();
        num.show(); num.pop();
        num.show();


//
//        System.out.println(num.peak());
////        System.out.println(num.pop());
//        System.out.println("size"+num.size());
//        System.out.println(num.isEmpty());


    }
}
