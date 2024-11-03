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
- 부생성자 보다는 default

### 3) 커스텀 getter, setter
- 