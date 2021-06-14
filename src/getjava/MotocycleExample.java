package getjava;

public class MotocycleExample {//return문
    public static void main(String[] args) {
        Motocycle moto = new Motocycle();

        moto.setGas(5);//Moto의 setGas() 메소드 호출

        boolean gasState = moto.isLeftGas(); //Moto의 isLeftGas() 메소드 호출
        if (gasState) {
            System.out.println("출발합니다.");
            moto.run(); //moto의 run() 메소드 호출
        }

        if (moto.isLeftGas()) {//moto의 isLeftGas()의 메소드 호출
            System.out.println("gas 충분");
        } else {
            System.out.println("gas 필요");
        }
    }
}
