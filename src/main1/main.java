package main1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double time=scanner.nextDouble();
        double g=9.8;
        double speed;
        double distance;
        speed=time*g;
        distance=0.5*g*time*time;
        System.out.println("The speed of the object at "+time+"seconds after its release is "+speed+"and the distance the object has travelled in the "+time+"seconds after realease is "+distance);
    }
}
