public class PrecipitationDecorator extends  Decorator{
    private Decorator PrecipitationData;
    private String Precipitation;
    public PrecipitationDecorator(Decorator PrecipitationData,String Precipitation){
        this.PrecipitationData=PrecipitationData;
        this.Precipitation=Precipitation;
    }

    @Override
    public String displayedWeatherInfo() {
        return PrecipitationData.displayedWeatherInfo();
    }
}
