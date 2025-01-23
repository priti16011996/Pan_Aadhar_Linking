import java.util.*;
public class PanAadhaarMatcherApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AadhaarCardService AadhaarCardService =new AadhaarCardService();
        PanCardService PanCardService = new PanCardService();

        System.out.println("Enter aadhaar card number : ");
        String AdhaarNumber= sc.nextLine();

        AadhaarCard aadhaarCard = AadhaarCardService.getbyAadharNumber(AdhaarNumber);
        PanCard panCard = PanCardService.getByAAdhaarNumber(AdhaarNumber);

        if(aadhaarCard != null && panCard != null)
        {
            System.out.println("Aadhaar card Details of User :"+aadhaarCard);
            System.out.println("Pan card Details of User :"+panCard);
        }
        else
        {
            System.out.println("Details not found");
        }
    }
}
