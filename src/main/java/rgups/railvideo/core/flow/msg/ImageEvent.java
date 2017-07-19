package rgups.railvideo.core.flow.msg;

import org.opencv.core.Mat;

import java.util.EventObject;

/**
 * Created by Dmitry on 29.05.2017.
 */
public class ImageEvent extends EventObject {

    Mat img;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ImageEvent(Object source) {
        super(source);
    }
}