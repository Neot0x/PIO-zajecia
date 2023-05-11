package rectangle_exercise;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < rectangles.length; i++){
            System.out.println("Do you want to enter rectangle parameters? y/n");
            
            char choice = input.next().charAt(0);
            if(choice == 'y'){
                System.out.println("Enter the width then enter the height:");
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            }else{
                rectangles[i] = new Rectangle();
            }
        }
        
        System.out.println("The rectangles are: ");
        for(int i = 0; i < rectangles.length; i++){
            System.out.println("Rectangle " + (i+1) + ": width: " + rectangles[i].getWidth() + ", height: " + rectangles[i].getHeight());
            System.out.println("Area: "+ rectangles[i].getArea());
            System.out.println("Perimeter: "+ rectangles[i].getPeri());
        }
    }
}