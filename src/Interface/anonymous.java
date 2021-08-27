package Interface;

public class anonymous {
    //필드 초기값으로 대입
    Person field = new Person(){
        void work(){
            System.out.println("working");
        }
        @Override
        void wake(){
            System.out.println("wake up at 6");
        }
    };

    void method(){
        //로컬 변수값으로 대입
        Person localVar = new Person(){
            void walk(){
                System.out.println("taking a nap");
            }
            @Override
            void wake(){
                System.out.println("wake up at 7");
            }
        };
        //로컬 변수 사용
        localVar.wake();
    }

    void method2(Person person){
        person.wake();
    }
}
