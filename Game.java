import java.util.Scanner;
public class Game{
  public String name;
  public String status;
  public int alter;
  Scanner eingabewert = new Scanner(System.in);
  
  public Game(){
    name = "Peter";
    status = "Erzähler";
    alter = 20;
    System.out.println("Willkommen auf der Burg GGZell. Ich " + name + " bin ihr " + status);
  System.out.println("Bitte gib Deinen Namen ein:");
  String nameNeu =eingabewert.nextLine();
  System.out.println("Hallo " + nameNeu );
  }

    // Rückgabe des Namen der Figur
    public String getName() { return name;   
}
}