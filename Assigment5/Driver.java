package Assigment5;

public class Driver {
    public static void main(String[] args) {
        MyInterface[] sign={new UpWardHat(),new UpWardHat(), new DownWardHat(),
                new FaceMaker(),new Vertical() };
        for (MyInterface fig : sign) {
            fig.getFigure();
        }
        System.out.println();
        for (MyInterface fig : sign) {
            System.out.println(fig + " : ");
            fig.getFigure();
            System.out.println();
        }
    }
}
