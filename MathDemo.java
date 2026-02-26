public class MathDemo {
    static int min(int a, int b) {
        if(a < b){
            return a;
        }
        else{
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    static int sum(int[] args) {
        int cem = 0;
        for(int i : args){
            cem = cem + i;
        }
        return cem;
    }
    static float mean(int[] args) {
        int n = args.length;
        int cem = sum(args);
        return (float) cem / n;
    }
    static int factorial(int n) {
        int hasil = 1;
        for (int i=1 ; i<=n ; i++) {
            hasil *= i;
        }
        return hasil;
    }
}