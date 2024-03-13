package 제네릭;

public class GenericPrinterMain {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter);
        System.out.println(powder);

//        GenericPrinter<> plastic;
    }
}
