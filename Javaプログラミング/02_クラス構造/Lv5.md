# クラス構造　Lv6

----

### 教材制作者へ

特に指示の無い場合は**入力問題**とする。

----

## Q1

Gakusekiクラスのインスタンスが、正しい形式の学籍番号（例:b1970010）の文字列だけを保持できる機能をもつよう、空欄を埋めなさい。

なお、問題文中の "\^b[0-9]{7}" は、「学籍番号として正しい形式（頭文字bのあとに数字が7桁）」を表す正規表現パターンである。

Stringクラスのmatchesメソッドは、Stringインスタンスが、引数に渡された正規表現パターンにあてはまる場合にtrueを、それ以外にfalseを返す。

```java
class Gakuseki {

  [ 1 ] [ 2 ];

  void setBangou(String arg0) {
    String regex = "^b[0-9]{7}";
    if (![ 3 ].matches(regex)) {
      System.out.println("学籍番号のパターンに一致しない");
      [ 4 ];
    }
    bangou = [ 5 ];
  }
}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

設問のプログラムは、まず、正規表現パターンを使って、setBangouメソッドの引数の文字列インスタンスが、学籍番号の形式として正しいか判定する。

引数が学籍番号の形式として正しい場合は、フィールドに引数を格納する。正しくない場合は、処理を中断し、フィールドに引数を格納してはいけない。

### ヒント3

setBangouメソッドの返値の型がvoidのため、return;でメソッドの処理が中断されることになる。

こたえ

1. String
2. bangou
3. arg0
4. return
5. arg0


## Q2

Gakusekiクラスのインスタンスが、正しい形式の学籍番号（例:b1970010）の文字列だけを保持できる機能をもつよう、空欄を埋めなさい。

なお、Stringクラスのlengthメソッドは、文字数をint型で返す。

StringクラスのstartsWithメソッドは、Stringインスタンスの頭文字が、引数の文字列で始まる場合にtrueを、それ以外にfalseを返す。

```java
class Gakuseki {

  [ 1 ] [ 2 ];

  void setBangou(String arg0) {
    int length = arg0.length();
    if (length != 8) {
      System.out.println("文字数が一致しない");
      [ 3 ];
    }
    boolean flag = arg0.startsWith("b");
    if (!flag) {
      System.out.println("bから始まっていない");
      [ 4 ];
    }
    bangou = [ 5 ];
  }
}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

設問のプログラムは、まず、引数の文字列の長さが、学籍番号の形式として正しいか判定する。次に、引数の文字の頭文字が、bから始まっているかどうかを確認する。

### ヒント3

setBangouメソッドの引数に、正しくない長さもしくはbから始まらないインスタンスが渡されたときは、メソッドの処理が中断されることになる。

こたえ

1. String
2. bangou
3. return
4. return
5. arg0


## Q3

Personクラスのインスタンスが、成年・未成年を判定し名前とともに表示する機能をもつよう、空欄を埋めなさい。

```java
class Person {

  String name;
  int age;

  void print() {
    String msg = "";
    if ([ 1 ]) {
      msg = [ 2 ] + "さんは未成年です";
    } else {
      msg = [ 3 ] + "さんは成年です";
    }
    System.out.println(msg);
  }

  [ 4 ] isYoung() {
    return [ 5 ] < 20;
  }
}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

成年・未成年の判定を行う機能は、isYoungメソッドに分離されている。

したがって、printメソッドのif文でisYoungメソッドを呼び出せば、成年・未成年を切り替えて文章を表示できる。

### ヒント3

大小の比較演算子の結果は、bool値である。

答え

1. isYoung()
2. name
3. name
4. boolean
5. age


## Q4

Personクラスのインスタンスが、成年・未成年を判定し名前とともに表示する機能をもつよう、空欄を埋めなさい。

```java
class Person {

  String [ 1 ];
  int [ 2 ];

  [ 3 ] print() {
    String msg = "";
    if (age [ 4 ] 20) {
      msg = name + "さんは成年です";
    } else {
      msg = name + "さんは未成年です";
    }
    System.out.println([ 5 ]);
  }
}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

大小の比較演算子の結果は、bool値である。

### ヒント3

printメソッドは、呼び出し元にreturnする処理がない。

したがって、戻り値の型は void。

答え

1. name
2. age
3. void
4. >=
5. msg

## Q5

Calculatorクラスのインスタンスが、自身の配列要素の合計を計算する機能を持つよう、空欄を埋めなさい。

ただし、配列が参照されていない場合は、合計を0とする。

```java
class Calculator {

  [ 1 ] nums;
  [ 2 ] ans;

  void sum() {
    [ 3 ] = 0;
    if ([ 4 ]) {
      for (int i : nums) {
        ans = ans + i;
      }
    }
  }

  boolean isNotNull() {
    return nums != [ 5 ];
  }

}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

参照型の変数や配列要素が、インスタンスを参照していないことを表す特別な記号を null と呼ぶ。

### ヒント3

Calculatorクラスのインスタンスのフィールド変数numsがnullかどうかをisNotNullメソッドで判定すればよい。

こたえ

1. int[]
2. int
3. ans
4. isNotNull()
5. null

## Q6

学生のテスト結果を表すTestResultクラスのインスタンスが、テストの得点から成績を判定出来る機能をもつように、空欄を埋めなさい。

- 90点より大きい S
- 80点より大きい A
- 70点より大きい B
- 60点より大きい C
- 60点以下 D
- テストに欠席　E

ただし、フィールド変数attendanceはテストに出席しているかどうかを表し、出席はtrue, 欠席はfalseのブール値で表すこととする。

```java
class TestResult {

  String name;
  int point;
  [ 1 ] attendance;

  [ 2 ] decide() {
    if (![ 3 ]) {
      return "E";
    }
    if ([ 4 ] > 90) {
      return "S";
    }
    if ([ 5 ] > 80) {
      return "A";
    }
    if ([ 6 ] > 70) {
      return "B";
    }
    if ([ 7 ] > 60) {
      return "C";
    }
    return "D";
  }

}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

decideメソッドでは、点数によってA〜Dのテスト結果を文字列で返す。

点数の比較を行うためには、int型のフィールドpointを比較に用いる必要がある。

### ヒント3

attendanceがテストの出席状況をbool値で表し、欠席（false）の場合は "E" を返す必要がある。

答え

1. boolean
2. String
3. point
4. point
5. point
6. point
7. point

## Q7

学生のテスト結果を表すTestResultクラスのインスタンスが、テストの得点と、引数で渡される基準点を使って合否を判定出来る機能をもつように、空欄を埋めなさい。

- テストの得点が基準点より大きい　"合格"
- テストの得点が基準点より小さい　"不合格"
- 基準点が0よりも小さい　"不明"

```java
class TestResult {

  String name;
  int point;

  [ 1 ] decide([ 2 ] reference) {
    if ([ 3 ] < 0) {
      return "不明";
    }
    if ([ 4 ] > reference) {
      return "合格";
    }
    return "不合格";
  }

}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

decideメソッドには、引数referenceがある。問題文からはこれが基準点となるため、条件にあうように、テスト点（数値）を表すフィールド変数と比較する。

### ヒント3

decideメソッドで判定される返値は、文字列である。

答え

1. String
2. int
3. reference
4. point


## Q8

Calculatorクラスのインスタンスが、保持する数値のかけ算、割り算が行える機能をもつように、空欄を埋めなさい。

ただし、分母が0の時、割り算の結果は0を返すこととする。

```java
class Calculator {
  int x;
  int y;

  [ 1 ] multiply() {
    return x * y;
  }

  float divide() {
    if ([ 2 ] != 0) {
      return ([ 3 ]) x / y;
    }
    return [ 4 ];
  }

}
```

### ヒント1

インスタンスの内部では、メソッドの処理にフィールド変数を利用することができる。

```java
class Hoge {
  int x;

  // フィールド変数xの値を表示する
  void do() {
    System.out.println(x);
  }
}
```

### ヒント2

int型の値どうしのかけ算の結果は int型 になる。

### ヒント3

割り算を行うdivideメソッドの返値はfloatのため、割り算の結果をfloat型に変換するキャストが必要である。

答え

1. int
2. y
3. float
4. 0
