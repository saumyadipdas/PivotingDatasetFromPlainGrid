package PivotTry;

public class DataFields {

	private String value;
	private String netMTM;
	private String tranCount;
	
	
	

	public DataFields(String value, String netMTM, String tranCount) {
		super();
		this.value = value;
		this.netMTM = netMTM;
		this.tranCount = tranCount;
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((netMTM == null) ? 0 : netMTM.hashCode());
		result = prime * result + ((tranCount == null) ? 0 : tranCount.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataFields other = (DataFields) obj;
		if (netMTM == null) {
			if (other.netMTM != null)
				return false;
		} else if (!netMTM.equals(other.netMTM))
			return false;
		if (tranCount == null) {
			if (other.tranCount != null)
				return false;
		} else if (!tranCount.equals(other.tranCount))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "DataFields [value=" + value + ", netMTM=" + netMTM + ", tranCount=" + tranCount + "]";
	}


	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getNetMTM() {
		return netMTM;
	}

	public void setNetMTM(String netMTM) {
		this.netMTM = netMTM;
	}

	public String getTranCount() {
		return tranCount;
	}

	public void setTranCount(String tranCount) {
		this.tranCount = tranCount;
	}
	
	
	
	
	
	
}
