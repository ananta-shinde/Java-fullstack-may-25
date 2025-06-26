package ArrayDemos;

import java.util.Scanner;
import java.util.Vector;

class Ticket{
    int ticketNo;
    String name;
    String source;
    String dest;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNo=" + ticketNo +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }
}
public class VectorDemo {

//    int[] nums = new int[];
    public static void main(String[] args) {
        Vector<Ticket> tickets = new Vector<Ticket>();
        Scanner sc = new Scanner(System.in);

        Ticket ticket= new Ticket();
        System.out.println("enter ticket no");
        ticket.ticketNo = sc.nextInt();
        System.out.println("enter your name");
        ticket.name = sc.next();
        System.out.println("enter souce");
        ticket.source = sc.next();
        System.out.println("enter dest");
        ticket.dest = sc.next();
        tickets.addElement(ticket);

        Ticket ticket2= new Ticket();
        System.out.println("enter ticket no");
        ticket2.ticketNo = sc.nextInt();
        System.out.println("enter your name");
        ticket2.name = sc.next();
        System.out.println("enter souce");
        ticket2.source = sc.next();
        System.out.println("enter dest");
        ticket2.dest = sc.next();
        tickets.addElement(ticket2);

//       for(int i=0;i<tickets.size();i++){
//           System.out.println(tickets.get(i));
//       }

       tickets.forEach(t->{
           System.out.println(t);
       });











    }
}
