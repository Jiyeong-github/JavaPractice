package Interface;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();
    //필드 초기값으로 대입

    Button.OnClickListener listner = new Button.OnClickListener(){
        @Override
        public void onClick(){
            System.out.println("전화를 겁니다");
        }
    };//필드 선언과 초기값 대입

    Window(){
        button1.setOnClickListener(listner); //매개값으로 필드 대입
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("sending a MSG");
            }
        }); //매개값으로 익명 구현 객체 대입
    }
}
