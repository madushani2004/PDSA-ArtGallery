
package assessment04;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
    ArtworkNode head;
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
        JOptionPane.showMessageDialog(null,"Artwork added successfully.","Successfull!" ,JOptionPane.INFORMATION_MESSAGE);
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
     // Update artwork based on the title
   public void updateArtworkDetails(String title, String newTitle, String newArtist, double newPrice, String newDescription, String newImagePath) {
        ArtworkNode artwork = searchArtworkByTitle(title);
        if (artwork != null) {
            // Update the artwork details
            artwork.title = newTitle;
            artwork.artist = newArtist;
            artwork.price = newPrice;
            artwork.description = newDescription;
            artwork.imagePath = newImagePath;
            JOptionPane.showMessageDialog(null, "Artwork with title '" + title + "' updated successfully.","Successful!!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Artwork with title '" + title + "' not found.","Not Found", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void removeArtwork(String title) {
        ArtworkNode current = head;

        while (current != null) {
            if (current.title.equals(title)) {
                
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                JOptionPane.showMessageDialog(null, "Artwork with title '" + title + "' removed successfully.","Successful!!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            current = current.next;
        }
           JOptionPane.showMessageDialog(null,"Artwork with title '" + title + "' not found.","Not Found", JOptionPane.INFORMATION_MESSAGE);
    }
    public void removeAll() {
        while (head != null) {
            ArtworkNode temp = head;
            head = head.next;
            temp.prev = null;
            temp.next = null;
        }
        tail = null;
    }

}
