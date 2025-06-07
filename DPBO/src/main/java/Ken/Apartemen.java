package Ken;

public class Apartemen {
    protected int id;
    protected String name;
    protected String location;
    protected boolean availability;

    public Apartemen(int id, String name, String location, boolean availability) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.availability = availability;
    }

    public void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Lokasi: " + location);
        System.out.println("Tersedia: " + availability);
    }
}
