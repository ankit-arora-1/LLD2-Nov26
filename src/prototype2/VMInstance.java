package prototype2;

import java.util.ArrayList;
import java.util.List;

public class VMInstance implements Prototype<VMInstance> {
    private String os;
    private String url;
    private String ip;
    private List<String> resources;

    public VMInstance() {
        this.resources = new ArrayList<>();
    }

    // Copy constructor used by copy()
    public VMInstance(VMInstance vmInstance) {
        this.os = vmInstance.os;
        this.url = vmInstance.url;
        this.ip = vmInstance.ip;
        // Deep copy the list so the clone and the prototype don't share it
        this.resources = new ArrayList<>(vmInstance.resources);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = new ArrayList<>(resources);
    }

    public void addResource(String resource) {
        this.resources.add(resource);
    }

    @Override
    public VMInstance copy() {
        return new VMInstance(this);
    }

    @Override
    public String toString() {
        return "VMInstance{os='" + os + "', url='" + url + "', ip='" + ip + "', resources=" + resources + "}";
    }
}
