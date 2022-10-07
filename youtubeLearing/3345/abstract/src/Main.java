public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator=new WomanGameCalculator();


//        GameCalculator gameCalculator=new GameCalculator() {
//            @Override
//            public void calculate() {
//
//            }
//        }
//
//    }
//
//    Abstractlar tek başına new edilemez

    }

}