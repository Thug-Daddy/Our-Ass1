import java.util.List;

import interfaces.Tree;
import interfaces.TreeArithmetic;
import interfaces.TreeProperties;
import interfaces.TreeTraversals;
import simpletree.SimpleTree;


/**
 * @author put your unikey here
 * @author and your partner's unikey, if working in a pair
 * 
 * This class, MyTree, should be your solution to the assignment
 * It should remain in the (default package)
 * 
 * Implement as many of the required methods as you can.
 */

public class MyTreeUnimplemented<E extends Comparable<E>> extends SimpleTree<E> implements
				TreeTraversals<E>,      //PART 1
				TreeProperties,         //PART 2
				Comparable<Tree<E>>,    //PART 3 (only if enrolled in INFO1105)
				TreeArithmetic          //PART 4
{

	//constructor
	public MyTree() {
		super(); //call the constructor of SimpleTree with no arguments
	}

	@Override
	public int compareTo(Tree<E> other) {
		//TODO: implement this method if enrolled in INFO1105
		// compare the tree with another tree
		// check the structure and values of the trees:
		// a) Check the positions left-to-right, top to bottom (i.e. root, then depth 1, then depth 2, etc.)
		// b) If this tree has a position that the other tree does not, return 1.
		// c) If the other tree has a position that this one does not, return -1.
		// d) If the position is in both trees, then compare the values (return if the difference is not 0)
		return 0;
	}

	@Override
	public boolean isArithmetic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double evaluateArithmetic() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getArithmeticString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height(int maxDepth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numLeaves() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numLeaves(int depth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numPositions(int depth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProperBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCompleteBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBalancedBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHeap(boolean min) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBinarySearchTree() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<E> preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> inOrder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
