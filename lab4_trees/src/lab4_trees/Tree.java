package lab4_trees;

public class Tree {
	Node root;
	
	public Node find(int emp) {
		Node cur = root;
		
		while(cur.empNumber != emp) {
			if(emp < cur.empNumber) {
				cur = cur.leftNode;
			} else {
				cur = cur.rightNode;
			}
			
			if(cur == null) {
				return null;
			}
		}
		
		return cur;
	}
	
	public void insert(int emp, String name) {
		Node newNode = new Node(emp ,name);
		
		if(root == null) {
			root = newNode;
		} else {
			Node cur = root;
			Node parent;
			
			while(true) {
				parent = cur;
				if(emp < cur.empNumber) {
					cur = cur.leftNode;
					if(cur == null) {
						parent.leftNode = newNode;
						return;
					}
				} else {
					cur = cur.rightNode;
					if(cur == null) {
						parent.rightNode = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Node cur) {
		
		if(cur != null) {
			inOrderTraversal(cur.leftNode);
			cur.displayNode();
			inOrderTraversal(cur.rightNode);
		}
	}
	
	public void inOrder() {
        inOrderTraversal(root);
    }
	
	public void preOrderTraversal(Node cur) {
		
		if(cur != null) {
			cur.displayNode();
			preOrderTraversal(cur.leftNode);
			preOrderTraversal(cur.rightNode);
		}
	}

	public void preOrder() {
        preOrderTraversal(root);
    }
	
	public void postOrderTraversal(Node cur) {
		
		if(cur != null) {
			postOrderTraversal(cur.leftNode);
			postOrderTraversal(cur.rightNode);
			cur.displayNode();
		}
	}
	
	public void postOrder() {
        postOrderTraversal(root);
    }
	
	public Node findRecursive(Node localRoot, int empno) {
		
		if(localRoot == null) {
			return null;
		} else if(localRoot.empNumber == empno) {
			System.out.println(localRoot.empName);
			return localRoot;
		} else if(empno < localRoot.empNumber) {
			return findRecursive(localRoot.leftNode, empno);
		} else {
			return findRecursive(localRoot.rightNode, empno);
		}
	}
	
	public Node callRecursive(int empno) {
		return findRecursive(root, empno);
	}
	
	public void deleteAll( ) {
		root = null;
	}
}
