package HomeWork2.Office;

public class Security {
    private String securityName;

    public Security(String securityName) {
        this.securityName = securityName;
    }

    @Override
    public String toString() {
        return "Security{" +
                "securityName='" + securityName + '\'' +
                '}';
    }

    public void securityDonate(String securityName) {
        System.out.printf("%s - просит аванс\n", securityName);
    }
}
