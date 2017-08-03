# 基本文法と実行方法 Lv3

----

### 教材制作者へ

特に指示の無い場合は**入力問題**とする。

----

## Q1

32ビットの整数 8 を変数に格納し、この変数の値を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] ans = [ 2 ];
	System.out.println([ 3 ]);
}
```

```
実行結果：
8
```

### ヒント1

32ビット整数を用いるための型は int である。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値) である。

### ヒント3

答え

1. int
2. 8
3. ans


## Q2

64ビットの整数 3000000000L を変数に格納し、この変数の値を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] ans = [ 2 ];
	System.out.println([ 3 ]);
}
```

```
実行結果：
3000000000
```

### ヒント1

64ビット整数を用いるための型は `long` である。

64ビット整数の値には、末尾にL（もしくはl）をつける。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値) である。

### ヒント3

答え

1. long
2. 3000000000L
3. ans


## Q3

32ビット浮動小数点の小数 12.11F を変数に格納し、この変数の値を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] ans = [ 2 ];
	System.out.println([ 3 ]);
}
```

```
実行結果：
12.11
```

### ヒント1

32ビット浮動小数点を用いるための型は `float` である。

32ビット整数の値には、末尾にF（もしくはf）をつける。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値) である。

### ヒント3

答え

1. float
2. 12.11F
3. ans

## Q4

64ビット浮動小数点の小数 34.82D を変数に格納し、この変数の値を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] ans = [ 2 ];
	System.out.println([ 3 ]);
}
```

```
実行結果：
34.82
```

### ヒント1

64ビット浮動小数点を用いるための型は double である。

64ビット整数の値には、末尾にD（もしくはd）をつける。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値) である。

### ヒント3

答え

1. double
2. 34.82D
3. ans

## Q5

文字型でコード値 90 を変数に格納し、この変数の値を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

また、`A` がコード値 65 だとした場合、実行結果は何になるか。あわせて答えなさい。

```
public static void main(String[] args) {
	[ 1 ] ans = [ 2 ];
	System.out.println([ 3 ]);
}
```

```
実行結果：
[ 4 ]
```

### ヒント1

文字を用いるための型は char である。


### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値)である。

### ヒント3

コード値 65 が　A だとした場合、

```
65 A
66 B
67 C
...
90 Z
```

である。

答え

1. char
2. 90
3. ans
4. Z


## Q6 

文字列 Hello Duke! を変数に格納し、この変数の値を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] ans = [ 2 ];
	System.out.println([ 3 ]);
}
```

```
実行結果：
Hello Duke!
```

### ヒント1

文字列を用いるための型は String である。

文字列の値は、ダブルコーテーション（`""`）でくくる。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値) である。

### ヒント3

答え

1. String
2. "Hello Duke!"
3. ans


## Q7

32ビット整数 128 を変数xに格納し、これを32ビット浮動小数点の変数yに変換し格納してから、yを標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] x = 128;
	[ 2 ] y = ([ 3 ]) x;
	System.out.println([ 4 ]);
}
```

```
実行結果：
128.0
```

### ヒント1

32ビット整数を用いるための型は int 、32ビット浮動小数点を用いるための型は float である。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値)である。

### ヒント3

型の変換を行うときには、キャストを行う。キャストは、

(変換後の型) 変換前の型の変数 

という文法になる。

答え

1. int
2. float
3. float
3. y


## Q8

64ビット整数 128L を変数xに格納し、これを64ビット浮動小数点の変数yに変換し格納してから、yを標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] x = 128L;
	[ 2 ] y = ([ 3 ]) x;
	System.out.println([ 4 ]);
}
```

```
実行結果：
128.0
```

### ヒント1

32ビット整数を用いるための型は long 、32ビット浮動小数点を用いるための型は double である。

### ヒント2

標準出力に値を表示する命令は System.out.print(値) もしくは System.out.println(値) である。

### ヒント3

型の変換を行うときには、キャストを行う。キャストは、

(変換後の型) 変換前の型の変数

という文法になる。

答え

1. long
2. double
3. double
3. y


## Q9

論理型の変数 x に真, y に 偽 を格納し、それぞれの変数を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] x = [ 2 ];
	[ 3 ] y = [ 4 ];
	System.out.println(x);
	System.out.println(y);
}
```

```
実行結果：
true
fale
```

### ヒント1

論理型を用いるための型は boolean である。

### ヒント2

論理型で、真は true 、偽は false を用いる。

### ヒント3

答え

1. boolean
2. true
3. boolean
4. false

## Q10

論理型の変数 x に真を格納し、これを偽に変換して変数yに格納してから、それぞれの変数を標準出力に表示するプログラムになるよう、空欄を埋めなさい。

```
public static void main(String[] args) {
	[ 1 ] x = [ 2 ];
	[ 3 ] y = [ 4 ]x;
	System.out.println(x);
	System.out.println(y);
}
```

```
実行結果：
true
fale
```

### ヒント1

論理型を用いるための型は boolean である。

### ヒント2

論理型は、否定演算子 ! を用いることで、真→偽、偽→真に反転できる。

### ヒント3

答え

1. boolean
2. true
3. boolean
4. !
