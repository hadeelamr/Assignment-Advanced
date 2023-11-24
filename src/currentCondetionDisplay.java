import javax.security.auth.Subject;

public class currentCondetionDisplay implements Observer,Display {
    private double temperature;
    private double humidity;
    private subject data;
    currentCondetionDisplay(subject data){
        this.data=data;
        data.add(this);
    }
    @Override
    public void update(double temperature,double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        displayInfo();

    }
    @Override
    public void displayInfo() {
        System.out.println("the current condetions " +temperature +"F and " + humidity+"% ");
    }
}


