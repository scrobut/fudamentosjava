package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        Byte b = 1;
        Short s = 1000;
        Integer i = 10000;
        Long l = 1000000L;
        Double d = 10.2;
        Float f = 10.123F;
        Character c = 'A';
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(b.byteValue());

    }
}
