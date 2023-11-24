public class statisticsDisplay implements Observer,Display{
    private double temperature;
    private double humidity;
    private subject data;
    public statisticsDisplay(subject data){
        this.data=data;
        data.add(this);
    }
    public void update(double temperature, double humidity) {
        this.temperature=temperature;
        this.humidity=humidity;
        displayInfo();
    }

    @Override
    public void displayInfo() {
System.out.println("statistic "+ temperature+ "F and "+ humidity +"% ");
    }
}
