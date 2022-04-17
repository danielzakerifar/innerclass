import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }
    private  static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.addGear(1,5.3);
//        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

        //        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
////        Gearbox.Gear second = new Gearbox.Gear(2,15.4);
////        Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
//        System.out.println(first.driveSpeed(1000));


    }

