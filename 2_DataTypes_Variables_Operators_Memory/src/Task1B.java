

public class Task1B {
    
 public static void main(String[] args) {
            System.out.println("1 + 2 = " + 1 + 2); //1+2=12 
        /**операторът "+" за залепаване на низове има еднакъв
         * приоритет с оператора "+" за събиране. Ако не променим приоритета на операзциите чрез поставяне
         * на скоби, те винаги ще се изпълняват от ляво на дясно.
         */
        System.out.println("1 + 2 = " + (1 + 2)); //1+2=3
}
}
