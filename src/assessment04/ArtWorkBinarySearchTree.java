
package assessment04;
class ArtworkSet {
    String artistName;
    String title;
    double price;
    String imagePath;
    String description;

    // Constructor
    public ArtworkSet(String artistName, String title, double price, String imagePath, String description) {
        this.artistName = artistName;
        this.title = title;
        this.price = price;
        this.imagePath = imagePath;
        this.description = description;
    }

    // Getters
    public String getArtistName() {
        return artistName;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Node {
    ArtworkSet artwork;
    double commissionAmount;
    double newPrice;
    Node left, right;

    public Node(ArtworkSet artwork, double commissionAmount, double newPrice) {
        this.artwork = artwork;
        this.commissionAmount = commissionAmount;
        this.newPrice = newPrice;
        left = right = null;
    }
}

public class ArtWorkBinarySearchTree {
    Node root;

    // Constructor
    public ArtWorkBinarySearchTree() {
        root = null;
    }

    // Insert a new artwork with commission amount and new price
    public void insert(ArtworkSet artwork, double commission) {
        double commissionAmount = commission;
        double newPrice = artwork.price + commissionAmount;
        root = insertRec(root, artwork, commissionAmount, newPrice);
    }

    private Node insertRec(Node root, ArtworkSet artwork, double commissionAmount, double newPrice) {
        if (root == null) {
            root = new Node(artwork, commissionAmount, newPrice);
            return root;
        }

        if (newPrice < root.newPrice)
            root.left = insertRec(root.left, artwork, commissionAmount, newPrice);
        else if (newPrice > root.newPrice)
            root.right = insertRec(root.right, artwork, commissionAmount, newPrice);

        return root;
    }

    // Remove an artwork from the tree
    public Node deleteNode(Node root, double key) {
        if (root == null) return root;

        if (key < root.newPrice)
            root.left = deleteNode(root.left, key);
        else if (key > root.newPrice)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.newPrice = minValue(root.right);
            root.right = deleteNode(root.right, root.newPrice);
        }
        return root;
    }

    private double minValue(Node root) {
        double minv = root.newPrice;
        while (root.left != null) {
            minv = root.left.newPrice;
            root = root.left;
        }
        return minv;
    }

    
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println("Artist: " + root.artwork.getArtistName());
            System.out.println("Title: " + root.artwork.getTitle());
            System.out.println("Price: " + root.artwork.getPrice());
            System.out.println("Commission Amount: " + root.commissionAmount);
            System.out.println("New Price: " + root.newPrice);
            System.out.println("Image Path: " + root.artwork.getImagePath());
            System.out.println("Description: " + root.artwork.getDescription());
            System.out.println();
            inOrderTraversal(root.right);
        }
    }
}
