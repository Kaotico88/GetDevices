package bo.tigo.mob.k8s.getdevices.dto.core;

import java.util.List;

public class Data {

	private List<DevicesList> devicesList;

	public List<DevicesList> getDevicesList() {
		return devicesList;
	}

	public void setDevicesList(List<DevicesList> devicesList) {
		this.devicesList = devicesList;
	}

	@Override
	public String toString() {
		return "Data [\n" + 
					"\tdevicesList=" + devicesList + " \n" +
					"]";
	}
	
}
