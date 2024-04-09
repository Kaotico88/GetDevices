package bo.tigo.mob.k8s.getdevices.dto.core;

public class Stock {

	private String stockId;
	
	private String name;
	
	private String stockType;

	
	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	@Override
	public String toString() {
		return "Stock [\n" + 
				"\tstockId=" + stockId + ", \n" + 
				"\tname=" + name + ", \n" +
				"\tstockType=" + stockType + " \n" + 
				"]";
	}

}
