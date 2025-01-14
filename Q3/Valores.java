package Q3;

public class Valores {
    private int a;
    private string expre;
    private int b;

    public Valores(int a, string expre, int b){
        this.a = a;
        this.expre = expre;
        this.b = b;
    }

    public int getA(){
        return getA();
    }

    public void setA(int a){
        this.a = a;
    }

    public void setExpre(string expre){
        this.expre = expre;
    }

    public int getExpre(){
        return getExpre();
    }

    public void setB=(int b){
        this.b = b;
    }

    public int getB(){
        return getB();
    }

    public void calcular(int a,string expre, int b) {
        int x;
        switch (expre){
            case "+":
                x = a + b;
                System.out.println("");
                break;

            case "-":
                x = a - b;
                break;

            case "*":
                x = a * b;
                break;

            case "/":
                x = a / b;
                break;


        }
    }
}
