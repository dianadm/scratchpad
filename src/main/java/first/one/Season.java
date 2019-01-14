package first.one;

public enum Season {

    WINTER {
        public void printSpanish() {
            System.out.println("invierno");
        }
    }, SPRING {
        public void printSpanish() {
            System.out.println("primavera <3");
        }
    }, SUMMER, AUTUMN;

    public void printSpanish() {
        System.out.println("estación!");
    }
//  OR public abstract void printSpanish();

    // cannot be public nor protected!
    private Season() {

    }


}
