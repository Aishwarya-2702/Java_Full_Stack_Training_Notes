class node
{
    int data;
    node left, right;
    
    node(int n)  // 1
    {
        data = n;  // data = 1
        right = null;
        left = null;
    }
}
class BST
{
    node root;
    
    public BST()
    {
        root = null;
    }
    public void insert(int d) // d - 3
    {
        root = insertnode(root,d);  // root - 15 , d - 3
    }
    public node insertnode(node root, int d) //root - null , d - 5
    {
        if(root != null)
        {
            if(d<root.data) // d    (3) < r.data(5)
            {
                root.left = insertnode(root.left,d);  // root- null , d -  2
            }
            else if(d>root.data)
            {
                root.right = insertnode(root.right,d);
            }
            return root;
        }
        
        else
        {
            node t = new node(d);
            return t;
        }
    }
    public void delete(int d)
    {
        root = deletenode(root,d);
    }
    public node deletenode(node root, int d)
    {
        if(root == null)
        {
            return null;
        }
        else
        {
            if(d<root.data) // d    (3) < data(5)
            {
                root.left = deletenode(root.left,d);  // root- null , d -  2
            }
            else if(d>root.data)
            {
                root.right = deletenode(root.right,d);
            }
            else
            { // for a parent has single child
                if(root.left == null)
                {
                    return root.right;
                }
                else if(root.right==null)
                {
                    return root.left;
                }
                
                root.data = findmin(root.left);
                
                root.left = deletenode(root.left,root.data);
            }
            return root;
        }
    }
    public int findmin(node root)
    {
        int min = root.data;
        while(root.left == null)
        {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    public void in()
    {
        inorder(root);
    }
    public void inorder(node root)
    {
        if(!(root==null))
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
        
        
}

public class BinarySearchTree
{
    public static void main(String arg[])
    {
        BST b = new BST();
        
        b.insert(5);
        b.insert(3);
        b.insert(6);
        b.insert(4);
        
        System.out.printf("Inorder Traverse\n");
        b.in();
        b.delete(3);
        System.out.printf("\n");
        b.in();
    }
}
