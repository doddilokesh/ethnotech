class Node {
    String post;
    Node prev,next;
    Node(String post){
        this.post=post;
        prev=next=null;
    } 
}
class Socialmediapost{
    Node head,current;
    void insertPost(String post){
        Node newnode=new Node(post);
        if(head==null){
            head=newnode;
            current=head;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    void deletePost(String post){
        Node temp=head;
        while (temp != null && !temp.post.equals(post)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Post not found!");
            return;
        }
        if (temp == head) {
            head = temp.next;
            if (head != null)
                head.prev = null;
        } else {
            temp.prev.next = temp.next;

            if (temp.next != null)
                temp.next.prev = temp.prev;
        }
        System.out.println("Deleted: " + post);
    }
    void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Current Post: " + current.post);
        } else {
            System.out.println("No next post.");
        }
    }
    void previousPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current Post: " + current.post);
        } else {
            System.out.println("No previous post.");
        }
    }
    void displayFeed() {
        Node temp = head;
        System.out.println("\nFeed:");
        while (temp != null) {
            System.out.println(temp.post);
            temp = temp.next;
        }
    }
}
public class SocialMediaDemo {
    public static void main(String[] args) {
        Socialmediapost feed = new Socialmediapost();
        feed.insertPost("Post 1: Good Morning");
        feed.insertPost("Post 2: Java Programming");
        feed.insertPost("Sponsored Post: Buy a Laptop");
        feed.insertPost("Post 3: Doubly Linked List");
        feed.displayFeed();
        System.out.println("\nNavigation:");
        feed.nextPost();
        feed.nextPost();
        feed.previousPost();
        System.out.println("\nDeleting Sponsored Post...");
        feed.deletePost("Sponsored Post: Buy a Laptop");
        feed.displayFeed();
    }
}

