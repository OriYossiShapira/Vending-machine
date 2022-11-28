public enum Coin {

    TEN_AGOROT(0.1),
    HALF_SHEKEL(0.5),
    ONE_SHEKEL(1.0),
    TWO_SHEKEL(2.0),
    FIVE_SHEKEL(5.0),
    TEN_SHEKEL(10.0);


    private final  double value;
    Coin(double value) {
        this.value = value;
    }


    public double getValue() {
        return value;
    }
}
