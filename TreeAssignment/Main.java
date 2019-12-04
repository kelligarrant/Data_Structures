public class Main
{
   	public static void main(String[] args) throws Exception
	{
	    Huffman huff = new Huffman();		

	    List nodes = new ArrayList();
	    huff.populateNodesFromFile("tree.txt", nodes);
	    System.out.println(nodes);
					
	    // build a huffman tree from the list of nodes...
	    Tree root = huff.buildTreeFromNodes(nodes);
			
	    // print the tree...
            huff.printTree(root);
   
            String z = huff.getCode(root, 'X');
            System.out.println(z);					
		
            String c = huff.getCode(root, 'D');
            System.out.println(c);					

            String code = "1111100";
            System.out.printf(code + " decoded as: ");					
            System.out.println(huff.decode(root, code));		
    }
}