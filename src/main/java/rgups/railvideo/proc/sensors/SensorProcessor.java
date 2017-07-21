package rgups.railvideo.proc.sensors;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.event.EventListener;
import org.springframework.jmx.export.annotation.ManagedResource;
import rgups.railvideo.core.flow.RailvideoEvent;
import rgups.railvideo.model.indicators.FlatSensorData;

/**
 * Created by Dmitry on 20.07.2017.
 */
@ManagedResource
public class SensorProcessor implements BeanNameAware {

    String name;

    String sensorName;
    String sensorType;
    String channel;

    @EventListener
    public void acceptEvent(SensorEvent event) {
        if (!shouldEvent(event)){
            return;
        }


    }

    public void processEvent(SensorEvent event) {

    }

    public boolean shouldEvent(SensorEvent event) {
        FlatSensorData data = event.getData();
        return match(sensorName, data.getSensorName())
                && match(sensorType, data.getSensorType())
                && match(channel, data.getChannel());
    }

    private boolean match(String condition, String value) {
        if (null == condition) return true;
        if (null == value) return false;
        return value.matches(condition);
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}