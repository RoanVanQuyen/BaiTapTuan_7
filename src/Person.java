public abstract class Person implements Displayable{
    protected   static int ID ;
    protected int id ;
    protected   String name ;

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Person.ID = ID;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){}

    public Person( String name) {
        id = ID ;
        ID++;
        this.name = name;
    }
}
