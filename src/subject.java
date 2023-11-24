public interface subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();

    void setUnits(double temperature, double humidity);

    double getTemperature();
}
