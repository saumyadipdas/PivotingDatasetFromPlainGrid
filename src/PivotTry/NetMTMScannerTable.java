package PivotTry;

public class NetMTMScannerTable {

	private String nettingGroup2;
	private String nettingGroup3;
	private String nettingGroup4;
	private String saccrTypology;
	private String netMTM;
	private String transactionCount;
	
	
	
	
	public NetMTMScannerTable(String nettingGroup2, String nettingGroup3, String nettingGroup4,
			String saccrTypology, String netMTM, String transactionCount) {
		super();
		this.nettingGroup2 = nettingGroup2;
		this.nettingGroup3 = nettingGroup3;
		this.nettingGroup4 = nettingGroup4;
		this.saccrTypology = saccrTypology;
		this.netMTM = netMTM;
		this.transactionCount = transactionCount;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	@Override
	public String toString() {
		return "CounterpartyNetMTMScannerTable [nettingGroup2=" + nettingGroup2 + ", nettingGroup3=" + nettingGroup3
				+ ", nettingGroup4=" + nettingGroup4 + ", saccrTypology=" + saccrTypology + ", netMTM=" + netMTM
				+ ", transactionCount=" + transactionCount + "] \n";
	}

//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((netMTM == null) ? 0 : netMTM.hashCode());
//		result = prime * result + ((nettingGroup2 == null) ? 0 : nettingGroup2.hashCode());
//		result = prime * result + ((nettingGroup3 == null) ? 0 : nettingGroup3.hashCode());
//		result = prime * result + ((nettingGroup4 == null) ? 0 : nettingGroup4.hashCode());
//		result = prime * result + ((saccrTypology == null) ? 0 : saccrTypology.hashCode());
//		result = prime * result + ((transactionCount == null) ? 0 : transactionCount.hashCode());
//		return result;
//	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		NetMTMScannerTable other = (NetMTMScannerTable) obj;
//		if (netMTM == null) {
//			if (other.netMTM != null)
//				return false;
//		} else if (!netMTM.equals(other.netMTM))
//			return false;
//		if (nettingGroup2 == null) {
//			if (other.nettingGroup2 != null)
//				return false;
//		} else if (!nettingGroup2.equals(other.nettingGroup2))
//			return false;
//		if (nettingGroup3 == null) {
//			if (other.nettingGroup3 != null)
//				return false;
//		} else if (!nettingGroup3.equals(other.nettingGroup3))
//			return false;
//		if (nettingGroup4 == null) {
//			if (other.nettingGroup4 != null)
//				return false;
//		} else if (!nettingGroup4.equals(other.nettingGroup4))
//			return false;
//		if (saccrTypology == null) {
//			if (other.saccrTypology != null)
//				return false;
//		} else if (!saccrTypology.equals(other.saccrTypology))
//			return false;
//		if (transactionCount == null) {
//			if (other.transactionCount != null)
//				return false;
//		} else if (!transactionCount.equals(other.transactionCount))
//			return false;
//		return true;
//	}


	public String getNettingGroup2() {
		return nettingGroup2;
	}


	public void setNettingGroup2(String nettingGroup2) {
		this.nettingGroup2 = nettingGroup2;
	}


	public String getNettingGroup3() {
		return nettingGroup3;
	}


	public void setNettingGroup3(String nettingGroup3) {
		this.nettingGroup3 = nettingGroup3;
	}


	public String getNettingGroup4() {
		return nettingGroup4;
	}


	public void setNettingGroup4(String nettingGroup4) {
		this.nettingGroup4 = nettingGroup4;
	}


	public String getSaccrTypology() {
		return saccrTypology;
	}


	public void setSaccrTypology(String saccrTypology) {
		this.saccrTypology = saccrTypology;
	}


	public String getNetMTM() {
		return netMTM;
	}


	public void setNetMTM(String netMTM) {
		this.netMTM = netMTM;
	}


	public String getTransactionCount() {
		return transactionCount;
	}


	public void setTransactionCount(String transactionCount) {
		this.transactionCount = transactionCount;
	}
	
	
	
	
	
}
