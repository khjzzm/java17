package ws_java;

public class FlowEx2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int visitCount = 5; 
    
    if (visitCount < 1) {       // 5 < 1�� �������� false. 
          System.out.println("ó�� ���̱���. �湮�� �ּż� �����մϴ�.") ; 
    } else { 
          System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.") ; 
    } 
    System.out.println("�湮Ƚ���� " + ++visitCount + "�� �Դϴ�."); 
  }

}