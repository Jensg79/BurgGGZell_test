public class Game{
  public String name;
  public String status;
  public int alter;
  public Game(){
    name = "Peter";
    status = "Erzähler";
    alter = 20;
    System.out.println("Willkommen in der Burg GGZell. Ich " + name + " bin ihr " + status);
  
  }

    // Method 1 - Getter
    public String getName() { return name;   
}
}