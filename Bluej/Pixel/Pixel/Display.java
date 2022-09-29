public class Display {
    public static void main(String[] args) {
        Pixel p = new Pixel(199, 192, 30);
        
        System.out.println(p.toJSON());
        
        p.darken(30);
        
        System.out.println(p.toJSON());
    }
}