package Interface;

public class RemoteControlExample {
    //인터페이스 구현 객체 사용 시 인터페이스 변수 선언 후 구현 객체 대입
    //인터페이스 변수; 변수 = 구현 객체; 인터페이스 변수 = 구현 객체;
    //        RemoteContorl rc;
    //        rc = new Television();
    public static void main(String[] args){ //익명 구현 객체
        RemoteContorl rc = new RemoteContorl() {
            public void turnOn(){/*실행문*/}
            public void turnOff(){/*실행문*/}
            public void setVolume(int volume){/*실행문*/}
        };
        //하나의 실행문이므로 끝에 ; 필수

//        RemoteContorl remoteContorl = null; //인터페이스 변수 선언
//        remoteContorl = new Television(); // television 객체를 인터페이스 타입에 대입
//        remoteContorl.turnOn();
//        remoteContorl.turnOff();
    }
}
