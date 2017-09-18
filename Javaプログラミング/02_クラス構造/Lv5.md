# クラス構造　Lv5

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

## Q5

----

### 教材制作者へ

回答欄7は選択式にしてください。

選択肢

- Taroは不明
- Taroは合格
- Taroは不合格

----

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    TestResult result = new TestResult();
    result.[ 1 ] = "Taro";
    result.[ 2 ] = 75;
    String msg = result.[ 3 ](75);
    System.out.println(msg);
  }
}

class TestResult {
  String [ 4 ];
  int [ 5 ];

  [ 6 ] decide(int reference) {
    if (reference < 0) {
      return name + "は不明";
    }
    if (point > reference) {
      return name + "は合格";
    }
    return name + "は不合格";
  }
}
```

```
実行結果
[ 7 ]
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

インスタンスのフィールドやメソッドは、ピリオドを用いて利用できる

```java
// hoge変数が参照するインスタンスのfooフィールドの値を利用する
hoge.foo;

// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

### ヒント3

decideメソッドの条件分岐処理から、フィールド変数はname, pointである。

設問の例では、pointは75, referenceも75となるため、decideメソッドの戻り値は name + "は不合格" が当てはまる。

答え

1. name
2. point
3. decide
4. name
5. point
6. String
7. Taroは不合格

## Q6

----

### 教材制作者へ

回答欄7は選択式にしてください。

選択肢

- Taroは不明
- Taroは合格
- Taroは不合格

----

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    TestResult result = new TestResult();
    result.[ 1 ] = "Taro";
    result.[ 2 ] = 75;
    String msg = result.[ 3 ](75);
    System.out.println(msg);
  }
}

class TestResult {
  String [ 4 ];
  int [ 5 ];

  [ 6 ] decide(int reference) {
    if (reference < 0) {
      return name + "は不明";
    }
    if (point > reference) {
      return name + "は合格";
    }
    return name + "は不合格";
  }
}
```

```
実行結果
[ 7 ]
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

インスタンスのフィールドやメソッドは、ピリオドを用いて利用できる

```java
// hoge変数が参照するインスタンスのfooフィールドの値を利用する
hoge.foo;

// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

### ヒント3

decideメソッドの条件分岐処理から、フィールド変数はname, pointである。

設問の例では、pointは75, referenceは-80となるため、decideメソッドの戻り値は name + "は不明" が当てはまる。

答え

1. name
2. point
3. decide
4. name
5. point
6. String
7. Taroは不明

## Q7

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Calculator calc = [ 1 ] Calculator();
    calc.x = 5;
    calc.y = 2;
    float ans = calc.[ 2 ];
    System.out.println(ans);
  }
}

class Calculator {
  [ 3 ] x;
  [ 4 ] y;

  float divide() {
    if (y != 0) {
      return [ 5 ] x / y;
    }
    return 0.0F;
  }
}
```

```
実行結果
[ 6 ]
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

インスタンスのフィールドやメソッドは、ピリオドを用いて利用できる

```java
// hoge変数が参照するインスタンスのfooフィールドの値を利用する
hoge.foo;

// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

### ヒント3

Calculatorクラスのフィールド変数 x, yには整数が代入されているため、x,yの型は int 型である。

divideメソッドの戻り値はfloatのため、型変換（キャスト）が必要である。　float型に変換したxをyで割り算し、5.0/2が実行結果の式となる。

答え

1. new
2. divide()
3. int
4. int
5. float
6. 2.5

## Q7

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Calculator calc = [ 1 ] Calculator();
    calc.x = 8;
    calc.y = 0;
    float ans = calc.[ 2 ];
    System.out.println(ans);
  }
}

class Calculator {
  [ 3 ] x;
  [ 4 ] y;

  float divide() {
    if (y != 0) {
      return [ 5 ] x / y;
    }
    return 0.0F;
  }
}
```

```
実行結果
[ 6 ]
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

インスタンスのフィールドやメソッドは、ピリオドを用いて利用できる

```java
// hoge変数が参照するインスタンスのfooフィールドの値を利用する
hoge.foo;

// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

### ヒント3

Calculatorクラスのフィールド変数 x, yには整数が代入されているため、x,yの型は int 型である。

divideメソッドの戻り値はfloatのため、型変換（キャスト）が必要である。

yは0であるため、実行結果は0となる。

答え

1. new
2. divide()
3. int
4. int
5. float
6. 0.0

