
import java.util.HashMap;
import java.util.Map;

public class AadhaarCardService {

    private static Map<String, AadhaarCard> AadhaarMap = new HashMap<>();
    static
    {
        AadhaarMap.put("12345678",new AadhaarCard("12345678","Priti Maurya","Mr Pawan Kumar Maurya","Varanasi","83779446677"));
        AadhaarMap.put("12345679",new AadhaarCard("12345679","Kirti Maurya","Mr Pawan Kumar Maurya","Banglore","83779446679"));
    }

    public AadhaarCard getbyAadharNumber(String AadhaarNumber)
    {
        return AadhaarMap.get(AadhaarNumber);
    }
}
