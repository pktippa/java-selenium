class Solution3{

public static void main(String args[]){
    //Airthematic operators
    
    int a = 70;
    int b = 57;
    int sum_nums = a + b;
    int subtract_num = 45;
    int sum_this = sum_nums-subtract_num;
    float mul_num = 67.5f;
    float mul_this = mul_num/subtract_num;
    System.out.println("First number"+a);
    System.out.println("Second number"+b);
    System.out.println("sum:" +sum_nums);
    System.out.println("sub:" +sum_this);
  //Multiplication
    System.out.println("mul:" +mul_this);
  //Division
  float div_num = 22.5f;
  float divide_this = mul_num / div_num;
  System.out.println("Divisor:" +divide_this);
   
  //Modulus
  float mod_this = 22.5f;
 // float div_num = 22.5f;
  float mod = mod_this % div_num;
  System.out.println("value:" +mod);
  
 //Increment
  int inc_num = 23;
  int inc_num2 = inc_num++ +1;
int inc_num3 = inc_num2++ +1;
  int inc_num4 = inc_num3++ +1;
  System.out.println("Increment:" +inc_num4);
  
  //Decrement
  int dec_num = 21;
  int dec_num1 = dec_num-- -1;
  int dec_num2 = dec_num1-- -1;
  System.out.println("Decrement:" +dec_num2);
  
  }
}