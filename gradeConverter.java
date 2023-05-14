//Aaron Prince Anu

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class gradeConverter{
    
    //initialize vars
    static char A = 'A';
    static char B = 'B';
    static char C = 'C';
    static char D = 'D';
    static char F = 'F';
    static char X = 'X';
    static int Z;

    public static void main(String[] args) throws IOException {
        
        //ask for current grade
        System.out.println("\nWhat is your current grade?");
        Z = In.getInt();

        convertToGrade(Z);
        makeFile();
    }

    public static void convertToGrade(int usermark) {
        
        //grade range into character
        if (80 <= usermark && usermark <= 100) {
            System.out.println("\nYou have an: " + A + "\n");
        } else if (70 <= usermark && usermark <= 79){
            System.out.println("\nYou have a: " + B + "\n");
        } else if (60 <= usermark && usermark <= 69) {
            System.out.println("\nYou have a: " + C + "\n");
        } else if (50 <= usermark && usermark <= 59) {
            System.out.println("\nYou have a: " + D + "\n");
        } else if (0 <= usermark && usermark <= 49) {
            System.out.println("\nYou have a: " + F + "\n");
        } else {
            System.out.println("\nYou have an: " + X + "\n");
        }
    }

    public static void makeFile() throws IOException {
        //write if 100%
        if (Z == 100) {
            try {
                //get directory
                //String x = System.getProperty("user.home");

                //write file
                FileWriter congrats = new FileWriter("congratulations.txt");
                congrats.write("cOnGrAtUlAtIoNs :D");
                congrats.close();

                //read file (buffered reader)
                FileInputStream fStream = new FileInputStream("congratulations.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fStream));

                String strline;

                //read file
                while ((strline = br.readLine()) != null) {
                    System.out.println(strline);
                }

                //close
                fStream.close();

            } catch (Exception e) {
                System.out.println("An error occurred\n");
                e.printStackTrace();
            }
        } else {
            try {
                //get directory
                //String x = System.getProperty("user.home");

                //write file
                FileWriter oOf = new FileWriter("oOf.txt");
                oOf.write("oOf");
                oOf.close();

                //read file (buffered reader)
                FileInputStream fStream = new FileInputStream("oOf.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fStream));

                String strline;

                //read file
                while ((strline = br.readLine()) != null) {
                    System.out.println(strline);
                }

                //close
                fStream.close();

            } catch (Exception e) {
                System.out.println("An error occurred\n");
                e.printStackTrace();
            }
        }
    }
}