## 코틀린에서 다양한 클래스를 다루는 방법

### 1. Data Class
- 계층 간의 데이터를 전달하기 위한 DTO(Data Transfer Object) 클래스
- 데이터(필드),생성자와 getter,equals,hashCode,toString 메서드가 있다.
- 

### 2. Enum Class
- when은 Enum 클래스 혹은 Sealed Class와 함께 사용하는 경우, 더욱 더 진가를 발휘한다.
- 

### 3. Sealed Class, Interface
- 상속이 가능하도록 추상클래스를 만들어주는 클래스
- 외부에서는 상속받은 클래스를 사용할 수 없다.
- 컴퍼아리 타임 때 하위 클래스의 타입을 모두 기억한다. 즉, 런타임 때 클래스 타입이 추가될 수 없다.
- 하위 클래스는 같은 패키지에 있어야 한다.
- 하위 클래스는 멀티 인스턴스가 가능하다.

