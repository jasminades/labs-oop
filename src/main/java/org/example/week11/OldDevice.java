package org.example.week11;


public interface OldDevice {
    void operateOldFunction();
}


public interface NewDevice {
    void operateNewFunction();
}


public class OldDeviceImpl implements OldDevice {
    @Override
    public void operateOldFunction() {
        System.out.println("Old device is operating old function...");
    }
}


public class NewDeviceImpl implements NewDevice {
    @Override
    public void operateNewFunction() {
        System.out.println("New device is operating new function...");
    }
}


public class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {

        oldDevice.operateOldFunction();
        System.out.println("Adapter translating old function to new function...");
    }
}


public class Main {
    public static void main(String[] args) {

        OldDevice oldDevice = new OldDeviceImpl();

        NewDevice newDevice = new DeviceAdapter(oldDevice);
        newDevice.operateNewFunction();
    }
}
