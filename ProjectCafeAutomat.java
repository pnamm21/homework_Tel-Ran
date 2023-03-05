import java.util.Scanner;

public class ProjectCafeAutomat {
        public static void main(String[] args) {
            Interface();
            automat();
        }

        public static void automat(){
            Scanner automat = new Scanner(System.in);
            System.out.print("Which drink do you want?: ");
            String cafe = automat.next();

            switch (cafe){
                case "Expresso":
                    System.out.println("Неделимый процесс\n");
                    Scanner expr = new Scanner(System.in);
                    System.out.print("Which size do you want?: ");
                    String size = expr.next();
                    switch (size) {
                        case "S":
                            ExpressoSmall();
                            break;
                        case "M":
                            ExpressoMedium();
                            break;
                        case "L":
                            ExpressoLarge();
                            break;
                    }
                    break;
                case "Americano":
                    System.out.println("Приготовление эспрессо и добавление воды\n");
                    Scanner amer = new Scanner(System.in);
                    System.out.print("Which size do you want?: ");
                    String size1 = amer.next();
                    switch (size1) {
                        case "S":
                            AmericanoSmall();
                            break;
                        case "M":
                            AmericanoMedium();
                            break;
                        case "L":
                            AmericanoLarge();
                            break;
                    }
                    break;
                case "Capuchino":
                    System.out.println("Приготовление эспрессо и добавление вспененного молока\n");
                    Scanner capuch = new Scanner(System.in);
                    System.out.print("Which size do you want?: ");
                    String size2 = capuch.next();
                    switch (size2) {
                        case "M":
                            CapuchinoMedium();
                            break;
                        case "L":
                            CapuchinoLarge();
                            break;
                    }
                    break;
                case "Tea":
                    InterfaceTea();
                    Scanner tea = new Scanner(System.in);
                    System.out.print("Which flavor of Tea do you want?: ");
                    String flavor = tea.next();
                    switch (flavor){
                        case "Fruit-tea":
                            System.out.println("Ваш фруктовый чай!\n");
                            TeaSize();
                            break;
                        case "Green-tea":
                            System.out.println("Ваш зеленый чай!\n");
                            TeaSize();
                            break;
                        case "Dark-tea":
                            System.out.println("Ваш черный чай!\n");
                            TeaSize();
                            break;
                        case "Wildberrie-tea":
                            System.out.println("Ваш лесная ягода чай!\n");
                            TeaSize();
                            break;
                    }
                    tea.close();
                    break;
                default:
                    System.out.println("Nothing!\n");
                    break;
            }
            automat.close();
        }
        public static void ExpressoSmall(){
            double expr = 3.5;
            System.out.println("ExpressoS = "+expr+"Euro");
            Scanner S = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = S.nextDouble();
            S.close();
            if(costumer>expr) {
                double result = costumer - expr;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void ExpressoMedium(){
            double expr = 4.7;
            System.out.println("ExpressoM = "+expr+"Euro");
            Scanner Med = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = Med.nextDouble();
            Med.close();
            if(costumer>expr) {
                double result = costumer - expr;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void ExpressoLarge(){
            double expr = 6.9;
            System.out.println("ExpressoL = "+expr+"Euro");
            Scanner L = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = L.nextDouble();
            L.close();

            if(costumer>expr) {
                double result = costumer - expr;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void AmericanoSmall(){
            double amer = 4;
            System.out.println("AmericanoS = "+amer+"Euro");
            Scanner Sm = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = Sm.nextDouble();
            Sm.close();

            if(costumer>amer) {
                double result = costumer - amer;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void AmericanoMedium(){
            double amer = 5.6;
            System.out.println("AmericanoM = "+amer+"Euro");

            Scanner Me = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = Me.nextDouble();
            Me.close();

            if(costumer>amer) {
                double result = costumer - amer;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void AmericanoLarge(){
            double amer = 7.4;
            System.out.println("AmericanoL = "+amer+"Euro");
            Scanner La = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = La.nextDouble();
            La.close();

            if(costumer>amer) {
                double result = costumer - amer;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void CapuchinoMedium(){
            double capuch = 5;
            System.out.println("CapuchinoM = "+capuch+"Euro");
            Scanner M = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = M.nextDouble();
            M.close();

            if(costumer>capuch) {
                double result = costumer - capuch;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void CapuchinoLarge(){
            double capuch = 6.7;
            System.out.println("CapuchinoL = "+capuch+"Euro");
            Scanner Lar = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = Lar.nextDouble();
            Lar.close();

            if(costumer>capuch) {
                double result = costumer - capuch;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void TeaSize(){
            double te = 4;
            System.out.println("Tea: "+te+"Euro");
            Scanner t = new Scanner(System.in);
            System.out.print("Enter your money: ");
            double costumer = t.nextDouble();
            t.close();
            if(costumer>te) {
                double result = costumer - te;
                System.out.println("Get change: " + result + "Euro");
            }else{
                System.out.println("Not enough money!");
            }
        }
        public static void Interface(){
            System.out.println("_____________\n"+"| Expresso  |\n"+"| Americano |\n"+"| Capuchino |\n"+"|    Tea    |\n"+"|___________|\n");
        }
        public static void InterfaceTea(){
            System.out.println("________________\n"+"|  Fruit-tea   |\n"+"|  Dark-tea    |\n"+"|Wildberrie-tea|\n"+"|  Green-tea   |\n"+"|______________|\n");
        }
}

