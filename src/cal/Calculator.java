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

            String pattern = "^[0-9]*$";

          try {
              cal.setB(c.nextLine());
              if (!cal.getB().equals("+") && !cal.getB().equals("-") && !cal.getB().equals("*") && !cal.getB().equals("/") && !cal.getB().equals("%")) {
                  System.out.println("연산자를 입력하세요.");
                  continue loop1;
              }

          } catch (Exception e2) {
              System.out.println("~~~~~~+,-,*,/,% 만 입력 하세요.");
              e2.printStackTrace();
              continue loop1;
            }  break;

        }
            Scanner an = new Scanner(System.in);
            System.out.println("숫자!!!를 입력하세요.");
        loop2:
      while(true) {
          try {
              cal.setC(Integer.parseInt(an.nextLine()));
          } catch (Exception e3) {
              System.out.println("여기도 숫자만 입력하세요.");
              continue loop2;
          }
          break;
      }
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

