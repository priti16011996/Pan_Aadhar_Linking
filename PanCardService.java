import java.util.HashMap;
import java.util.Map;

public class PanCardService {

    private static Map<String, PanCard> PanMap = new HashMap<>();
    static
    {
       PanMap.put("12345678",new PanCard("ABB123456PN","12345678","BOB Bank","Health Insurance,FD,Saving"));
        PanMap.put("12345679",new PanCard("ABB123459PN","12345679","SBI Bank","FD,Saving"));
    }

    public PanCard getByAAdhaarNumber(String aadharNumber)
    {
        for(PanCard Pan: PanMap.values())
        {
            if(Pan.getAadhaarNumber().equals(aadharNumber))
            {
                return Pan;
            }
        }
        return null;
    }

}
