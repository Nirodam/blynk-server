package cc.blynk.server.core.model.widgets.ui;

import cc.blynk.server.core.model.enums.PinType;
import cc.blynk.server.core.model.widgets.Widget;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 07.02.16.
 */
public class Menu extends Widget {

    public Tab[] tabs;

    @Override
    public void updateIfSame(byte pin, PinType type, String[] values) {

    }

    @Override
    public boolean isSame(byte pin, PinType type) {
        return false;
    }

    @Override
    public String getValue(byte pin, PinType type) {
        return null;
    }

    @Override
    public String getJsonValue() {
        return null;
    }

    @Override
    public String makeHardwareBody() {
        return null;
    }

    @Override
    public String getModeType() {
        return null;
    }

    private class Tab {

        public String label;

    }
}
