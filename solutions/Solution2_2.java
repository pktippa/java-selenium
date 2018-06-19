class Solution2_2{
  public static void main(String args[]){
   //Equal to
    int var_int = 25;
    int var_int2 = 30;
    boolean num_eq = (var_int==var_int2);
    System.out.println("Result1 :" +num_eq);
    
    // Section b. is not completed.
    
    //Not Equal to
    boolean num_not_eq = (var_int!=var_int2);
    System.out.println("Result2 :" +num_not_eq);
    //Greater than >
    int num1 = 17;
    int num2 = 06;
    boolean condition = (num1>num2);
    System.out.println("Num1: " +num1);
     System.out.println("Num2: " +num2);
    System.out.println("condition:" +condition);
    
    //Lesser than
    int gt_lt_num = 28;
    boolean greater_number = (gt_lt_num > var_int);
    boolean less_number = (gt_lt_num<var_int2);
    System.out.println("Result one: " +greater_number);
    System.out.println("Result Two: " +less_number);
    
    //Greater than or equal to >=     Less than or equal to <=
    int gt_lt_eq_num = 27;
    boolean greater_equal = (gt_lt_eq_num >= var_int);
    boolean lessthan_equal = (gt_lt_eq_num <= var_int2);
    System.out.println("Result greater: " +greater_equal);
    System.out.println("Result less: " +lessthan_equal);
   
    
  }
}