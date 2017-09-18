# クラス構造　Lv4

----

### 教材制作者へ

特に指示の無い場合は**入力問題**とする。

----

## Q1
プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Calculator calc = [ 1 ] [ 2 ];
    float ans = calc.divide(7, 0);
    System.out.println(ans);
  }
}

[ 3 ] Calculator {
  [ 4 ] [ 5 ](int x, int y) {
    if (y != 0) {
      return ([ 6 ]) x / y;
    }
    return 0.0F;
  }
}
```

```
実行結果
[ 7 ]
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. Calculator()
3. class
4. float
5. divide
6. float
7. 0.0

## Q2

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Calculator calc = [ 1 ] [ 2 ];
    float ans = calc.divide(7, 2);
    System.out.println(ans);
  }
}

[ 3 ] Calculator {
  [ 4 ] [ 5 ](int x, int y) {
    if (y != 0) {
      return ([ 6 ]) x / y;
    }
    return 0.0F;
  }
}
```

```
実行結果
3.5
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. Calculator()
3. class
4. float
5. divide
6. float
7. 3.5


## Q3

年齢が成年か未成年かを判定するプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
    Checker checker = [ 1 ] [ 2 ];
    int age = 18;
    boolean adult = checker.isAdult(age);
    if ([ 3 ]) {
      System.out.println(age + "歳は成年");
    } else {
      System.out.println(age + "歳は未成年");
    }
  }
}

[ 4 ] Checker {
  [ 5 ] [ 6 ](int age) {
    return age >= 20;
  }
}
```

```
実行結果
18歳は未成年
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. Checker
3. adult
4. class
5. boolean
6. isAdult
7. int

## Q4

年齢が成年か未成年かを判定するプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
    Checker checker = [ 1 ] [ 2 ];
    int age = 21;
    boolean minor = checker.[ 3 ];
    if ([ 4 ]) {
      System.out.println(age + "歳は未成年");
    } else {
      System.out.println(age + "歳は成年");
    }
  }
}

[ 5 ] Checker {
  [ 6 ] isMinor([ 7 ] age) {
    return age < 20;
  }
}
```

```
実行結果
21歳は成年
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. Checker()
3. isMinor(age)
4. minor
5. class
6. boolean
7. int

## Q5 

配列の合計を求めて表示するプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
    int[] nums = {6, 9, 3, 1};
    Calculator calc = [ 1 ] [ 2 ];
    int ans = calc.[ 3 ];
    System.out.println(ans);
  }
}

[ 4 ] Calculator {
  [ 5 ] sum([ 6 ] nums) {
    int ans = 0;
    for (int num : nums) {
      ans = ans + num;
    }
    return ans;
  }
}
```

```
実行結果
19
```
### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. Calculator()
3. class
4. sum(nums)
5. int
6. int[]


## Q6

配列の合計を求めて表示するプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
  	int[] nums = {8, 2, 4, 6, 9};
  	Calculator calc = [ 1 ] [ 2 ];
  	calc.print(nums);
  }
}

[ 3 ] Calculator {
  [ 4 ] sum(int[] nums) {
  	int ans = 0;
  	for (int num : nums) {
  		ans = ans + num;
  	}
  	return ans;
  }

  [ 5 ] print(int[] nums) {
  	int ans = [ 6 ];
  	System.out.println(ans);
  }
}
```

```
実行結果
29
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. Calculator()
3. class
4. int
5. void
6. sum(nums)

## Q7

標準入力（キーボード）から入力された数値を表示するプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
    KeyInputter inputter = [ 1 ] [ 2 ];
    int num = inputter.[ 3 ];
    System.out.println("入力値は" + num);
  }
}

[ 4 ] KeyInputter {
  [ 5 ] getInput() {
    Scanner keyInput = new Scanner(System.in);
    int num = keyInput.nextInt();
    keyInput.close();
    return num;
  }
}
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. KeyInputter()
3. getInput()
4. class
5. int


## Q8

標準入力（キーボード）から入力された数値を表示するプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
    DefaultIO io = [ 1 ] [ 2 ];
    io.[ 3 ];
  }
}

[ 4 ] DefaultIO {
  [ 5 ] getNum() {
    Scanner keyInput = new Scanner(System.in);
    int num = keyInput.nextInt();
    keyInput.close();
    return num;
  }

  [ 6 ] print() {
    int ans = getNum();
    System.out.println("入力値は" + ans);
  }
}
```

### ヒント1

Java言語では、プログラムをクラスに分割して作成できる。

クラスに分割したプログラムは、クラスの内容をメモリ上に生成した「インスタンス」を使うことで実行・利用することができる。

クラスからインスタンスを生成することをインスタンス化という。

```java
// Hogeクラスのインスタンス化を行い、
// メモリ上のインスタンスをhoge変数で
// 参照できるようにする
Hoge inst1 = new Hoge();
```

### ヒント2

インスタンスの機能は、メソッドとして作成する。
メソッドには、処理に必要な引数や、呼び出し元へ返す処理結果（戻り値）の型を指定することができる。

```java
class Hoge {
  // 整数型のa引数を使い、String型の結果を返す
  // メソッド
  String bar(int a) {
    String msg = "引数の値は" + a;
    return msg;
  }
}
```

なお、引数が必要ない場合は、引数を省略できる。

戻り値が必要無い場合は、voidを型に指定する。


### ヒント3

インスタンスのメソッドは、ピリオドを用いて利用できる。

```java
// hoge変数が参照するインスタンスのbarメソッドを利用する
hoge.bar();
```

同じインスタンス内のメソッドは、メソッド名や引数を用いて利用できる。

答え

1. new
2. DefaultIO()
3. print()
4. class
4. int
5. void
