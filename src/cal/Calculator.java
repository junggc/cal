package cal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


//        Pattern pattern = Pattern.compile("^[0-9]*$");


        Calcu cal = new Calcu();

        Scanner s = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        while(true) {
        try {
            cal.setA(Integer.parseInt(s.nextLine()));

         //   System.out.println("숫자만 입력하세요.");
            // cal.setA(s.nextInt());
        } catch (Exception e) {
            System.out.println("숫자만 입력하세요.");
            continue;
          } break;
        }
       //     System.out.println(cal.getA());

        loop1:
        while(true) {
            System.out.println("+,-,*,/,% 연산자를 입력하세요.");
            Scanner c = new Scanner(System.in);

            System.out.println(1111111);
            String pattern = "^[0-9]*$";
            System.out.println(2222222);
         //   cal.setB(Integer.toString(c.nextInt()));
            System.out.println(3333333);
          try {
              System.out.println(4443333);
              cal.setB(c.nextLine());
              System.out.println(53333);
              if (cal.getB().equals("+")){

              }else if(cal.getB().equals("-")){

              }else if(cal.getB().equals("*")){

              }else if(cal.getB().equals("/")){

              }else if(cal.getB().equals("%")){

              }else if(Pattern.matches(pattern, cal.getB())){

              }else

          } catch (Exception e2) {
              System.out.println("~~~~~~+,-,*,/,% 만 입력 하세요.");
              e2.printStackTrace();
              continue loop1;
            }  break;

        }
      //      System.out.println(cal.getB());

            Scanner an = new Scanner(System.in);
            System.out.println("숫자!!!를 입력하세요.");
            cal.setC(an.nextInt());
     //       System.out.println(cal.getC());

            if (cal.getB().equals("+")) {
                System.out.println("입력한 값들의 합은 " + (cal.getA() + cal.getC()) + " 입니다.");
            } else if (cal.getB().equals("-")) {
                System.out.println(cal.getA() - cal.getC());
            } else if (cal.getB().equals("*")) {
                System.out.println(cal.getA() * cal.getC());
            } else if (cal.getB().equals("/")) {
                System.out.println(cal.getA() / cal.getC());
            } else if (cal.getB().equals("%")) {
                System.out.println(cal.getA() % cal.getC());
            }


        }
    }

