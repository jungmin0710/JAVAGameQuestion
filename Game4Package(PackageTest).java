/*

패키지는 다른 언어에서의 라이브러리를 말한다. 자바에서 기본적으로 제공되는 패키지도 있고 스스로 만들어쓰는 패키지가 있다.
import java.util.* => 패키지 내의 모든 클래스들을 사용한다.
패키지 이름은 디렉토리 경로와 비슷하거나 같다. (경로표현을 할 때 \는 리눅스와 유닉스에서 /로 표현한다)

*/

import MyPackage.*;// 패키지 사용 선언

public class PackageTest {

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    // MyPackage 내에 있는 MyClass 사용

    mc.myMethod();
  }

}
