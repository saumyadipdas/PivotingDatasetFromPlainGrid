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
