# Assignment-Advanced
## The weather monitoring and monitoring system is designed for real-time weather data, where users are able to specify the information using observer design and decoration methods.

### first
WeatherDataSubject: Represents real-time weather data, including attributes such as temperature and humidity. It maintains a list of observers and notifies them of any weather data.
Observer interface: Sign format records to update date information.
Concrete observers(CurrentConditionsDisplay, StatisticsDisplay): Implement specific methods for displaying weather data when notified by the subject(WeatherData).
### second
Decoration pattern:

Decorator Interface: Provides a blueprint for decorators to modify or enhance the weather information displayed.
Concrete Decorators (TemperatureUnitsDecorator, WindSpeedDecorator, PrecipitationDecorator): Allow users to customize the weather information displayed by adding details such as units of temperature (Celsius/Fahrenheit), wind speed, or precipitation.
Users can customize the weather information displayed using decoration widgets.
Decorators such as TemporaryUnitsDecorator allow users to switch between temperature units (Celsius/Fahrenheit).
WindSpeedDecorator and PrecipitationDecorator can add information about wind speed or precipitation to the displayed weather data.

### third

Observer pattern:
The system starts with weather data.
Any changes in the weather (for example, simulated updates in temperature and humidity) are reflected in the WeatherData object.
When weather data changes, the WeatherData topic notifies its registered observers (CurrentConditionsDisplay, StatisticsDisplay), who update their displays accordingly.
### fourth
in subject interface 
can Add and remove observers.
and notified changes in the weather data and allowing them to react  to update their displays.
### fifth
The display:
have different observer displays (like CurrentConditionsDisplay and StatisticsDisplay) update with changes in weather data.
### and finally
The main class
Creates an instance of WeatherData with initial temperature and humidity.
Instances of observers (CurrentConditionsDisplay, StatisticsDisplay) are created and registered using the WeatherData topic, and the unit is returned.




