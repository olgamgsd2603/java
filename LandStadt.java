package HA1;

public class LandStadt {
    public static void main(String[] args) {

        Germany germany = new Germany();
        System.out.println(germany);

        Berlin berlin = new Berlin();
        System.out.println(berlin);

        Potsdam potsdam = new Potsdam();
        System.out.println(potsdam);

        Munich munich = new Munich();
        System.out.println(munich);

    }
}

class Side {
    String name;

    public Side(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is located in the ";
    }
}

class Germany {
    private String name = "German";



    @Override
    public String toString() {
        return getClass().getSimpleName() + " is located in the west of Europe. ";
    }
}

// Brandenburg
class Brandenburg extends Germany {
    private String name = "Brandenburg";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

// Brandenburg
class Berlin extends Brandenburg implements Location{
    private String name = "Berlin";

    private Side side = new Side(name);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void local() {
        System.out.println(name + " is located in the north");
    }

    public String toString() {
        return side + "north of Germany";
    }
}

// Brandenburg
class Potsdam extends Brandenburg implements Location{
    private String name = "Potsdam";
    private Side side = new Side(name);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void local() {
        System.out.println(name + " is located in the north");
    }

    public String toString() {
        return side + "north of Germany";
    }
}


// Saxony
class Bavaria extends Germany {
    private String name = "Saxony";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Saxony
class Munich extends Bavaria implements Location {
    private String name = "Munich";
    private Side side = new Side(name);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void local() {
        System.out.println(name + " is located in the south");
    }

    public String toString() {
        return side + "south of Germany";
    }
}

// Location
interface Location {
    void local();
}
