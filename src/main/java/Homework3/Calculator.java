package Homework3;


    public class Calculator {


        public static int calculate (int number1, int number2,String symbol) {
            double result = 0;
            switch (symbol) {
                case "+":
                    result = addition (number1, number2);
                    break;
                case "-":
                    result = subtraction (number1, number2);
                    break;
                case "/":
                    if (number2 !=0) {
                        result = division (number1, number2);
                    }else {
                        System.out.println ("Error / by 0");
                    }
                    break;
                case "*":
                    result = multiplication (number1, number2);
                    break;
                case "%":
                    result = percentage (number1, number2);
                    break;

                default:
                    System.out.println ("Error");
                    System.exit (0);
            }

            return (int) result;
        }

        private static int subtraction (int number1, int number2) {
            return number1 - number2;
        }

        private static int addition (int number1, int number2) {
            return number1 + number2;
        }

        private static  int division (int number1, int number2) {
            return number1 / number2;
        }

        public static int multiplication (int number1, int number2 ) {
            return number1 * number2;

        }
        public static double percentage (double number1, double number2) {

            return (number1 / 100) * number2;
        }
    }
