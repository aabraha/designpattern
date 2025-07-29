public class CreditCard {
    private String type;
    private String number;
    private String dateOfExpiry;
    private String cvvCode;

    public CreditCard(String type, String number, String dateOfExpiry, String cvvCode) {
        this.type = type;
        this.number = number;
        this.dateOfExpiry = dateOfExpiry;
        this.cvvCode = cvvCode;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String getCvvCode() {
        return cvvCode;
    }
}