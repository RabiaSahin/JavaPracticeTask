package day31_CustomClass_Cunstructor;

public class CarpetTest {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3, 5.5, 8, true);

        Carpet carpet2 = new Carpet(2.5, 6,10,false);

        System.out.println(carpet1);
        System.out.println(carpet2);

     //   Carpet{width=3.0, length=5.5, unitPrice= $8.0, isPersian=true, total price= $332.0}
     //   Carpet{width=2.5, length=6.0, unitPrice= $10.0, isPersian=false, total price= $150.0}
    }
}
