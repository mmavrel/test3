public class Vexed {
    public static String getSillago(String beechy , String frilly) {
        if (frilly.contains(beechy)) {
            return frilly.substring(0, 4);
        } else {
            return String.valueOf(frilly.length() + beechy.length());
    }
}
