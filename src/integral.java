public class integral {


    public static double integral(double a, double b) {
        int n = 1;
        double deltax = (b - a) / n;
        double resultat = 0;

        for (int k = 0; k < n; k++) {
            resultat += f(a+k*deltax)*deltax;

        }
        return resultat;

    }
    public static double f(double x){
        double k = 250;
        return k*x;
    }
}

