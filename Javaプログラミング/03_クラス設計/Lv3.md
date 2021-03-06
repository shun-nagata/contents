# クラス設計　Lv3

----

### 教材制作者へ

特に指示の無い場合は**リスト形式（一問一答）**とする。

----

## Q1

以下の指示に従い、下のクラスをカプセル化しなさい。

- 全てのフィールド変数はクラス外部全てに公開する
- 全てのメソッドはクラス外部全てに公開する

```java
public class Capsule {

  [  1  ] String item1;
  [  2  ] int item2;

  [  3  ] void do1() {
    // 処理は省略
  }

  [  4  ] void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- private
- public
- protected
- (記載なし)

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. public
2. public
3. public
4. public


## Q2

以下の指示に従い、下のクラスをカプセル化しなさい。

- 全てのフィールド変数はクラス内部のみに公開する
- 全てのメソッドはクラス外部全てに公開する

```java
public class Capsule {

  [  1  ] String item1;
  [  2  ] int item2;

  [  3  ] void do1() {
    // 処理は省略
  }

  [  4  ] void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- private
- public
- protected
- (記載なし)

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. private
2. private
3. public
4. public


## Q3

以下の指示に従い、下のクラスをカプセル化しなさい。

- 全てのフィールド変数はクラス内部のみに公開する
- 全てのメソッドは同じパッケージ内まで公開する


```java
public class Capsule {

  [  1  ] String item1;
  [  2  ] int item2;

  [  3  ] void do1() {
    // 処理は省略
  }

  [  4  ] void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- private
- public
- protected
- (記載なし)

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. private
2. private
3. (記載なし)
4. (記載なし)

## Q4

以下の指示に従い、下のクラスをカプセル化しなさい。

- 全てのフィールド変数はサブクラス内部まで公開する
- 全てのメソッドはクラス外部全てに公開する

```java
public class Capsule {

  [  1  ] String item1;
  [  2  ] int item2;

  [  3  ] void do1() {
    // 処理は省略
  }

  [  4  ] void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- private
- public
- protected
- (記載なし)

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. protected
2. protected
3. public
4. public


## Q5

以下の指示に従い、下のクラスをカプセル化しなさい。

- フィールド変数 item1 はクラス内部にのみ公開する
- フィールド変数 item2 はサブクラス内部まで公開する

```java
public class Capsule {

  [  1  ] String item1;
  [  2  ] int item2;

  public Capsule(String item1, int item2) {
    // 処理は省略
  }

  protected void do1() {
    // 処理は省略
  }

  void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- private
- public
- protected
- (記載なし)

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. private
2. protected

## Q6

以下の指示に従い、下のクラスをカプセル化しなさい。

- コンストラクタ はクラス外部まで公開する
- メソッド do1 はサブクラス内部まで公開する
- メソッド do2 はパッケージ内までに公開する



```java
public class Capsule {

  private String item1;
  private int item2;

  [  1  ] Capsule(String item1, int item2) {
    // 処理は省略
  }

  [  2  ] void do1() {
    // 処理は省略
  }

  [  3  ] void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- private
- public
- protected
- (記載なし)

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. public
2. protected
3. (記載なし)

## Q7

以下のプログラムのカプセル化の状況を答えなさい。

- フィールド変数 item1 は [ 1 ] 公開する
- フィールド変数 item2 は [ 2 ] 公開する

```java
public class Capsule {

  private String item1;
  protected int item2;

  public Capsule(String item1, int item2) {
    // 処理は省略
  }

  protected void do1() {
    // 処理は省略
  }

  void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- クラス内部のみに
- サブクラス内部まで
- 同じパッケージ内まで
- クラス外部全てに

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. クラス内部のみに
2. サブクラス内部まで

## Q8

以下のプログラムのカプセル化の状況を答えなさい。

- コンストラクタ は [ 1 ] 公開する
- メソッド do1 は [ 2 ] 公開する
- メソッド do2 は [ 3 ] 公開する

```java
public class Capsule {

  private String item1;
  private int item2;

  public Capsule(String item1, int item2) {
    // 処理は省略
  }

  protected void do1() {
    // 処理は省略
  }

  void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- クラス内部のみに
- サブクラス内部まで
- 同じパッケージ内まで
- クラス外部全てに

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. クラス外部全てに
2. サブクラス内部まで
3. 同じパッケージ内まで

## Q9

以下のプログラムのカプセル化の状況を答えなさい。

- フィールド変数 item1 は [ 1 ] 公開する
- フィールド変数 item2 は [ 2 ] 公開する


```java
public class Capsule {

  protected String item1;
  protected int item2;

  Capsule(String item1, int item2) {
    // 処理は省略
  }

  void do1() {
    // 処理は省略
  }

  private void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- クラス内部のみに
- サブクラス内部まで
- 同じパッケージ内まで
- クラス外部全てに

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

private は、クラス内部まで公開される。

### ヒント3

protected は、サブクラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. サブクラス内部まで
2. サブクラス内部まで

## Q10

以下のプログラムのカプセル化の状況を答えなさい。

- コンストラクタ は [ 1 ] 公開する
- メソッド do1 は [ 2 ] 公開する
- メソッド do2 は [ 3 ] 公開する

```java
public class Capsule {

  protected String item1;
  protected int item2;

  Capsule(String item1, int item2) {
    // 処理は省略
  }

  void do1() {
    // 処理は省略
  }

  private void do2() {
    // 処理は省略
  }

}
```

### 選択肢

#### 全て

- クラス内部のみに
- サブクラス内部まで
- 同じパッケージ内まで
- クラス外部全てに

### ヒント1

カプセル化は、アクセス修飾子を使って行う。

アクセス修飾子の記載がないものは、同じパッケージ内まで公開される。

### ヒント2

protected は、サブクラス内部まで公開される。

### ヒント3

private は、クラス内部まで公開される。

public は、クラス外部全てに公開される。

答え

1. 同じパッケージ内まで
2. 同じパッケージ内まで
3. クラス内部のみに
