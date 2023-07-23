import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Formatter;
class Node{
    String item;
    float price;
    Node next;
    Node(String item,float price){
        this.item = item;
        this.price = price;
    }
}
class Queue{
    Node front;
    Node rear ;
    Queue(){
        this.front = null;
        this.rear = null;
    }
    void insert(Queue queue,String item,float price){
        Node newnode = new Node(item,price);
        if(queue.front == null){
            queue.rear = newnode;
            queue.front = newnode;
        }
        else{
            queue.rear.next = newnode;
            queue.rear = newnode;
        }
    }
    void billing(Queue queue){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        Date date = new Date();
        float sum = 0.0f;
        Node temp = queue.front;
        System.out.println("           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~      ");
        System.out.println("                WELCOME TO OUR RESTAURANT         ");
        System.out.println("           __________________________________     ");
        System.out.println("           Date&Time:"+formatter.format(date)+"     ");
        while(temp != null){
            sum += temp.price;
            System.out.printf("\n%30s : %f\n",temp.item,temp.price);
            temp = temp.next;
        }
        String total = "Total";
        System.out.printf("\n%30s : %f\n",total,sum);
        System.out.println("           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~      ");
        System.exit(0);
    }
}
class Veg
{
    // Queue queue = new Queue();
    Scanner sc = new Scanner(System.in);
    void mainVeg(Veg vegObj,Queue queue)
    {
        System.out.println(" ___________");
        System.out.println("|1.STARTERS |\n|2.BIRYANIS |\n|3.CHINESE  |\n|4.DESSERTS |\n|5.BACK     |\n|6.BILLING  |");
        System.out.println("|___________|");
        System.out.println("Enter choice : ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                vegObj.vegStarters(vegObj,queue);
                break;
            case 2:
                vegObj.vegBiryanis(vegObj,queue);
                break;
            case 3:
                vegObj.vegChinese(vegObj,queue);
                break;
            case 4:
                vegObj.desserts(vegObj,queue);  
                break;
            case 5:
                Restaurant res_obj = new Restaurant();
                res_obj.selection(queue);
                break;
            case 6:
                queue.billing(queue);
                break;
        }
    }
    void vegStarters(Veg vegObj,Queue queue)
    {
        String item ="";
        String qnt="";
        float price;
        System.out.println("          (-_-) VEG STARTERS (-_-)       ");
        System.out.println(" ________________________________________");
        System.out.println("|       ITEM            -    PRICE       |");
        System.out.println("|________________________________________|");
        System.out.println("| 1.Veg Corn Soup       -     Rs.170/-   |");
        System.out.println("| 2.Veg Sweet Corn Soup -     Rs.180/-   |");
        System.out.println("| 3.Veg Manchurian Dry  -     Rs.300/-   |");
        System.out.println("| 4.Paneern 65          -     Rs.320/-   |");
        System.out.println("| 5.Paneer Chilli       -     Rs.320/-   |");
        System.out.println("| 6.Mushroom Chilli     -     Rs.310/-   |");
        System.out.println("| 7.Mushroom 65         -     Rs.310/-   |");
        System.out.println("|________________________________________|");
        System.out.println("");
        System.out.println("8.Back\n9.Billing");
        System.out.println("\n\n");
        System.out.println(" enter the item number : ");
        int item_no = sc.nextInt();
        int quantity;
        switch(item_no){
            case 1:
                item = "Veg Corn Soup x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 170 *quantity;
                queue.insert(queue, item, price);
                break;
            case 2:
                item = "Veg Sweet Corn Soup x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 180 *quantity;
                queue.insert(queue, item, price);
                break;
            case 3:
                item = "Veg Manchurian Dry x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 300 *quantity;
                queue.insert(queue, item, price);
                break;
            case 4:
                item = "Paneern 65 x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 320 *quantity;
                queue.insert(queue, item, price);
                break;
            case 5:
                item = "Paneer Chilli x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 320 *quantity;
                queue.insert(queue, item, price);
                break;
            case 6:
                item = "Mushroom Chilli  x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 310 *quantity;
                queue.insert(queue, item, price);
                break;
            case 7:
                item = "Mushroom 65 x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 310 *quantity;
                queue.insert(queue, item, price);
                break;
            case 8:
                vegObj.mainVeg(vegObj,queue);
                break;
            case 9:
                queue.billing(queue);
                break;
            default:
                System.out.println("!! wrong Input Please Try Again");
                vegObj.vegStarters(vegObj,queue);
                break;
        }
        vegObj.vegStarters(vegObj,queue);
    }
    void vegBiryanis(Veg vegObj,Queue queue)
    {
        String item ="";
        String qnt="";
        float price;
        System.out.println("             (-_-) VEG BIRYANI (-_-)       ");
        System.out.println("  ________________________________________");
        System.out.println(" |       ITEM            -    PRICE       |");
        System.out.println(" |________________________________________|");
        System.out.println(" | 1.South Indian Thali  -     Rs.270/-   |");
        System.out.println(" | 2.Special Curd Rice   -     Rs.190/-   |");
        System.out.println(" | 3.Paneer Biryani      -     Rs.340/-   |");
        System.out.println(" | 4.Veg Biryani         -     Rs.260/-   |");
        System.out.println(" | 5.Curd Rice           -     Rs.140/-   |");
        System.out.println(" | 6.Cashew Biryanis     -     Rs.360/-   |");
        System.out.println(" |________________________________________|");
        System.out.println("");
        System.out.println("7.Back\n8.Billing");

        System.out.println("\n\n");
        System.out.println(" enter the item number : ");
        int item_no = sc.nextInt();
        int quantity;
        switch(item_no){
            case 1:
                item = "South Indian Thali x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 270 *quantity;
                queue.insert(queue, item, price);
                break;
            case 2:
                 item = "Special Curd Rice x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 190 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 3:
                item = "Paneer Biryani  x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 340 *quantity;
                queue.insert(queue, item, price);
                break;
            case 4:
                 item = "Veg Biryani x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 260 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 5:
                item = "Curd Rice x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 140 *quantity;
                queue.insert(queue, item, price);
                break;
            case 6:
                 item = "Cashew Biryanis x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 310 *quantity;
                queue.insert(queue, item, price);
                break;
            case 7:
                vegObj.mainVeg(vegObj,queue);
                break;
            case 8:
                queue.billing(queue);
                break;
            default:
                System.out.println("!! wrong Input Please Try Again");
                vegObj.vegBiryanis(vegObj,queue);
                break;
        }
         vegObj.vegBiryanis(vegObj,queue);
    }
    void vegChinese(Veg vegObj,Queue queue)
    {
        String item ="";
        String qnt="";
        float price;
        System.out.println("                 (-_-) VEG CHINESE (-_-)               ");
        System.out.println("  ____________________________________________________");
        System.out.println(" |       ITEM                        |    PRICE       |");
        System.out.println(" |____________________________________________________|");
        System.out.println(" | 1.Chilly Garlic Noodles           |     Rs.250/-   |");
        System.out.println(" | 2.Veg Noodles                     |     Rs.260/-   |");
        System.out.println(" | 3.Veg Schezwan Noodles            |     Rs.220/-   |");
        System.out.println(" | 4.Paneern Noodles                 |     Rs.310/-   |");
        System.out.println(" | 5.Corn Noodles                    |     Rs.320/-   |");
        System.out.println(" | 6.Mushroom Fried Rice             |     Rs.290/-   |");
        System.out.println(" | 7.Special Veg Fried Rice          |     Rs.340/-   |");
        System.out.println(" | 8.Vegetable Fried Rice            |     Rs.250/-   |");
        System.out.println(" | 9.Schezwan Vegetable  Fried Rice  |     Rs.260/-   |");
        System.out.println(" | 10.Veg Singapore Fried Rice       |     Rs.290/-   |");
        System.out.println(" | 11.Paneern Fried Rice             |     Rs.310/-   |");
        System.out.println(" | 12.Special Paneer Fried Rice      |     Rs.350/-   |");
        System.out.println(" | 13.Cashew Fried Rice              |     Rs.320/-   |");
        System.out.println(" | 14.Corn Fried Rice                |     Rs.280/-   |");
        System.out.println(" |____________________________________________________|");

        System.out.println("\n15.Back\n16.Billing");
        System.out.println("\n\n");
        System.out.println(" enter the item number : ");
        int item_no = sc.nextInt();
        int quantity;
        switch(item_no){
            case 1:
                item = "Chilly Garlic Noodles x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 250 *quantity;
                queue.insert(queue, item, price);
                break;
            case 2:
                 item = "Veg Noodles x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 260 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 3:
                item = "Veg Schezwan Noodles x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 220 *quantity;
                queue.insert(queue, item, price);
                break;
            case 4:
                 item = "Paneern Noodles x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 310 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 5:
                item = "Corn Noodles x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 320 *quantity;
                queue.insert(queue, item, price);
                break;
            case 6:
                 item = "Mushroom Fried Rice  x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 290 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 7:
                item = "Special Veg Fried Rice x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 340 *quantity;
                queue.insert(queue, item, price);
                break;
            case 8:
                item = "Vegetable Fried Rice x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 250 *quantity;
                queue.insert(queue, item, price);
                break;
            case 9:
                 item = "Schezwan Vegetable  Fried Rice x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 260 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 10:
                item = "Veg Singapore Fried Rice x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 290 *quantity;
                queue.insert(queue, item, price);
                break;
            case 11:
                 item = "Paneer Fried Rice x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 310 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 12:
                item = "Special Paneer Fried Rice x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 350 *quantity;
                queue.insert(queue, item, price);
                break;
            case 13:
                 item = "Cashew Fried Rice  x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 320 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 14:
                item = "Corn Fried Rice x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 280 *quantity;
                queue.insert(queue, item, price);
                break;
            case 15:
                vegObj.mainVeg(vegObj,queue);
                break;
            case 16:
                queue.billing(queue);
                break;
            default:
                System.out.println("!! wrong Input Please Try Again");
                vegObj.vegChinese(vegObj,queue);
                break;
        }
        vegObj.vegChinese(vegObj,queue);
    }
    void desserts(Veg vegObj,Queue queue)
    {
        String item ="";
        String qnt="";
        float price;
        System.out.println("           (-_-) DESSEERTS & COOL DRINKS (-_-)          ");
        System.out.println("  ______________________________________________________");
        System.out.println(" |       ITEM                        -       PRICE      |");
        System.out.println(" |______________________________________________________|");
        System.out.println(" | 1.Chocolate Lava Cake             -     Rs.70/piece- |");
        System.out.println(" | 2.Lemon Sponge Cake               -     Rs.80/piece- |");
        System.out.println(" | 3.Vanilla Panna Cotta             -     Rs.140/piece-|");
        System.out.println(" | 4.ButterScotch Pudding            -     Rs.300/Piece-|");
        System.out.println(" | 5.Red Velvet Cake                 -     Rs.80/Piece- |");
        System.out.println(" | 6.Dry Fruit Ice Cream             -     Rs.90/cup-   |");
        System.out.println(" | 7.Double Flavour Ice Cream        -     Rs.80/cup-   |");
        System.out.println(" | 8.Vanilla Ice Cream               -     Rs.80/cup-   |");
        System.out.println(" | 9.ButterScotch Ice Cream          -     Rs.80/cup-   |");
        System.out.println(" | 10.American Dry Fruit Ice Cream   -     Rs.100/cup-  |");
        System.out.println(" | 11.Thumbs up                      -     Rs.25/-      |");
        System.out.println(" | 12.Sprite                         -     Rs.25/-      |");
        System.out.println(" | 13.Fanta                          -     Rs.25/-      |");
        System.out.println(" | 14.Pulpy Orange                   -     Rs.25/-      |");
        System.out.println(" | 15.Water Bottle                   -     Rs.25/-      |");
        System.out.println(" |______________________________________________________|");

        System.out.println("\n16.Back\n17.Billing");
        System.out.println("\n\n");
        System.out.println(" enter the item number : ");
        int item_no = sc.nextInt();
        int quantity;
        switch(item_no){
            case 1:
                item = "Chocolate Lava Cake x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 70 *quantity;
                queue.insert(queue, item, price);
                break;
            case 2:
                 item = "Lemon Sponge Cake  x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 80 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 3:
                item = "Vanilla Panna Cotta x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 140 *quantity;
                queue.insert(queue, item, price);
                break;
            case 4:
                 item = "ButterScotch Pudding x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 300 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 5:
                item = "Red Velvet Cake x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 80 *quantity;
                queue.insert(queue, item, price);
                break;
            case 6:
                 item = "Dry Fruit Ice Cream  x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 90 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 7:
                item = "Double Flavour Ice Cream x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 80 *quantity;
                queue.insert(queue, item, price);
                break;
            case 8:
                item = "Vanilla Ice Cream x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 80 *quantity;
                queue.insert(queue, item, price);
                break;
            case 9:
                 item = "ButterScotch Ice Cream x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 80 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 10:
                item = "American Dry Fruit Ice Cream x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 100 *quantity;
                queue.insert(queue, item, price);
                break;
            case 11:
                 item = "Thumbs up  x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 25 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 12:
                item = "Sprite  x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 25 *quantity;
                queue.insert(queue, item, price);
                break;
            case 13:
                 item = "Fanta  x ";
                 System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                 qnt = Integer.toString(quantity);
                item += qnt;
                 price = 25 *quantity;
                 queue.insert(queue, item, price);
                break;
            case 14:
                item = "Pulpy Orange x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
                item += qnt;
                price = 25 *quantity;
                queue.insert(queue, item, price);
                break;
            case 15:
                item = "Water Bottle  x ";
                System.out.println("Enter Quantity:");
                quantity = sc.nextInt();
                qnt = Integer.toString(quantity);
               item += qnt;
                price = 25 *quantity;
                queue.insert(queue, item, price);
               break;
            case 16:
               vegObj.mainVeg(vegObj,queue);
               break;
           case 17:
               queue.billing(queue);
               break;
            default:
                System.out.println("!! wrong Input Please Try Again");
                vegObj.desserts(vegObj,queue);
                break;
        }
        vegObj.desserts(vegObj,queue);
    }
}
// class NonVeg
// {
//     Scanner sc = new Scanner(System.in);
//     void mainNonVeg(NonVeg nonveg_obj,Queue queue)
//     {
//         System.out.println(" -------------------------------------------------------------------------------------------------------");
//         System.out.println(" | 1. STARTERS \t 2.BIRYANIS \t 3.CHINESE \t 4.DESSERTS \t 5.BACK \t 6.BILLING |");
//         System.out.println(" -------------------------------------------------------------------------------------------------------");
//         int ch = sc.nextInt();
//         switch(ch)
//         {
//             case 1:
//                 nonveg_obj.nonVegStarters(nonveg_obj);
//                 break;
//             case 2:
//                 nonveg_obj.nonVegBiryanis(nonveg_obj);
//                 break;
//             case 3:
//                 nonveg_obj.nonVegChinese(nonveg_obj);
//                 break;
//             case 4:
//                 nonveg_obj.desserts(nonveg_obj);  
//                 break;
//             case 5:
//                 Restaurant res_obj = new Restaurant();
//                 res_obj.selection();
//                 break;
//             case 6:
//                 queue.billing(queue);
//                 break;
//         }
//     }
// }
class Restaurant
{
    void selection(Queue queue)
    {
            System.out.println(" ________");
            System.out.println("|1.veg   |\n|2.nonveg|\n|3.Exit  | ");
            System.out.println("|________|");
            System.out.print(" select from above : ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    Veg vegObj = new Veg();
                    vegObj.mainVeg(vegObj,queue);
                    break;
                case 2:
                    // NonVeg nonveg_obj = new NonVeg();
                    // nonveg_obj.mainnonveg(nonveg_obj);
                    break;
                case 3:
                    if(queue.front==null){
                        System.exit(0);
                    }
                    else{
                        queue.billing(queue);
                    }
                default:
                    System.out.println("!! Wrong Input !! Please Try Again");
                    Restaurant obj = new Restaurant();
                    obj.selection(queue);
            }
    }
    public static void main(String[] args) {
        Restaurant obj = new Restaurant();
        Queue queue = new Queue();
        obj.selection(queue);
    }
}