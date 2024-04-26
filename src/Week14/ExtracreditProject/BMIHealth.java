/*
Andres Jaimes
ID: 6289563
*/

package Week14.ExtracreditProject;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class BMIHealth
{
    public static void main(String[] args) {            //The main method
        Person aPerson = createPersonObject();
        showBMI(aPerson);
    }

//---------------------------------------------------------------------------------------------------------------------------//

        public static Person createPersonObject() {         //the questionnaire of the entire code. This will ask the following questions to the user:
            String firstName;
            String lastName;
            double height;
            double weight;
            Person person = new Person("","",0,0);  //Adds default results

            // Users first name and last name, height in inches, weight in pounds
            firstName = JOptionPane.showInputDialog("What is your first name?");
            person.setFirstName(firstName);

            lastName = JOptionPane.showInputDialog("What is your last name?");
            person.setLastName(lastName);

            height = Double.parseDouble(JOptionPane.showInputDialog("What is your height in inches?"));
            person.setHeightInches(height);

            weight = Double.parseDouble(JOptionPane.showInputDialog("What is your weight in pounds?"));
            person.setWeightPounds(weight);

            // Return the new values
            return person;
    }
    //-----------------------------------------------------------------------------------------------------------------------------//

                            public static void showBMI(Person aPerson) {          //This is to display the final results using append and JOptionMessage dialog box
                                StringBuilder message = new StringBuilder();

                                //Print the Person object received as a parameter
                                message.append("Person: ").append(aPerson.toString()).append("\n");


                                // Call and store the return value of the method that calculates the person’s BMI, then append it to the message
                                double bmi = aPerson.calculateBMI();
                                DecimalFormat df = new DecimalFormat("#.##");

                                message.append("BMI: ").append(df.format(bmi)).append("\n");



                                // Call and store the return value of the method that determines the person’s health, then append it to the message
                                String healthStatus = aPerson.determineHealth(bmi);

                                message.append("Health Status: ").append(healthStatus).append("\n");



                                // Always display the recommended weight if it's calculated
                                double recommendedWeight = aPerson.recommendedWeight();

                                message.append("Recommended Weight: ").append((int) recommendedWeight).append(" lbs\n");




                                // Display the message using JOptionPane.showMessageDialog()
                                JOptionPane.showMessageDialog(null, message);
                            }

}
