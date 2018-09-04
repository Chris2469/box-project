package boxes;
    
public class BuildBox {
    
    public static void main(String[] args) {
        
        Box box = new Box(2, 3, 5); 
        
        int volume = box.getVolume();
        System.out.println("Volume: " + volume);

    }

}
