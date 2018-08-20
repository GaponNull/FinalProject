package ua.training.model.bundleUtil;

import java.util.ResourceBundle;

public class PathsResourceBundle implements ResourceManager {

    ResourceBundle resourceBundle;

    public PathsResourceBundle() {
        resourceBundle = ResourceBundle.getBundle("paths");
    }

    @Override
    public String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
