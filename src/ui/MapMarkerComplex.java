package ui;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.MapMarkerCircle;
import org.openstreetmap.gui.jmapviewer.Style;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MapMarkerComplex extends MapMarkerCircle {
    public static final double defaultMarkerSize = 7.0;
   //public static final Color defaultColor = Color.red;
    private String text;
    private String url;
    public MapMarkerComplex(Layer layer, String name, Coordinate coord, Color color, String text, String url) {
                super(layer, name, coord, defaultMarkerSize, STYLE.FIXED,
                getDefaultStyle());
        setColor(color.darker());
        setBackColor(color);
        this.text=text;
        this.url=url;
    }


    public String getText() {
        return text;
    }
    public String getUrl(){
        return url;

}

}
