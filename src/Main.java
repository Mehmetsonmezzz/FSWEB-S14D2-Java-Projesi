import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.rooms.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom1 = new Bedroom("yatak",
                new Wall("West"),
                new Wall("North"),
                new Wall("South"),
                new Wall("East"),
                new Ceiling(25, PaintColor.blue),
                new Bed("sport",2,25,2,1),new Lamp(LampType.darkType,true,70),
                new Wardrobe(80,80,25),
                new Carpet(25,25,PaintColor.white)
                );
        System.out.println(bedroom1);

    }
}