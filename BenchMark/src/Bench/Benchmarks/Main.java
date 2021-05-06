package Bench.Benchmarks;

public class Main {

     public static void main(String args[]) {

         Cramer object = new Cramer();
         object.solutionOfCramerSystem();
         System.out.println("Cramer done in "+object.getTimeout()+" miliseconds");

          DigitsOfPI spigot = new DigitsOfPI();
          spigot.run(10000);

     }
}
