package PivotTry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PivotTry {

	
	public static void main(String[] args) {
		
		List<NetMTMScannerTable> tableDataPlainList =  constructDemoData();
		System.out.println("------------------------------------");
		System.out.println(tableDataPlainList);
		System.out.println("------------------------------------");
		
		System.out.println("-------------- 1 -----------------");
		Map<String, List<NetMTMScannerTable>> groupByAssetClassMap = tableDataPlainList.stream().collect(Collectors.groupingBy(NetMTMScannerTable::getNettingGroup2));
		System.out.println(groupByAssetClassMap);
		
		System.out.println("-------------- 2 -----------------");
		Map<String, Map<String, Map<String, List<NetMTMScannerTable>>>> multipleGroupByMap = tableDataPlainList.stream()
				.collect(Collectors.groupingBy(NetMTMScannerTable::getNettingGroup2,
						Collectors.groupingBy(NetMTMScannerTable::getNettingGroup3,
								Collectors.groupingBy(NetMTMScannerTable::getNettingGroup4))));
		System.out.println(multipleGroupByMap);

		System.out.println("-------------- 3 -----------------");
		Map<String, Map<String, Map<String, List<Node>>>> multipleGroupByWithHawkEyeNode = tableDataPlainList.stream()
				.collect(Collectors.groupingBy(NetMTMScannerTable::getNettingGroup2,
						Collectors.groupingBy(NetMTMScannerTable::getNettingGroup3,
								Collectors.groupingBy(NetMTMScannerTable::getNettingGroup4,
										Collectors.mapping(a-> new Node(a.getNettingGroup2()+"_"+a.getNettingGroup3()+"_"+a.getNettingGroup4()+"_"+a.getSaccrTypology(), a.getSaccrTypology(), "3", 
												a.getNetMTM(), a.getTransactionCount(), null)
											, Collectors.toList())
										))));
		System.out.println(multipleGroupByWithHawkEyeNode);
		System.out.println("~~~~~~~~~~~~~~");
		multipleGroupByWithHawkEyeNode.keySet().stream().forEach(e->System.out.println(e)); //Interest Rate, Commodity
		System.out.println("~~~~~~~~~~~~~~");
		multipleGroupByWithHawkEyeNode.get("Interest Rate").keySet().stream().forEach(e->System.out.println(e)); //Interest Rate, Commodity
		multipleGroupByWithHawkEyeNode.get("Commodity").keySet().stream().forEach(e->System.out.println(e)); //Interest Rate, Commodity
		System.out.println("~~~~~~~~~~~~~~");
		multipleGroupByWithHawkEyeNode.get("Commodity").get("Agriculture").keySet().stream().forEach(e->System.out.println(e));
		multipleGroupByWithHawkEyeNode.get("Commodity").get("Metals").keySet().stream().forEach(e->System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~");
		multipleGroupByWithHawkEyeNode.get("Commodity").get("Agriculture").entrySet().stream().forEach(e->System.out.println(e));
		multipleGroupByWithHawkEyeNode.get("Commodity").get("Metals").entrySet().stream().forEach(e->System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~");
		
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		Map<Integer, String> veh = new HashMap<Integer, String>();
		veh.put(1, "A"); veh.put(2, "B");veh.put(3, "C");veh.put(4, "D");
		System.out.println(veh); //{1=A, 2=B, 3=C, 4=D}
		
	}

	
	
	
	
	private static List<NetMTMScannerTable> constructDemoData() {
		List<NetMTMScannerTable> rawData = new ArrayList<>();
		
		NetMTMScannerTable c1 = new NetMTMScannerTable ("Commodity", "Agriculture", "Cattle", "COM Future", "10", "1");
		NetMTMScannerTable c2 = new NetMTMScannerTable ("Commodity", "Agriculture", "Cocoa", "COM Future", "20", "2");
		NetMTMScannerTable c3 = new NetMTMScannerTable ("Commodity", "Metals", "Copper", "COM Future", "30", "3");
		NetMTMScannerTable c4 = new NetMTMScannerTable ("Commodity", "Metals", "Copper", "COM Option on Future", "40", "4");
		NetMTMScannerTable c5 = new NetMTMScannerTable ("Commodity", "Metals", "Copper", "COM Future", "50", "5");
		NetMTMScannerTable ir1 = new NetMTMScannerTable ("Interest Rate", "Basis_AUD BBSW 3M", "Inf", "IRS Vanilla", "60", "6");
		
		rawData.add(c1);rawData.add(c2);rawData.add(c3);rawData.add(c4);rawData.add(c5);rawData.add(ir1);
		return rawData;
	}
	
	
	
}
