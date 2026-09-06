public class Condition {
    public static void main(String[] args) {
         /*
         Syntax of if statement :
         is
         if( boolean expression T or F){
         //body
         }else{
         // do this
         }
          */

        int salary = 24567;
//        if (salary > 10000){
//        salary = salary+1000;
//        }else {
//            salary= salary+2000;
//        }
//        System.out.println(salary);
        if (salary>10000){
            salary += 2000;
        } else if (salary>30000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
