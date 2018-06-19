class Solution01{
  int account_num = 12344;
  static int currency = 10; // static variable
  public static void main(String args[]){
    
    //whole numbers
    short num01 = 152;
    short num03 = 32500;
    short num04 = 25612;
    int num05 = num03 + num04;
    System.out.println("sum:"+num05);
    
    //decimals
    
    float num06 = 544.12f;
    byte num07 = 15;
    float num08 = num06 + num07;
    
    System.out.println("sum of decimals:"+num08);
    
    //Boolean
    //character
    char char01 = '\u03A3';
    System.out.println("sigma symbol:"+char01);
    
    String fname = "bhavani";
    char lname = 'T';
    String fullname = fname + " " +lname;
    System.out.println("fullname:"+fullname);
    
    boolean bool01 = true;
    boolean bool02 = false;
    //System.out.println(bool01 + bool02);
  }
}