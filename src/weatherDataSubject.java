import java.util.List;
import java.util.ArrayList;
public class weatherDataSubject implements subject{
   private double temperature;
 private double humidity;
 private List<Observer> observerList;
 public weatherDataSubject(double temperature,double humidity){
    this.temperature=temperature;
    this.humidity=humidity;
    this.observerList=new ArrayList<>();
 }
  @Override
    public void add(Observer observer) {
     observerList.add(observer);
    }
    @Override
    public void remove(Observer observer) {

     observerList.remove(observer);
    }
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
observer.update(temperature,humidity);
        }
    }

    @Override
    public void setUnits(double temperature, double humidity) {
        this.temperature=temperature;
        this.humidity=humidity;
    }

    @Override
    public double getTemperature() {
        return 0;
    }

    public void unitChange(){
        notifyObserver();
    }
    public void setUnit(double temperature,double humidity){
     this.temperature=temperature;
     this.humidity=humidity;
     unitChange();
    }
}
