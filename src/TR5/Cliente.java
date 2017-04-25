
package TR5;


public class Cliente extends DomainObject {
    
    private String Name;
    private String lastName;
    private String Phone;
    private String Street1;
    private String Street2;
    private String City;
    private String State;
    private String ZipCode;
    private String Country;    

    public Cliente(String Name, String lastName,String id) {
        super(id);
        this.Name=Name;
        this.lastName=lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String Street1) {
        this.Street1 = Street1;
    }

    public String getStreet2() {
        return Street2;
    }

    public void setStreet2(String Street2) {
        this.Street2 = Street2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    
    
    
    
    
    
}
