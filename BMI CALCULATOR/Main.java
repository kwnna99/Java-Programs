/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author konst
 */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Number of people: ");
    int number= scanner.nextInt();
    int maxAge=0;
    int totalAge=0;
    for(int i=1; i<= number; i++){
        System.out.println("Person number "+i);
        System.out.println("First name: ");
        String firstName= scanner.next();
        System.out.println("Last name: ");
        String lastName= scanner.next();
        System.out.println("Age: ");
        int age= scanner.nextInt();
        maxAge=Person.maxAge(age,maxAge);
        totalAge+= age;
        System.out.println("Height (m): ");
        double height= scanner.nextDouble();
        System.out.println("Weight (kg): ");
        double weight= scanner.nextDouble();
        System.out.println("My name is "+firstName+" "+lastName+".");
        System.out.println("I am " +age +" years old.");
        if(Person.adult(age)){
            System.out.println("I am an adult.");
        }
        else{
            System.out.println("I am not an adult.");
        }
        System.out.println("I am "+ height +" m tall.");
        System.out.println("I weigh "+weight+" kg.");
        System.out.println("My BMI is "+Math.round(Person.bmi(weight, height))+".");
        if(Person.isHealthy(Person.bmi(weight,height))) {
            System.out.println("I am healthy!");
        }
        else{
            System.out.println("I am not healthy.");
        }
    }
    System.out.println("Age of oldest person:"+maxAge+".");
    System.out.println("Average age:"+Person.averageAge(totalAge,number)+".");
  }
}
