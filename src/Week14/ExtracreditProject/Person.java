/*
Andres Jaimes
ID: 6289563
 */

package Week14.ExtracreditProject;

public class Person
{
    private String lastName, firstName;
    private double heightInches, weightPounds;

    //Constructor
    public Person(String lastName, String firstName, double heightInches, double weightPounds)      //Last name, first name, height in inches, and weight in pounds.
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

                    public String getLastName()     //Returns the last name of the person
                    {
                        return lastName;
                    }

                    public String getFirstName()    //Returns the first name of the person
                    {
                        return firstName;
                    }

                    public double getHeightInches()     //Returns the height of the person
                    {
                        return heightInches;
                    }

                    public double getWeightPounds()     //Returns the weight of the person
                    {
                        return weightPounds;
                    }

                            public void setLastName(String LastName)    //Gets the last name of the person
                            {
                                this.lastName = LastName;
                            }

                            public void setFirstName(String firstname)  //Gets the first name of the person
                            {
                                this.firstName = firstname;
                            }

                            public void setHeightInches(double height)  //Gets the height in inches
                            {
                                this.heightInches = height;
                            }

                            public void setWeightPounds(double weight) //Gets the weight in pounds
                            {
                                this.weightPounds = weight;
                            }
 //---------------------------------------------------------------------------------------------------------//

 public double calculateBMI()   //For calculating BMI
 {
    double bmi = 0;

    //use the formula: BMI= [weight in pounds / ((height in inches) X (height in inches))] x 703
     bmi = getWeightPounds() / (getHeightInches() * getHeightInches()) * 703;

     return bmi;
 }

//---------------------------------------------------------------------------------------------------------//

 public String determineHealth(double health)   //This is to determine the health status of the person
 {
     String healthStatus = "";

     if (health < 18.5)
     {
         healthStatus = "Underweight";
     }
     else if (health >= 18.5 && health < 25)
     {
         healthStatus = "Healthy";
     }
     else if (health >= 25 && health < 30){
         healthStatus = "Overweight";
     }
     else if (health >= 30 && health <= 39.9)
     {
         healthStatus = "Obese";
     }
     else
     {
         healthStatus = "Extremely Obese";
     }


     return healthStatus;

 }

 //---------------------------------------------------------------------------------------------------------//

    public String toString() //To complete the entire name of the person
    {
        return getFirstName() + " " + getLastName();
    }

//---------------------------------------------------------------------------------------------------------//

 public double recommendedWeight()      //For recommendations
 {
     double optimumWeight = 0;

     //use formula: optimumWeight = (25 * Math.pow(height, 2))/703;
     optimumWeight = (25 * Math.pow(getHeightInches(), 2)) / 703;

     return optimumWeight;
 }

//---------------------------------------------------------------------------------------------------------//


}


