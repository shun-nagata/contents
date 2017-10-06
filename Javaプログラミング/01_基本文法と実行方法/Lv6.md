# 基本文法と実行方法 Lv6

----

### 教材制作者へ

特に指示の無い場合は**入力問題**とする。

----

## Q1

配列の要素の平均値（32ビット浮動小数点）を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new int[]{18, 71, 3, 63, 43};

  int sum = 0;
  [ 2 ] ([ 3 ] xi [ 4 ] x) {
    sum = sum + xi;
  }

  [ 5 ] ave = ([ 6 ]) sum / x.[ 7 ];

  System.out.println(ave);
}
```

```
実行結果
39.6
```

### ヒント1

32ビット整数型の配列は[]をつけて宣言する。

```java
int[] 変数名 = {要素};
```

### ヒント2

for文を用いて、配列の要素を1つずつ取り出し、合計する。

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

### ヒント3

合計を配列の要素数で割れば、平均値が求められる。

要素数は、`配列.length` で求められる。

問題文の指定から、floatに変換して計算する。

答え

1. int[]
2. for
3. int
4. :
5. float
6. float
7. length

## Q2

配列の要素の平均値（32ビット浮動小数点）を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new float[]{18.91f, 71.52f, 3.65f, 63.32f, 43.71f};

  [ 2 ] sum = 0f;
  [ 3 ] ([ 4 ] xi [ 5 ] x) {
    sum = sum + xi;
  }

  [ 6 ] ave = sum / x.[ 7 ];

  System.out.println(ave);
}
```

```
実行結果
40.221996
```

### ヒント1

32ビット浮動小数点型の配列は、[]をつけて宣言する。

```java
float[] 変数名 = {要素};
```

### ヒント2

for文を用いて、配列の要素を1つずつ取り出し、合計する。

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

### ヒント3

合計を配列の要素数で割れば、平均値が求められる。

要素数は、`配列.length` で求められる。

答え

1. float[]
2. float
3. for
4. :
5. float
6. length


## Q3

配列の要素のうち、最も大きい値を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new int[]{13, 88, 9, 30, 3, 14, 42, 53};

  int max = [ 2 ];
  [ 3 ] (int i = 1; i < x.[ 4 ]; i++) {
     [ 5 ] ([ 6 ] < [ 7 ]) {
      max = [ 8 ];
    }
  }
  
  System.out.println(max);
}
```

```
実行結果
88
```

### ヒント1

32ビット整数型の配列は[]をつけて宣言する。

```java
int[] 変数名 = {要素};
```

### ヒント2

まず、要素の1つめ(0番目の要素)を変数 max に格納する。

for文を用いて、配列の要素を2つめ（1番目の要素）から1つずつ取り出し、maxと比較する。

### ヒント3

取り出した要素がmaxより大きければ、maxを更新する。

答え

1. int[]
2. x[0]
3. for
4. length
5. if
6. max
7. x[i]
8. x[i]


## Q4

配列の要素のうち、最も小さい値を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new int[]{13, 88, 9, 30, 3, 14, 42, 53};

  int min = [ 2 ];
  [ 3 ] (int i = 1; i < x.[ 4 ]; i++) {
     [ 5 ] ([ 6 ] > [ 7 ]) {
      min = [ 8 ];
    }
  }
  
  System.out.println(min);
}
```

```
実行結果
3
```

### ヒント1

32ビット整数型の配列は[]をつけて宣言する。

```java
int[] 変数名 = {要素};
```

### ヒント2

まず、要素の1つめ(0番目の要素)を変数 min に格納する。

for文を用いて、配列の要素を2つめ（1番目の要素）から1つずつ取り出し、minと比較する。

### ヒント3

取り出した要素がminより大きければ、minを更新する。

答え

1. int[]
2. x[0]
3. for
4. length
5. if
6. min
7. x[i]
8. x[i]


## Q5

配列の要素のうち、偶数のみの合計値を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new int[]{76, 30, 48, 60, 89, 47, 4, 43, 13};

  int sum = 0;
  [ 2 ] ([ 3 ] xi [ 4 ] [ 5 ]) {
    [ 6 ] (xi [ 7 ] 2 [ 8 ] 0) {
      sum = sum + xi;
    }
  }

  System.out.println(sum);
}
```

```
実行結果
3
```

### ヒント1

32ビット整数型の配列は[]をつけて宣言する。

```java
int[] 変数名 = {要素};
```

### ヒント2

for文を用いて、配列の要素を1つずつ取り出し、合計する。

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

### ヒント3

取り出した要素が偶数であれば、sumに加える。

答え

1. int[]
2. for
3. int
4. :
5. x
5. if
6. %
7. ==


## Q6

配列の要素のうち、奇数のみの合計値を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new int[]{76, 30, 48, 60, 89, 47, 4, 43, 13};

  int sum = 0;
  [ 2 ] ([ 3 ] xi [ 4 ] [ 5 ]) {
    [ 6 ] (xi [ 7 ] 2 [ 8 ] 0) {
      sum = sum + xi;
    }
  }

  System.out.println(sum);
}
```

```
実行結果
3
```

### ヒント1

32ビット整数型の配列は[]をつけて宣言する。

```java
int[] 変数名 = {要素};
```

### ヒント2

for文を用いて、配列の要素を1つずつ取り出し、合計する。

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

### ヒント3

取り出した要素が奇数であれば、sumに加える。

答え

1. int[]
2. for
3. int
4. :
5. x
5. if
6. %
7. !=


## Q7

ふたつの配列の積を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] x = new int[]{6, 7, 1, 3, 2};
  [ 2 ] y = new int[]{8, 6, 4, 7, 5};

  [ 3 ] ([ 4 ] xi [ 5 ] x) {
    [ 6 ] ([ 7 ] yj [ 8 ] y) {
      int ans = xi * yj;
      System.out.print(ans + ",");
    }
    System.out.println();
  }

}
```

```
実行結果
48, 36, 24, 42, 30, 
56, 42, 28, 49, 35, 
8, 6, 4, 7, 5, 
24, 18, 12, 21, 15, 
16, 12, 8, 14, 10, 
```

### ヒント1

32ビット整数型の配列は[]をつけて宣言する。

```java
int[] 変数名 = {要素};
```

### ヒント2

for文を用いて、配列の要素を1つずつ取り出し、合計する。

配列の要素すべてを用いる場合には、拡張for文が利用できる。

```java
// 反復ごとに、配列の要素が順番に仮変数に代入される。
for (要素の型 仮変数名 : 配列) {
    仮変数を用いる反復処理
}
```

### ヒント3

拡張for文の入れ子を使い、xが1要素分、反復されるごとに、yの要素がすべて反復され、6\*8, 6\*6 ... 6\*5, 7\*8... と計算されるようにする。

答え

1. int[]
2. int[]
3. for
4. int
5. :
5. for
6. int
7. :


## Q8

入力された32ビット整数が10より大きいかどうか表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] keyInput = [ 2 ] [ 3 ]([ 4 ].[ 5 ]);
  System.out.print("整数を入力：");
  [ 6 ] x = keyInput.[ 7 ]();
  keyInput.[ 8 ]();

  if (x [ 9 ] 10) {
    System.out.println(x + "は10より大きい");
  } else {
    System.out.println(x + "は10以下");
  }
}
```

```
実行結果1
整数を入力：5
5は10以下

実行結果2
整数を入力：15
15は10より大きい
```

### ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

### ヒント2

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

### ヒント3

if文を用いて、入力値が10より大きいかどうかの条件分岐を行う。

答え

1. Scanner
2. new
3. Scanner
4. System
5. in
6. int
7. nextInt
8. close
9. \>

## Q9

整数 x と y を入力し、x × 1 ~ x × y の計算結果を表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] keyInput = [ 2 ] [ 3 ]([ 4 ].[ 5 ]);

  System.out.print("xの値は：");
  int x = keyInput.[ 6 ]();

  System.out.print("yの値は：");
  int y = keyInput.[ 7 ]();

  keyInput.close();

  for (int i = 1; i <= [ 8 ]; i++) {
    long ans = x * [ 9 ];
    System.out.println(x + "×" + i + "は：" + ans);
  }
}
```

```
実行結果
xの値は：3
yの値は：5
3×1は：3
3×2は：6
3×3は：9
3×4は：12
3×5は：15
```

### ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

### ヒント2

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

### ヒント3

1 から y まで繰り返すfor分によって、 x × 1 ... x × y を計算する。

答え

1. Scanner
2. new
3. Scanner
4. System
5. in
6. nextInt
7. nextInt
8. y
9. i

## Q10

整数 x と y を入力し、縦を x 、横を y としてできる四角形を \* で表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
  [ 1 ] keyInput = [ 2 ] [ 3 ]([ 4 ].[ 5 ]);
  System.out.print("xの値は：");
  int x = keyInput.[ 6 ]();
  
  System.out.print("yの値は：");
  int y = keyInput.[ 7 ]();
  
  keyInput.close();

  for (int xi = 0; xi < [ 8 ]; xi++) {
    for (int yi = 0; yi < [ 9 ]; yi++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
```

```
実行結果
xの値は：3
yの値は：8
********
********
********
```

### ヒント1

Javaで標準入力を利用する場合には、Scanner と System.in を使う。

### ヒント2

```java
// 整数を入力する
Scanner keyInput = new Scanner(System.in);
int x = keyInput.nextInt();
keyInput.close();
```

### ヒント3

1 から x, 1から y まで繰り返すfor分によって、 \* を描画する。

答え

1. Scanner
2. new
3. Scanner
4. System
5. in
6. nextInt
7. nextInt
8. x
9. y
