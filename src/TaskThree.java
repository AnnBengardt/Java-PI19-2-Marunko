public class TaskThree {

    public static void main(String[] args){
        TaskThreeBox box = new TaskThreeBox(150);
        System.out.println(box.getVolume());
        Cube cube = new Cube(9);
        System.out.println(cube.getVolume());
        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println(cylinder.getVolume());
        Ball ball = new Ball(15);
        System.out.println(ball.getVolume());
        box.addShape(cube);
        box.addShape(cylinder);
        box.addShape(ball);
        System.out.println(box.getVolume());
    }

}


