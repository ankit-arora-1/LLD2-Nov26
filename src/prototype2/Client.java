package prototype2;

public class Client {
    public VMInstance createCopy(VMInstance vmInstance) {
        return vmInstance.copy();
    }


    public static void main(String[] args) {
        VMInstanceRegistry vmInstanceRegistry = new VMInstanceRegistry();

        VMInstance linux = new VMInstance();
        linux.setOs("linux");
        linux.addResource("2 vCPU");
        linux.addResource("4GB RAM");
        vmInstanceRegistry.set("linux", linux);

        VMInstance windows = new VMInstance();
        windows.setOs("windows");
        windows.addResource("4 vCPU");
        windows.addResource("8GB RAM");
        vmInstanceRegistry.set("windows", windows);

        VMInstance linuxVM = vmInstanceRegistry.get("linux");
        linuxVM.setIp("10.0.0.1");
        linuxVM.setUrl("vm1.example.com");
        linuxVM.addResource("100GB SSD");

        System.out.println("Copy:      " + linuxVM);
        System.out.println("Prototype: " + vmInstanceRegistry.get("linux"));
    }
}
