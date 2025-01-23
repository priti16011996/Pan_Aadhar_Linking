public class PanCard {

    private  String PanNumber;
    private  String AadhaarNumber;
    private  String BankDetails;
    private  String Investments;

    public PanCard(String panNumber, String aadhaarNumber, String bankDetails, String investments) {
        PanNumber = panNumber;
        AadhaarNumber = aadhaarNumber;
        BankDetails = bankDetails;
        Investments = investments;
    }

    public String getPanNumber() {
        return PanNumber;
    }

    public void setPanNumber(String panNumber) {
        PanNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return AadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        AadhaarNumber = aadhaarNumber;
    }

    public String getBankDetails() {
        return BankDetails;
    }

    public void setBankDetails(String bankDetails) {
        BankDetails = bankDetails;
    }

    public String getInvestments() {
        return Investments;
    }

    public void setInvestments(String investments) {
        Investments = investments;
    }

    @Override
    public String toString() {
        return "PanCard{" +
                "PanNumber='" + PanNumber + '\'' +
                ", AadhaarNumber='" + AadhaarNumber + '\'' +
                ", BankDetails='" + BankDetails + '\'' +
                ", Investments='" + Investments + '\'' +
                '}';
    }
}
