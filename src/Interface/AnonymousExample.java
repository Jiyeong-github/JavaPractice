package Interface;

public class AnonymousExample {
    public static void main(String[] args){
        anonymous anony = new anonymous();
        //익명 객체 필드 사용
        anony.field.wake();
        //익명 객체 로컬 변수 사용
        anony.method();
        //익명 객체 매체값 사용
        anony.method2(
                new Person(){
                    void study(){
                        System.out.println("study");
                    }

                    @Override
                    void wake() {
                        System.out.println("wake up at 8");
                        study();
                    }
                }
        );
    }
}
