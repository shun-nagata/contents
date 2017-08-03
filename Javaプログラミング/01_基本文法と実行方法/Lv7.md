# 基本文法と実行方法 Lv7

----

### 教材制作者へ

特に指示の無い場合は**入力問題**とする。

----

## Q1

5回入力した整数を配列に格納し、その合計値を求めるプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  int counter = 5;
  int[] x = [ 1 ] [ 2 ];

  Scanner keyInput = new Scanner(System.in);

  [ 3 ] (int i = 0; i < [ 4 ]; i++) {
    System.out.print(i + "番目:");
    x[i] = keyInput.[ 5 ]();
  }

  keyInput.close();

  int total = 0;
  [ 5 ] ([ 7 ] xi [ 8 ] [ 9 ]) {
    total = total + xi;
  }

  System.out.println("合計は" + total);
}
```
```
実行結果
0番目:1
1番目:2
2番目:3
3番目:4
4番目:5
合計は15
```

## ヒント1

ある型の要素が入る空の配列を宣言するためには、以下の様に記述する。

```java
// 要素数は、数値や、数値を表す変数を用いる
型[] 変数名 = new 型[要素数];
```

## ヒント2

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント3

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

答え

1. new
2. int[counter]
3. for
4. counter
5. nextInt
6. for
7. int
8. :
9. x


## Q2

5回入力した小数を配列に格納し、その平均値を求めるプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  int counter = 5;
  float[] x = [ 1 ] [ 2 ];

  Scanner keyInput = new Scanner(System.in);

  [ 3 ] (int i = 0; i < [ 4 ]; i++) {
    System.out.print(i + "番目:");
    x[i] = keyInput.[ 5 ]();
  }

  keyInput.close();

  float total = 0;
  [ 6 ] ([ 7 ] xi [ 8 ] [ 9 ]) {
    total = total + xi;
  }

  float avg = total / x.length;

  System.out.println("平均は" + avg);
}
```
```
実行結果
0番目:1
1番目:2
2番目:3
3番目:4
4番目:5
平均は3.0
```

## ヒント1

ある型の要素が入る空の配列を宣言するためには、以下の様に記述する。

```java
// 要素数は、数値や、数値を表す変数を用いる
型[] 変数名 = new 型[要素数];
```

## ヒント2

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント3

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

答え

1. new
2. float[counter]
3. for
4. counter
5. nextFloat
6. for
7. float
8. :
9. x


## Q3

正の整数を入力すると、それまでに入力された値の合計を表示するプログラムになるよう、空欄を埋めなさい。入力と合計の表示は繰り返し行われ、負の値をいれると、プログラムは終了することとする。

```
public static void main(String[] args) {
  Scanner keyInput = [ 1 ] [ 2 ]([ 3 ].[ 4 ]);
  int sum = 0;

  [ 5 ] (true) {
    System.out.print("入力:");
    int x = keyInput.[ 6 ]();
    [ 7 ] (x [ 8 ] 0) {
      [ 9 ];
    }
    sum = sum + x;
    System.out.println("これまでの合計:" + sum);
  }

  keyInput.close();
}
```
```
実行結果
入力:1
これまでの合計:1
入力:2
これまでの合計:3
入力:3
これまでの合計:6
入力:4
これまでの合計:10
入力:-1
```

## ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント2

ある条件まで繰り返す反復処理には、while が利用できる。

```java
while (論理型の値や条件式) {
    条件が真であれば行わせる処理
    // while文自体を中断するときには、break 文を使うこともできる
}
```

## ヒント3

while 文に true を与えると、中断しない限りブロック内の処理が反復される。

そのため、中断条件に合わせて break 文を実行し、whileブロックを中断する。

答え

1. new
2. Scanner
3. System
4. in
5. while
6. nextInt
7. if
8. \<
9. break

## Q4

正の整数を入力すると、それまでに入力された値の最大値を表示するプログラムになるよう、空欄を埋めなさい。入力と最大値の表示は繰り返し行われ、負の値をいれると、プログラムは終了することとする。

```
public static void main(String[] args) {
  Scanner keyInput = [ 1 ] Scanner([ 2 ].[ 3 ]);
  int max = 0;

  [ 4 ] (true) {
    System.out.print("入力:");
    int x = keyInput.[ 5 ]();
    [ 6 ] (x < 0) {
      [ 7 ];
    }
    [ 8 ] (max == 0 [ 9 ] max < x) {
      max = x;
    }
    System.out.println("これまでの最大値:" + max);
  }
}
```
```
実行結果
入力:4
これまでの最大値:4
入力:5
これまでの最大値:5
入力:3
これまでの最大値:5
入力:8
これまでの最大値:8
入力:2
これまでの最大値:8
入力:-1
```

## ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント2

ある条件まで繰り返す反復処理には、while が利用できる。

```java
while (論理型の値や条件式) {
    条件が真であれば行わせる処理
    // 中断するときには、break 文を使うこともできる
}
```

## ヒント3

while 文に true を与えると、中断しない限りブロック内の処理が反復される。

そのため、中断条件に合わせて break 文を実行し、whileブロックを中断する。

答え

1. new
2. System
3. in
4. while
5. nextInt
6. if
7. break
8. if
9. ||

## Q5

正の整数を入力すると、それまでに入力された値の最小値を表示するプログラムになるよう、空欄を埋めなさい。入力と最小値の表示は繰り返し行われ、負の値をいれると、プログラムは終了することとする。


```
public static void main(String[] args) {
  Scanner keyInput = [ 1 ] Scanner([ 2 ].[ 3 ]);
  int min = 0;

  while ([ 4 ]) {
    System.out.print("入力（負の値をいれるまで反復）:");
    int x = keyInput.[ 5 ]();
    if (x [ 6 ] 0) {
      [ 7 ];
    }
    if (min [ 8 ] 0 [ 9 ] min > x) {
      min = x;
    }
    System.out.println("これまでの最小値:" + min);
  }
}
```
```
実行結果
入力:4
これまでの最小値:4
入力:5
これまでの最小値:4
入力:3
これまでの最小値:3
入力:8
これまでの最小値:3
入力:2
これまでの最小値:2
入力:-1
```

## ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント2

ある条件まで繰り返す反復処理には、while が利用できる。

```java
while (論理型の値や条件式) {
    条件が真であれば行わせる処理
    // 中断するときには、break 文を使うこともできる
}
```

## ヒント3

while 文に true を与えると、中断しない限りブロック内の処理が反復される。

そのため、中断条件に合わせて break 文を実行し、whileブロックを中断する。

答え

1. new
2. System
3. in
4. true
5. nextInt
6. \<
7. break
8. ==
9. ||

## Q6

8回入力した整数を、偶数・奇数に分けて配列に格納し、最後に一覧として表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  int size = 8;
  int[] odd = new [ 1 ];
  int[] even = new [ 2 ];

  Scanner keyInput = new Scanner(System.in);

  for (int i = 0; i < [ 3 ]; i++) {
    System.out.print(i + "番目:");
    int inputted = keyInput.nextInt();
    if (inputted % 2 == 0) {
      [ 4 ] = inputted;
    } else {
      [ 5 ] = inputted;
    }

  }
  keyInput.close();

  System.out.print("偶数は:");
  for (int eveni : [ 6 ]) {
    if (eveni [ 7 ] 0) {
      System.out.print(eveni + ",");
    }
  }
  System.out.println();
  System.out.print("奇数は:");
  for (int oddi : [ 8 ]) {
    if (oddi [ 9 ] 0) {
      System.out.print(oddi + ",");
    }
  }
}
```

```
実行結果
0番目:13
1番目:7
2番目:2
3番目:4
4番目:5
5番目:9
6番目:1
7番目:6
偶数は:2,4,6,
奇数は:13,7,5,9,1,
```

### ヒント1

ある型の要素が入る空の配列を宣言するためには、以下の様に記述する。

```java
// 要素数は、数値や、数値を表す変数を用いる
型[] 変数名 = new 型[要素数];
```

### ヒント2

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

### ヒント3

このプログラムでは、予め長さを決めているので、使わなかった要素は0になる。そのため、0以外の数字を表示する。

答え

1. int[size]
2. int[size]
3. size
4. even[i]
5. odd[i]
6. even
7. !=
8. odd
9. !=

## Q7

整数を入力し、その値を底辺の長さとした三角形を \* で描くプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  Scanner keyInput = [ 1 ] [ 2 ]([ 3 ].[ 4 ]);
  System.out.print("最大幅：");
  int max = keyInput.[ 5 ]();
  keyInput.[ 6 ]();

  for (int xi = 0; xi < [ 7 ]; xi++) {
    int cursor = [ 8 ] + 1;
    for (int ci = 0; ci < [ 9 ]; ci++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
```

```
実行結果
最大幅：7
*
**
***
****
*****
******
*******
```

## ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント2

入力された整数をmaxとすると、最初の行を \* が1つ、最も下の行を \* がmax個になるように反復処理を行えばよい。

## ヒント3

つまり、実行結果の様に、7が入力された場合は、7回反復処理が行われる間に、1, 2, 3, ... 7 と \* の数が増えていく。

答え

1. new
2. Scanner
3. System
4. in
5. nextInt
6. close
7. max
8. xi
9. cursor

## Q8

整数を入力し、その値を底辺の長さとした逆三角形を \* で描くプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  Scanner keyInput = [ 1 ] [ 2 ]([ 3 ].[ 4 ]);
  System.out.print("最大幅：");
  int max = keyInput.[ 5 ]();
  keyInput.[ 6 ]();

  for (int xi = 0; xi < [ 7 ]; xi++) {
    int cursor = max - [ 8 ];
    for (int ci = 0; ci < [ 9 ]; ci++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
```

```
実行結果
最大幅：7
*******
******
*****
****
***
**
*
```

## ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント2

入力された整数をmaxとすると、最初の行を \* がmax個、 最も下の行を \* が1つになるように反復処理を行えばよい。

## ヒント3

つまり、実行結果の様に、7が入力された場合は、7回反復処理が行われる間に、7, 6, 5, ... 1 と \* の数が減っていく。

答え

1. new
2. Scanner
3. System
4. in
5. nextInt
6. close
7. max
8. xi
9. cursor


## Q9

整数で得点を入力すると成績を表示するプログラムになるよう、空欄を埋めなさい。

ただし、91点以上は秀、81点以上は優、71点以上は良、61点以上は可、それ以外は不可とし、負の値を入力するとプログラムは終了することにする。

```
public static void main(String[] args) {
  Scanner keyInput = [ 1 ] [ 2 ]([ 3 ].[ 4 ]);

  while (true) {
    System.out.print("得点：");
    int x = keyInput.nextInt();
    if (x < 0) {
      [ 5 ];
    }
    if(x > 90) {
      System.out.println("秀");
      [ 6 ];
    }
    if(x > 80) {
      System.out.println("優");
      [ 7 ];
    }
     if(x > 70) {
      System.out.println("良");
      [ 8 ];
    }
    if(x > 60) {
      System.out.println("可");
      [ 9 ];
    }
    System.out.println("不可");
  }

  keyInput.close();
}
```

```
実行結果
得点：55
不可
得点：65
可
得点：72
良
得点：88
優
得点：91
秀
得点：-1
終了します
```

### ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

### ヒント2

ある条件まで繰り返す反復処理には、while が利用できる。

```java
while (論理型の値や条件式) {
    条件が真であれば行わせる処理
    // while文自体を中断するときには、break 文を使うこともできる
}
```

### ヒント3

また、反復処理をその時点で中断し、次の反復処理に移りたい場合には、 continue 文を用いる。

答え

1. new
2. Scanner
3. System
4. in
5. break
6. continue
7. continue
8. continue
9. continue


## Q10

入力された日本円を、米ドル、ユーロ、アルゼンチンペソの為替レートを元にいくらになるか計算するプログラムになるよう、空欄をうめなさい。

ただし、国、為替レート、単位の配列要素の並び順はそれぞれ対応していることを前提とし、-1が入力された時はプログラムを終了することとする。


```
public static void main(String[] args) {
  [ 1 ] countries = {"US", "EUR", "ARS"};
  [ 2 ] rates = {0.0090f, 0.0076f, 0.1586f};
  [ 3 ] units = {"ドル", "ユーロ", "ペソ"};

  Scanner keyInput = new Scanner(System.in);

  while (true) {
    System.out.print("日本円：");
    int yen = keyInput.nextInt();
    if (yen < 0) {
      System.out.println("終了します");
      break;
    }
    for(int i = 0; i < countries.length; i++) {
      [ 4 ] money = yen * [ 5 ];
      System.out.println([ 6 ] + "：" + [ 7 ] + [ 8 ];
    }
  }
  
  keyInput.[ 9 ]();
}
```

```
実行結果
日本円：1000
US：9.0ドル
EUR：7.6ユーロ
ARS：158.6ペソ
日本円：1280
US：11.5199995ドル
EUR：9.728001ユーロ
ARS：203.008ペソ
日本円：-1
終了します
```

## ヒント1

ある型の要素が入る空の配列を宣言するためには、以下の様に記述する。

```java
// 要素数は、数値や、数値を表す変数を用いる
型[] 変数名 = new 型[要素数];
```

## ヒント2

ある条件まで繰り返す反復処理には、while が利用できる。

```java
while (論理型の値や条件式) {
    条件が真であれば行わせる処理
    // while文自体を中断するときには、break 文を使うこともできる
}
```

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

## ヒント3

国、為替レート、単位の配列要素の並び順はそれぞれ対応しているという前提条件から、各要素を順番に取り出し、入力値と組み合わせて表示に用いる。

つまり、各配列の1番目の要素（"US", 0.0090f, "ドル"）を使えば、USドルの計算と表示が可能である。

答え
1. String[]
2. float[]
3. String[]
4. float
5. rates[i]
6. countries[i]
7. money
8. units[i]
9. close
