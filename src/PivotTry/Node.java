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
		//super();
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


	


	/*** Important!!! Or else GroupingBy result is erroneous ***/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((hierarchyLevel == null) ? 0 : hierarchyLevel.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Node other = (Node) obj;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (hierarchyLevel == null) {
			if (other.hierarchyLevel != null)
				return false;
		} else if (!hierarchyLevel.equals(other.hierarchyLevel))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
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
		return "Node [id=" + id + ", value=" + value + ", hierarchyLevel=" + hierarchyLevel + ", netMTM="
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
