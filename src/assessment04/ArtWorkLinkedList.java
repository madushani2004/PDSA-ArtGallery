
package assessment04;

import java.util.Scanner;

class ArtworkNode {
    String title;
    String artist;
    double price;
    String description;
    String imagePath; // File path or URL of the artwork image

    ArtworkNode next; // Reference to the next node in the linked list

    public ArtworkNode(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.description = description;
        this.imagePath = imagePath;
        this.next = null; // Initially, there is no next node
    }
}

public class ArtWorkLinkedList {
    private ArtworkNode head;

    public void addArtwork(String title, String artist, double price) {
        ArtworkNode newNode = new ArtworkNode(title, artist, price);
        if (head == null) {
            head = newNode;
        } else {
            ArtworkNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
     public void displayArtworks() {
        ArtworkNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Artist: " + current.artist);
            System.out.println("Price: " + current.price);
            System.out.println();
            current = current.next;
        }
    }
}
