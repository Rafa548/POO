package Aula7;

public class Ex1Test {
    public static void main(String[] args) {
        Forma[] anarray = new Forma[40];

        for (int i = 0; i < anarray.length; i++) {
            switch((int) (Math.random()*5)) {
                case 0:
                    anarray[i] = new Circle((Math.random()*100));
                    break;
                case 1:
                    anarray[i] = new Rectangle((Math.random()*100), (Math.random()*100));
                    break;
                case 2:
                    double l1 = (Math.random()*100);
                    double l2 = (Math.random()*100);
                    double l3 = Math.sqrt(l1*l1+l2*l2);
                    anarray[i] = new Triangle(l1,l2 ,l3 );
                    break;
                case 3:
                    anarray[i] = new Circle((Math.random()*100), "red");
                    break;
                case 4:
                    anarray[i] = new Rectangle((Math.random()*100), (Math.random()*100), "red");
                    break;
                case 5:
                    double l1_2 = (Math.random()*100);
                    double l2_2 = (Math.random()*100);
                    double l3_2 = Math.sqrt(l1_2*l1_2+l2_2*l2_2);
                    anarray[i] = new Triangle(l1_2,l2_2,l3_2, "red");
                    break;

            }
        }
        for (int i = 0; i < anarray.length; i++) {
            System.out.println(anarray[i]);
        }
    }
}