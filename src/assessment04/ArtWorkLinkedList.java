
package assessment04;

import java.util.Scanner;

class ArtworkNode {
    String title;
    String artist;
    double price;
    String description;
    String imagePath; // File path or URL of the artwork image
    
    ArtworkNode prev; 
    ArtworkNode next; 

    public ArtworkNode(String title, String artist, double price,String description,String path) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.description = description;
        this.imagePath = path;
        this.prev = null;
        this.next = null;
    }
}

public class ArtWorkLinkedList {
    private ArtworkNode head;
    private ArtworkNode tail;

    public void addArtwork(String title, String artist, double price,String description,String path) {
        ArtworkNode newNode = new ArtworkNode(title, artist, price,description,path);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
     public void displayArtworks() {
        ArtworkNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Artist: " + current.artist);
            System.out.println("Price: " + current.price);
            System.out.println("Artist: " + current.description);
            System.out.println("Price: " + current.imagePath);
            System.out.println();
            current = current.next;
        }
    }
     
    public ArtworkNode searchArtworkByTitle(String title) {
        ArtworkNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                return current; // Return the node if title matches
            }
            current = current.next;
        }
        
        return null; // Return null if artwork with the specified title is not found
    }
}
