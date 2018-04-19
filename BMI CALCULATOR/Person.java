/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author konst
 */
class Person{
    /**
     * Calculates the BMI of a person given the weight and height
     * @param weight A person's weight
     * @param height A person's height
     * @return returns the BMI
     */
  public static double bmi(double weight, double height){
    return weight / height / height;
  }
  /**
   * Concludes if the BMI of a person is in the healthy range
   * @param bmi the bmi of a person
   * @return Returns true if the BMI is healthy and false if it isn't
   */
  public static boolean isHealthy(double bmi){
    return bmi>=18.5 && bmi<25.0;
  }
  /**
   * Calculates the average age of the people participating
   * @param totalAge the sum of the ages of all the people
   * @param number The number of people participating
   * @return Returns the average age as an integer (e.g. 25.8 is 25)
   */
  public static int averageAge(int totalAge, int number){
    return totalAge/number;
  }
  /** 
   * Checks if a person is an adult
   * @param age The age of the person
   * @return Returns true if he/she is an adult, otherwise false
   */
  public static boolean adult(int age){
      return age>=18;
  }
  /**
   * Finds the biggest of the ages entered
   * @param age     current age entered
   * @param maxAge the biggest age
   * @return returns the biggest age
   */
public static int maxAge(int age, int maxAge){
    if(age>maxAge){
        maxAge=age;
    }
    return maxAge;
 }
}