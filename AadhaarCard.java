public class AadhaarCard {

    private String AadhaarCardNumber;
    private String Name;
    private String FatherName;
    private String Address;
    private String ContactNumber;

    public AadhaarCard(String aadhaarCardNumber, String name, String fatherName, String address, String contactNumber) {
        AadhaarCardNumber = aadhaarCardNumber;
        Name = name;
        FatherName = fatherName;
        Address = address;
        ContactNumber = contactNumber;
    }

    public String getAadhaarCardNumber() {
        return AadhaarCardNumber;
    }

    public void setAadhaarCardNumber(String aadhaarCardNumber) {
        AadhaarCardNumber = aadhaarCardNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "AadhaarCard{" +
                "AadhaarCardNumber='" + AadhaarCardNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", Address='" + Address + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                '}';
    }
}
