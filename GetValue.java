public class GetValue {
    public int type;
    public int intValue;
    public double doubleValue;
    public String stringValue;

    public String toString() {
        String temp = "";
        if (type == 0) {
            temp += intValue;
        } else if (type == 1) {
            temp += doubleValue;
        } else if (type == 2) {
            temp += stringValue;
        }
        return temp;
    }
}