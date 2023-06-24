package sem7.HWsem7;

public interface iCalculable {
    iCalculable sumComplex(int a, int b, int c, int d);

    iCalculable multiComplex(int a, int b, int c, int d);

    iCalculable divideComplex(int a, int b, int c, int d);

    String getResult();
}
