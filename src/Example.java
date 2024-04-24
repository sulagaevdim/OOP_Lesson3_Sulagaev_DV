public class Example {
    public static void main(String[] args) {
        System.out.println(calculator('/', 3, 10));
    }
    public static double calculator(char o, double a, double b){
        switch (o){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new RuntimeException("Операция не поддерживается");
        }
    }
}
