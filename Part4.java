public class Part4 {
    public static void main(String[] args) {
        //a
        String regexColorRGB = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        String color = "#FF3421";
        boolean isColorRGB = color.matches(regexColorRGB);
        System.out.println(isColorRGB);

        //b
        String regexDate = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$";
        String date = "29/02/2000";
        boolean validDate = date.matches(regexDate);
        System.out.println(validDate);

        //c
        String regexEmail = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z]{2,})+$";
        String email = "mail@mail.ru";
        boolean validMail = email.matches(regexEmail);
        System.out.println(validMail);

        //d
        String regexAddressIP = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
        String addressIP = "127.0.0.1";
        boolean validAddress = addressIP.matches(regexAddressIP);
        System.out.println(validAddress); // true


    }
}
