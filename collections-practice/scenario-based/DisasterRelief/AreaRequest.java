import java.util.Map;

public class AreaRequest {
    private String areaName;
    private Map<String, Integer> requestedResources;

    public AreaRequest(String areaName, Map<String, Integer> requestedResources) {
        this.areaName = areaName;
        this.requestedResources = requestedResources;
    }

    public String getAreaName() {
        return areaName;
    }

    public Map<String, Integer> getRequestedResources() {
        return requestedResources;
    }
}
