
public class Box {
    int width;
    int height;
    int depth;

    public Box(){
        width = 5;
        height = 6;
        depth = 7;


        System.out.println("Width: "+width+" cm3");
        System.out.println("Height: "+height+" cm3");
        System.out.println("Depth: "+depth+" cm3");


    }
    public Box(int width){
        this.width = width;
        height = 23;
        depth = 40;

        System.out.println("Width: "+width+" cm3");
        System.out.println("Height: "+height+" cm3");
        System.out.println("Depth: "+depth+" cm3");

    }

    public Box (int width,int height){
        this.width = width;
        this.height = height;
        depth = 33;

        System.out.println("Width: "+width+" cm3");
        System.out.println("Height: "+height+" cm3");
        System.out.println("Depth: "+depth+" cm3");

    }

    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

        System.out.println("Width: "+width+" cm3");
        System.out.println("Height: "+height+" cm3");
        System.out.println("Depth: "+depth+" cm3");
    }

}
