package Interface;

public class Television implements RemoteContorl{
    //필드
    private int volume;

    //질문 1) 왜 만들자마자 implements하라고 빨간 줄 뜨더니 @override하고 메소드 세 개 만드는지 : 안 만들어줘도 되지만 만드는 걸 권장
    //질문 2) @override 지우자마자 왜 다시 빨간 줄 뜨는지
    //질문 3) setVolume 메소드 만들어주자마자 왜 다시 괜찮아지는지

    //turnOn() 추상 메소드의 실체 메소드
    public void turnOn() {
        System.out.println("티비 켜");
    }
    //turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println("티비 꺼");
    }

    //setVolume의 추상 메소드의 실체 메소드
    public void setVolume(int volume){
        if(volume>RemoteContorl.MAX_VOLUME){
            this.volume = RemoteContorl.MAX_VOLUME;
        }else if(volume<RemoteContorl.MIN_VOLUME){
            this.volume = RemoteContorl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    //인터페이스는 모두 public 제한자로 만들어지기 때문에, 그 아래의 제한자로 생성 불가능
    //인터페이스에 선언된 추상 메소드에 대응하는 실체 메소드를 구현 클래스에 작성하지 않으면 구현 클래스가 추상 클래스가 됨



}
