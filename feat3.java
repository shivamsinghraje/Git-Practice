public class feat3 {
    public static void main(String[] args) {
        System.out.println("This is feat3");
        newFeature();
        int result = anotherFeature();
        System.out.println("This function returns a random integer in the range [1, 10]: " + result);
    }
    public static void newFeature() {
        System.out.println("This is a new feature in feat3");
    }
    public static int anotherFeature() {
        int x= (int) Math.ceil(Math.random() * 10);
        return x;
    }
}
