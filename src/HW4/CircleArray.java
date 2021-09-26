package HW4;
//예제 4-6: Circle 객체 배열 만들기
class Circle3 {
    int radius;
    public Circle3(int radius){
        this.radius= radius;
    }
    public double getArae(){
        return 3.14*radius*radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circle3[] c;
        c= new Circle3[5];

        for(int i=0; i<c.length; i++)
            c[i]=new Circle3(i);

        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArae())+" ");
    }
}
