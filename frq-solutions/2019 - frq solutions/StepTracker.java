public class StepTracker {
  private int totalDays;
  private int activeDays;
  private int minSteps;
  private int totalsteps;

public StepTracker(int ms){
  this.totalDays = 0;
  this.activeDays = 0;
  this.totalsteps = 0;
  this.minSteps = ms;
}
public int totalsteps(){
  return this.totalsteps;
}
public int totalDays(){
return this.totalDays;
}
public int activeDays(){
  return activeDays;
}

public double averageSteps(){
  if (totalDays == 0) {
    return 0.0;
  }
  else {
    return (double) totalsteps/totalDays;
  }
}

public void addDailySteps(int ms){
this.totalsteps += ms;
this.totalDays++;
if (ms >=this.minSteps) {
  this.activeDays++;
      }
    }

  }
