# クラス設計　Lv7

----

### 教材制作者へ

特に指示の無い場合は**選択問題**とする。

----

## Q1

クラス図に示されたプログラムになるよう、当てはまるものを選びなさい。

ただし、メソッドなどの処理内容は省略している。

```java
public class Player {
  
  [  1  ] String name;
  [  2  ] int vote;

  [  3  ] Player(String name) {
    // 略
  }

  [  4  ] void incrementVote() {
    // 略
  }
  
}

public class Villager [  5  ] Player {

  [  6  ] Villager(String name) {
    // 略
  }

  [  7  ] void poll(Player player) {
    // 略
  }
  
}
```

![Lv7Q01](./img/Lv7Q01.png)

### 1〜7の選択肢

- public
- void
- private
- implements
- extends
- protected
- (記載なし)

### ヒント1

クラス図では、クラス名、フィールド名とその型、メソッド名とその引数・戻り値の型、コンストラクタとその引数、クラス間の関係などが記載される。

フィールド名やメソッド名の記号は、アクセス修飾子を表す。

### ヒント2

- \- private
- \+ public
- \~ package private
- \# protected

### ヒント3

クラス間の関係は線の種類で表す。

中抜き実戦の矢印は、継承を表す。


こたえ

1. private
2. private
3. public
4. public
5. extentds
6. public
7. public


