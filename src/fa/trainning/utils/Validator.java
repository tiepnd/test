package fa.trainning.utils;

public class Validator {
    public static boolean isPhoneNumber(String phone) {
        return phone.matches(Constants.PHONE_NUMBER_REGEX);
    }

    public static boolean isValidLengthNumberOrder(String numberOrder) {
        return numberOrder.length() == Constants.ORDER_NUMBER_LENGTH;
    }
}
