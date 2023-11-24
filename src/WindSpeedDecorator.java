public class WindSpeedDecorator extends Decorator {
    private Decorator windData;
    private double windSpeed;

    public WindSpeedDecorator(Decorator windData,double windSpeed){
        this.windData=windData;
        this.windSpeed=windSpeed;
    }
    @Override
    public String displayedWeatherInfo() {
        return windData.displayedWeatherInfo();
    }
}