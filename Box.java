
public class Box {
    int width;
    int height;
    int depth;
    int V;

    public Box(){
        width = 5;
        height = 6;
        depth = 7;
       

        System.out.println(V=width*height*depth);
        System.out.println("V0: "+V+" cm3");


    }
    public Box(int width){
        this.width = width;
        height = 23;
        depth = 40;
        

        System.out.println(V=width*height*depth);
        System.out.println("V1: "+V+" cm3");

    }

    public Box (int width,int height){
        this.width = width;
        this.height = height;
        depth = 33;

        System.out.println(V=width*height*depth);
        System.out.println("V2: "+V+" cm3");

    }

    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

        System.out.println(V=width*height*depth);
        System.out.println("V3: "+V+" cm3");
    }

}
