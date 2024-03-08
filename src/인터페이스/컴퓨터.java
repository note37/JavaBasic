package 인터페이스;

public class 컴퓨터 implements 이미지사이즈{
    public void resize(int 가로, int 세로){
        System.out.println("컴퓨터 가로크기 : "+ 가로 + " 세로크기 : "+세로);
    }
    public void buttonSize(){
        System.out.println("버튼사이즈 가로크기 : 30 세로크기 : 35");
    }
}
