
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String name;
   private int year;
   private int selling_price;
   private int km_driven;
   private String fuel;
   private String seller_type;
   private String transmission;
   private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }

    public int getKm_driven() {
        return km_driven;
    }

    public void setKm_driven(int km_driven) {
        this.km_driven = km_driven;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getSeller_type() {
        return seller_type;
    }

    public void setSeller_type(String seller_type) {
        this.seller_type = seller_type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public int compareTo(Dados outro) {
        return this.getName().compareTo(outro.getName());    }
    
    @Override
    public String toString(){
        return getName()+ " : " + getName() ;
    }// fim toString
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return name.equals(dados.name);
    }

}
