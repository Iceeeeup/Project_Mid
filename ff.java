import java.util.ArrayList;

public class pro{
    public static void main(String[] args){
     residence home = new residence();
     residence hotel = new residence();
     residence resort = new residence();
     residence apartment = new residence();
     residence condo = new residence();
    
     home.door = 1;
     home.window = 4;
     home.color = "white";
     home.area = "2 rai";
     home.park = 1;
     home.ST = 0;
     
     hotel.door = 1;
     hotel.window = 4;
     hotel.color = "beige";
     hotel.area = "1 rai";
     hotel.park = 0;
     hotel.ST = 1;

     resort.door = 1;
     resort.window = 4;
     resort.color = "green";
     resort.area = "1.2 rai";
     resort.park = 1;
     resort.ST = 0;

     apartment.door = 1;
     apartment.window = 4;
     apartment.color = "blue";
     apartment.area = "0.5 rai";
     apartment.park = 0;
     apartment.ST = 1;

     condo.door = 1;
     condo.window = 4;
     condo.color = "grey";
     condo.area = "1.5 rai";
     condo.park = 0;
     condo.ST = 1;





    }

}
class residence{
    public int door;
    public int window;
    public String color;
    public String area;
    public int park;
    public int ST;

    public void Search(){ }
    public void View(){ }
    public void Booking(){ }

    
}


