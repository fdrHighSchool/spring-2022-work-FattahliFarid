public class DataStore {
  public static void main(String[] args) {
    // student 1
    String id1 = "1234567";
    String name1 = "Jimmy Smith";
    boolean cc1 = true;
    boolean nx1 = true;
    int[] grades1 = {90, 80, 95, 90, 100};

    // student 2
    String id2 = "9876543";
    String name2 = "Maria Hernandez";
    boolean cc2 = false;
    boolean nx2 = true;
    int[] grades2 = {95, 100, 100, 90, 90};

    // student 3
    String id3 = "1357911";
    String name3 = "Jamal Jenkins";
    boolean cc3 = false;
    boolean nx3 = false;
    int[] grades3 = {85, 85, 95, 100, 90};

    // student 4
    String id4 = "2468101";
    String name4 = "Ramiz Ahmed";
    boolean cc4 = true;
    boolean nx4 = false;
    int[] grades4 = {90, 100, 75, 85, 90};

    // student 5
    String id5 = "1928374";
    String name5 = "Michael Green";
    boolean cc5 = true;
    boolean nx5 = true;
    int[] grades5 = {80, 80, 65, 55, 90};

    Student student1 = new Student("1234567", "Jimmy Smith", true,true, new int[] {90, 80, 95, 90, 100});
    Student student2 = new Student("9876543", "Maria Hernandez", false,true, new int[] {95, 100, 100, 90, 90});
    Student student3 = new Student("1357911", "Jamal Jenkins", false,false, new int[] {85, 85, 95, 100, 90});
    Student student4 = new Student("2468101", "Ramiz Ahmed", true,false, new int[] {90, 100, 75, 85, 90});
    Student student5 = new Student("1928374", "Michael Green", true,true, new int[] {80, 80, 65, 55, 90});


    if (student1.isFailing()) {
     System.out.println(student1.getName() + " you are failing the class, you better fix that before you go to summer school");
   }
   else {
     System.out.println("You are not failing the class keep up the great work!");
   }
   if (student1.getCloseContact()) {
      System.out.println(" Also please report to the auditorium for your take-home COVID test");
    }
    else {
      System.out.println("You are not a close contact, keep masking! Get boosted!");
    }
  } // end main method

} // end class
