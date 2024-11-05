## 코틀린에서 클래스를 다루는 방법

### 1) 클래스와 프로퍼티
- 프로퍼티 = 필드 + getter + setter
- 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다.
- 자바 클래스에 대해서도 .필드로 getter,setter를 사용한다.

### 2) 생성자와 init
- 주생성자(primary constructor)는 반드시 존재해야한다.
- 단, 주생성자에 파라미터가 하나도 없다면 생략가능!
- 부생성자(secondary constructor)는 있을 수도 있고, 없을 수도 있다. 
- 최종적으로 주생성자를 this로 호출해야한다. body를 가질 수 있다.
- 코틀린에서 필드를 만들면 getter와 필요에 따라 setter가 자동으로 생긴다.
    - 때문에 이를 프로퍼티라고 부른다.
- 코틀린에서는 주생성자가 필수이다.
- 코틀린에서는 constructor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
- 단, default parameter나 정적 팩토리 메소드를 추천한다.

### 3) 커스텀 getter, setter
- 실제 메모리에 존재하는 것과 무관하게 custom getter와 custom setter를 만들 수 있다.
- custom getter,custom setter에서 무한루프를 막기 위해 field라는 키워드를 사용한다.이를 backing field라고 부른다.
