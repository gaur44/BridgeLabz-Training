public class SSNValidator {

    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {
        String valid = "123-45-6789";
        String invalid = "123456789";

        System.out.println(valid + " is valid? " + isValidSSN(valid));
        System.out.println(invalid + " is valid? " + isValidSSN(invalid));
    }
}
