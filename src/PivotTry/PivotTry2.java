package PivotTry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PivotTry2 {

	
	public static void main(String[] args) {
		List<NetMTMScannerTable> tableDataPlainList =  constructDemoData();
		System.out.println("-------------- 3 -----------------");
		Map<Node, Map<Node, Map<Node, List<Node>>>> multipleGroupByWithHawkEyeNode = tableDataPlainList.stream()
				.collect(Collectors.groupingBy((a-> new Node(a.getNettingGroup2(), a.getNettingGroup2(), "0", null, null, null)),
						Collectors.groupingBy((a-> new Node(a.getNettingGroup2()+"_"+a.getNettingGroup3(), a.getNettingGroup3(), "1", null, null, null)),
								Collectors.groupingBy((a-> new Node(a.getNettingGroup2()+"_"+a.getNettingGroup3()+"_"+a.getNettingGroup4(), a.getNettingGroup4(), "2", null, null, null)),
										Collectors.mapping(a-> new Node(a.getNettingGroup2()+"_"+a.getNettingGroup3()+"_"+a.getNettingGroup4()+"_"+a.getSaccrTypology(), a.getSaccrTypology(), "3", 
												a.getNetMTM(), a.getTransactionCount(), null)
											, Collectors.toList())
										))));
		System.out.println(multipleGroupByWithHawkEyeNode);
//		System.out.println("~~~~~~~~~~~~~~");
//		multipleGroupByWithHawkEyeNode.keySet().stream().forEach(e->System.out.println(e)); //Interest Rate, Commodity
//		System.out.println("~~~~~~~~~~~~~~");
//		multipleGroupByWithHawkEyeNode.get("Interest Rate").keySet().stream().forEach(e->System.out.println(e)); //Interest Rate, Commodity
//		multipleGroupByWithHawkEyeNode.get("Commodity").keySet().stream().forEach(e->System.out.println(e)); //Interest Rate, Commodity
//		System.out.println("~~~~~~~~~~~~~~");
//		multipleGroupByWithHawkEyeNode.get("Commodity").get("Agriculture").keySet().stream().forEach(e->System.out.println(e));
//		multipleGroupByWithHawkEyeNode.get("Commodity").get("Metals").keySet().stream().forEach(e->System.out.println(e));
//		System.out.println("~~~~~~~~~~~~~~");
//		multipleGroupByWithHawkEyeNode.get("Commodity").get("Agriculture").entrySet().stream().forEach(e->System.out.println(e));
//		multipleGroupByWithHawkEyeNode.get("Commodity").get("Metals").entrySet().stream().forEach(e->System.out.println(e));
//		System.out.println("~~~~~~~~~~~~~~");
//		
//		System.out.println("----------------------------");
//		System.out.println("----------------------------");
//		Map<Integer, String> veh = new HashMap<Integer, String>();
//		veh.put(1, "A"); veh.put(2, "B");veh.put(3, "C");veh.put(4, "D");
//		System.out.println(veh); //{1=A, 2=B, 3=C, 4=D}
		
		System.out.println(createTree(multipleGroupByWithHawkEyeNode));
		
	}

	
	
	
	
	
	
	private static List<Node> createTree(Map<Node, Map<Node, Map<Node, List<Node>>>> multipleGroupByWithHawkEyeNode) {
		List<Node> parent = new ArrayList<>();
		
		try{

			multipleGroupByWithHawkEyeNode.forEach((rootKey, rootValue) ->
			{
				Node pNode = new Node (rootKey.getId(), rootKey.getHierarchyLevel(), rootKey.getValue(), null, null, null);

				//Fetch 2nd Level depth data
				List<Node> firstLevelChilds = rootValue.keySet().stream().collect(Collectors.toList());

				/*******************************************************************************/
				/** Later on Try on with Recursion **/
				/** Third Level depth data (For Hierarchy - 2) **/
//				firstLevelChilds.stream().forEach(nodeL1 -> {
//					
//					
//					
//					
//					
//
//					multipleGroupByWithHawkEyeNode.get(pNode).forEach((l2Key, l2Value) -> {
//						if(nodeL1.getId() .equalsIgnoreCase(l2Key.getId())) {
//							//Fetch 3rd Level depth data
//							List<Node> secondLevelChilds = l2Value.keySet().stream().collect(Collectors.toList());
//
//							/*******************************************************************************/
//							/** Later on Try on with Recursion **/
//							/** Fourth Level depth data (For Hierarchy - 3) **/
//							secondLevelChilds.stream().forEach(nodeL2 -> {
//
//								multipleGroupByWithHawkEyeNode.get(pNode).get(nodeL1).forEach((l3Key, l3Value) -> {
//									if(nodeL2.getId() .equalsIgnoreCase(l3Key.getId())) {
//										//Fetch 4th Level depth data
//										List<Node> thirdLevelChilds = l3Value.stream().collect(Collectors.toList());
//
//										/*** For Second Level childrens ******/
//										//Adding children of Second Level!
//										nodeL2.setChildren(thirdLevelChilds);
//									}
//								});
//							});
//							/*******************************************************************************/
//
//							/*** For First Level childrens ******/
//							//Adding children of First Level!
//							nodeL1.setChildren(secondLevelChilds);
//						}
//					});
//				});
				/*******************************************************************************/


				/*** For Root Level childrens ******/
				//Adding children of First Level!
				pNode.setChildren(firstLevelChilds);
				parent.add(pNode);

			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return parent;
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