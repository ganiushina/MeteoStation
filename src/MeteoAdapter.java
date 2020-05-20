import java.time.*;
import java.util.Calendar;

public class MeteoAdapter implements MeteoSensor  {

    SensorTemperature sensorTemperature;

    public MeteoAdapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
//        LocalDateTime dateSensor;
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, sensorTemperature.year());
//        c.set(Calendar.DAY_OF_YEAR, sensorTemperature.day());
//        c.set(Calendar.HOUR, sensorTemperature.second());
//        int month = c.get(Calendar.MONTH);
//        int hour = c.get(Calendar.HOUR);
//
//        dateSensor = LocalDateTime.of(sensorTemperature.year(), month, sensorTemperature.day(), hour, sensorTemperature.second());
//        return dateSensor;
        return LocalDateTime.of(sensorTemperature.year(), 1, 1, 0, 0, 0).plusDays(sensorTemperature.day()-1).plusSeconds(sensorTemperature.second());
    }
}
