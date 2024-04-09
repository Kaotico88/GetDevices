package bo.tigo.mob.k8s.getdevices.dto.core;

public class DevicesList {
	
	private String id;
	
	private String sku;
	
	private String identifier;
	
	private String serialNumber;
	
	private String lifecycleStatus;
	
	private String primaryId;
	
	private String category;
	
	private Stock stock;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLifecycleStatus() {
		return lifecycleStatus;
	}

	public void setLifecycleStatus(String lifecycleStatus) {
		this.lifecycleStatus = lifecycleStatus;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "DevicesList [\n" + 
						"\tid=" + id + ", \n" + 
						"\tsku=" + sku + ", \n" + 
						"\tidentifier=" + identifier + ", \n" + 
						"\tserialNumber=" + serialNumber + ", \n" + 
						"\tlifecycleStatus=" + lifecycleStatus + ", \n" + 
						"\tprimaryId=" + primaryId + ", \n" + 
						"\tcategory=" + category + ", \n" + 
						"\tstock=" + stock + " \n" + 
						"]";
	}
	
	
}
