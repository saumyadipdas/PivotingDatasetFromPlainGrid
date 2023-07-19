package PivotTry;

import java.util.List;

public class Node {

	private String id; //Values will be concatenated with depth!
	private String hierarchyLevel;
	private DataFields datafields;
	
	List<Node> children;

	
	public Node(String id, String hierarchyLevel, DataFields datafields, List<Node> children) {
		super();
		this.id = id;
		this.hierarchyLevel = hierarchyLevel;
		this.datafields = datafields;
		this.children = children;
	}

	
	
	
	
//	public Node(String id, String value, String hierarchyLevel, String netMTM, String tranCount,
//			List<Node> children) {
//		//super();
//		this.id = id;
//		this.value = value;
//		this.hierarchyLevel = hierarchyLevel;
//		this.netMTM = netMTM;
//		this.tranCount = tranCount;
//		this.children = children;
//	}

	
//	public Node addChildrenNode(Node parentNode, String id, String value, String hierarchyLevel, String netMTM, String tranCount) {
//		Node childNode = new Node(id, value, hierarchyLevel, netMTM, tranCount, null);
//		List<Node> childs = parentNode.getChildren();
//		childs.add(childNode);
//		parentNode.setChildren(childs);//Setting up the children Nodes!
//		return childNode;
//	}


	


	/*** Important!!! Or else GroupingBy result is erroneous ***/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((datafields == null) ? 0 : datafields.hashCode());
		result = prime * result + ((hierarchyLevel == null) ? 0 : hierarchyLevel.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (datafields == null) {
			if (other.datafields != null)
				return false;
		} else if (!datafields.equals(other.datafields))
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
		return true;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", hierarchyLevel=" + hierarchyLevel + ", datafields=" + datafields + ", children="
				+ children + "]";
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHierarchyLevel() {
		return hierarchyLevel;
	}

	public void setHierarchyLevel(String hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
	}

	public DataFields getDatafields() {
		return datafields;
	}

	public void setDatafields(DataFields datafields) {
		this.datafields = datafields;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	
	
	
	
	
	
	
}
