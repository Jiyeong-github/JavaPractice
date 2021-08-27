package Interface;

public class Button {
    OnClickListener listener;
    //인터페이스 타입 필드

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }
    //매개 변수의 다형성

    void touch(){
        listener.onClick();
    }
    //구현 객체의 onCLick() 메소드 호출

    interface OnClickListener{
        void onClick();
    }
    //중첩 페이스스
}
