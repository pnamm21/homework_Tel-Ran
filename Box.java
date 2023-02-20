
public class Box {
    int width;
    int height;
    int depth;
    int V;

    public Box(){
        width = 5;
        height = 6;
        depth = 7;
        V =0;

        System.out.println(V=width*height*depth);
        System.out.println("V: "+V+" cm3");


    }
    public Box(int width){
        this.width = width;
        height = 23;
        depth = 40;
        V=0;

        System.out.println(V=width*height*depth);
        System.out.println("V: "+V+" cm3");

    }

    public Box (int width,int height){
        this.width = width;
        this.height = height;
        depth = 33;

        System.out.println(V=width*height*depth);
        System.out.println("V: "+V+" cm3");

    }

    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

        System.out.println(V=width*height*depth);
        System.out.println("V: "+V+" cm3");
    }

}
