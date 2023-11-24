public class TemperatureUnitsDecorator implements subject {
   private subject data;
    private String units;
private double temperature;
public TemperatureUnitsDecorator(subject data, String units){
    this.data =data;
    this.units=units;
}
    @Override
    public void add(Observer observer) {
        data.add(observer);
    }
    @Override
    public void remove(Observer observer) {
        data.remove(observer);
    }
    @Override
    public void notifyObserver() {
         data.notifyObserver();
    }
   public void setUnits(double temperature,double humidity ){
    data.setUnits(temperature,humidity);
   }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public void getUnits(){
         if(units.equals("celsius")){
             System.out.println("the tempereture in celsius " +switchToFahrenhait(data.getTemperature()));
         } else if (units.equals("Fahrenhait")) {
             System.out.println("the tempereture in Fahrenhait " +data.getTemperature());

         }
    }
    public double switchToFahrenhait(double celsius){
         return ((celsius* 9/5)+32);
    }
}