package PivotTry;

import java.util.List;

public class Node {

	private String id; //Values will be concatenated with depth!
	private String value;
	private String hierarchyLevel;
	private String netMTM;
	private String tranCount;
	
	List<Node> children;

	
	
	
	
	public Node(String id, String value, String hierarchyLevel, String netMTM, String tranCount,
			List<Node> children) {
		super();
		this.id = id;
		this.value = value;
		this.hierarchyLevel = hierarchyLevel;
		this.netMTM = netMTM;
		this.tranCount = tranCount;
		this.children = children;
	}

	
	public Node addChildrenNode(Node parentNode, String id, String value, String hierarchyLevel, String netMTM, String tranCount) {
		Node childNode = new Node(id, value, hierarchyLevel, netMTM, tranCount, null);
		List<Node> childs = parentNode.getChildren();
		childs.add(childNode);
		parentNode.setChildren(childs);//Setting up the children Nodes!
		return childNode;
	}


	


	@Override
	public String toString() {
		return "HawkeyeNode [id=" + id + ", value=" + value + ", hierarchyLevel=" + hierarchyLevel + ", netMTM="
				+ netMTM + ", tranCount=" + tranCount + ", children=" + children + "]";
	}








	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getValue() {
		return value;
	}





	public void setValue(String value) {
		this.value = value;
	}





	public String getHierarchyLevel() {
		return hierarchyLevel;
	}





	public void setHierarchyLevel(String hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
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





	public List<Node> getChildren() {
		return children;
	}





	public void setChildren(List<Node> children) {
		this.children = children;
	}
	
	
	
	
	
	
}
