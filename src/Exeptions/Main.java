package Exeptions;

public class Main {

    private static int divideInts(int a, int b){
        throw new RuntimeException("Something else");
       // return a/b;
    }
//        try {      // попробуй разделить а на б и если получится все нормально
//            return a / b;
//        }catch (ArithmeticException e) { //если же не получится и возникла такая ошибка , то верни 0
//            return 0;
//        }
//    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(divideInts(a, b));//здесь случилось прерывание исполнения, поэтому идем в catch
        } catch (ArithmeticException e) { // он является экземпляром клааса ArithmetcExeption? Если да, то печатаем сообщение
            // а если не является значит прекращаем испонение и перебрасываем на след. уровень. но москольку метод Main самый верхний уровень
            // то мы выпадим из Джавы и напечатаеся красных exeption
            System.out.println("there was some division error");
        } catch (RuntimeException e){
            System.out.println("there was a runtime exeption");
        }
        // Aritthemetic axeption является подклассом RuntimeExeption
        System.out.println("----------------");
    }
}