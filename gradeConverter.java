//Aaron Prince Anu

class gradeConverter{
    
    //initialize vars
    static char A = 'A';
    static char B = 'B';
    static char C = 'C';
    static char D = 'D';
    static char F = 'F';
    static char X = 'X';

    public static void main(String[] args) {
        
        //ask for current grade
        System.out.println("\nWhat is your current grade?");
        converToGrade(In.getInt());
    }

    public static void converToGrade(int usermark) {
        
        //grade range into character
        if (80 <= usermark && usermark <= 100) {
            System.out.println("\nYou have an: " + A + "\n");
        } else if (70 <= usermark && usermark <= 79){
            System.out.println("\nYou have an: " + B + "\n");
        } else if (60 <= usermark && usermark <= 69) {
            System.out.println("\nYou have an: " + C + "\n");
        } else if (50 <= usermark && usermark <= 59) {
            System.out.println("\nYou have an: " + D + "\n");
        } else if (0 <= usermark && usermark <= 49) {
            System.out.println("\nYou have an: " + F + "\n");
        } else {
            System.out.println("\nYou have an: " + X + "\n");
        }
    }
}