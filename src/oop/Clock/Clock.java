package oop.Clock;

public class Clock {
    public int hours;
    public  int minutes;
    public  int seconds;



//    * default (with no parameters passed; is should initialize the represented time to 12:00:00)
    public Clock(){
        this.hours =12;
        this.minutes =0;
        this.seconds =0;

    }
//     * a constructor with three parameters: hours, minutes, and seconds.
    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }
//    a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and second
    public  Clock(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds / 60) % 60;
        this.seconds = seconds * 60;
    }

//    * a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above).
    public  void setClock(int seconds){
        this.hours = seconds/3600;
        this.minutes =(seconds/60)%60;
        this.seconds = seconds*60;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
//     * method tick() with no parameters that increments the time stored in a Clock object by one second.
    public void tick(){
        int time = (this.hours * 3600)+(this.minutes * 60) +this.seconds;

        time +=1;
        this.setClock(time);
    }
//      * method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time
//      represented by the parameter class to the time represented in the current class. (3hr,2min,1sec + 1hr,57min,59sec = 5hr,0min,0sec)


}
