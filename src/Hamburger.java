public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;

        if(name == "Deluxe"){
        }
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.price += addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.price += addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.price += addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.price += addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    public double itemizeHamburger(){
        return this.price;
    }
}
