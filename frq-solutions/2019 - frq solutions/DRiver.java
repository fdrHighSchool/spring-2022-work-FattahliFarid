public class DRiver {
public static void main (String[] args) {
StepTracker person = new StepTracker(10000);
  person.addDailySteps(4567);
  person.addDailySteps(1111);
  person.addDailySteps(1738);
  person.addDailySteps(31960);
  person.addDailySteps(27542);

   System.out.println("person active days: " + person.activeDays());
   System.out.println("person total days: " + person.totalDays());
   System.out.println("person average steps: " + person.averageSteps());
   System.out.println("person total steps: " + person.totalsteps());
   System.out.println();
  }
}
