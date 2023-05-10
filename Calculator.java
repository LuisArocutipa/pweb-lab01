public class Calculator {

    public static void main(String[]args){

        System.out.println("La suma de 3 y 9 es:" + add(3,9));
        System.out.println("La resta de 9 y 3 es:" + sub(9,3));
        System.out.println("La multiplicación de 3 y 9 es:" + mul(3,9));
        System.out.println("La división de 9 y 3 es:" + div(9,3));
        System.out.println("8 en módulo 3 es:" + mod(8,3));
        
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mul(int num1, int num2){
        return num1 * num2;
    }

    public static double div(int num1, int num2){
        return num1/num2;
    }

    public static int mod(int num1, int num2){
        return num1 % num2;
    }

}
