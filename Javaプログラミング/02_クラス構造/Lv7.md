# クラス構造　Lv7

----

### 教材制作者へ

特に指示の無い場合は**入力問題**とする。

----

## Q1

実行結果が表示されるプログラムになるよう、空欄を埋めなさい。

```java
class Main {
  public static void main(String[] args) {
    Person p1 = new [ 1 ]("Taro", 19);
    Person p2 = new [ 1 ]("Hanako", 20);
    p1.[ 1 ];
    p2.[ 2 ];
  }
}

class Person {
  String name;　//氏名
  int age;　//年齢

  [ 3 ]([ 4 ] name, [ 5 ] age) {
    [ 6 ].name = name;
    [ 6 ].age = age;
  }

  void print() {
    System.out.println(name + "さんは"
        + [ 7 ];
  }

  boolean isAdult() {
    return [ 8 ] >= 20;
  }

  String getMsg() {
    if ([ 9 ]) {
      return "成年";
    }
    return "未成年";
  }
}
```

```
実行結果
Taroさんは未成年
Hanakoさんは成年
```

### ヒント1

コンストラクタ引数を用いると、クラスをインスタンス化する際に、フィールドの値を引数で初期化できる。

```java
class Hoge {
  int x;

  Hoge(int arg0) {
    x = arg0
  }
}
```

```java
// Hoge.xを10にしてインスタンス化する
Hoge hoge = new Hoge(10);
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

実行結果からメソッド順を推測する。

1. print()は、実行結果に近い標準出力をもつ
2. 出力結果には、print()の[ 7 ]に、成年・未成年が当てはまる
3. 成年・未成年を戻り値で返すメソッドはgetMsg()
4. getMsg()は、[ 9 ]の結果を条件に成年・未成年を返す
5. 条件判定に用いるbooleanを戻り値で返すメソッドはisAdult()

つまり、
print() -> getMsg() -> isAdult() の順にメソッドが呼び出されることで、成年・未成年の結果を標準出力に表示できる

答え

1. Person
2. print()
3. Person
4. String
5. int
6. this
7. getMsg()
8. age
9. isAdult()


## Q2

配列の要素を用いて計算するプログラムになるよう、空欄を埋めなさい。また、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Separator obj = new Separator();
    obj.setFlag(true);
    System.out.println([ 1 ].getSum());
  }
}

class Separator {
  int[] array;
  boolean [ 2 ];

  [ 3 ] {
    array = new int[]{5, 8, 10, 12, 3, 11};
  }

  [ 4 ] [ 5 ](boolean flag) {
    [ 6 ].flag = flag;
  }

  [ 7 ] getSum() {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      int item = getItem(i);
      sum = sum + item;
    }
    return sum;
  }

  [ 8 ] getItem(int i) {
    boolean odd = (array[i] % 2 == 0);
    if (odd == flag) {
      return array[i];
    }
    return 0;
  }
}
```

```
実行結果
[ 8 ]
```

### ヒント1

コンストラクタを用いると、クラスをインスタンス化する際に、フィールドの値を初期化できる。

```java
// Hogeがインスタンス化されるときに、xは100に初期化する
class Hoge {
  int x;

  Hoge() {
    x = 100;
  }
}
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

メソッドの戻り値の型と、呼び出し順を読み解く。

のメソッドは、フィールド変数[ 2 ]の値を変更し、戻り値はない（void） 。

getItem(int)はint型の配列の要素を、getSum()はその要素を使った計算結果を戻り値にしているので、戻り値の型はint。

getItem(int)は、配列の要素が奇数であれば要素を、それ以外は0を返す。
getSum()は、その戻り値を合計する。

よって、実行結果は配列arrayの要素のうち、偶数の合計となる。

答え

1. obj
2. flag
3. Separator
4. void
5. setFlag
6. this
7. int
8. int
9. 30

## Q3

配列の要素を用いて計算するプログラムになるよう、空欄を埋めなさい。また、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Separator obj = new Separator();
    obj.setFlag(false);
    System.out.println([ 1 ].getSum());
  }
}

class Separator {
  int[] array;
  boolean [ 2 ];

  [ 3 ] {
    array = new int[]{5, 8, 10, 12, 3, 11};
  }

  [ 4 ] [ 5 ](boolean flag) {
    [ 6 ].flag = flag;
  }

  [ 7 ] getSum() {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      int item = getItem(i);
      sum = sum + item;
    }
    return sum;
  }

  [ 8 ] getItem(int i) {
    boolean odd = (array[i] % 2 == 0);
    if (odd == flag) {
      return array[i];
    }
    return 0;
  }
}
```

```
実行結果
[ 9 ]
```

### ヒント1

コンストラクタを用いると、クラスをインスタンス化する際に、フィールドの値を初期化できる。

```java
// Hogeがインスタンス化されるときに、xは100に初期化する
class Hoge {
  int x;

  Hoge() {
    x = 100;
  }
}
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

メソッドの戻り値の型と、呼び出し順を読み解く。

[ 5 ]のメソッドは、フィールド変数[ 2 ]の値を変更し、戻り値はない（void） 。

getItem(int)はint型の配列の要素を、getSum()はその要素を使った計算結果を戻り値にしているので、戻り値の型はintである。

getItem(int)は、配列の要素が奇数であれば要素を、それ以外は0を返す。
getSum()は、その戻り値を合計する。

よって、実行結果は配列arrayの要素のうち、奇数の合計となる。

答え

1. obj
2. flag
3. Separator
4. void
5. setFlag
6. this
7. int
8. int
9. 19


## Q4

複数人の情報から、条件に合った場合に名前を表示するプログラムになるよう、空欄を埋めなさい。また、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Person[] persons = new Person[]{
      new Person("Taro", 19),
      new Person("Hanako", 20),
      new Person("Hikari", 12),
      new Person("Minato", 22)
    };
    Group group = new Group(persons);
    group.print();
  }
}

class Person {
  String name;
  int age;

  Person(String name, int age) {
    [ 1 ].name = name;
    [ 2 ].age = age;
  }

  [ 3 ] isAdult() {
    return age >= 20;
  }

  [ 4 ] printName() {
    System.out.println(name);
  }
}

class Group {
  Person[] persons;

  Group([ 5 ] persons) {
    [ 6 ].persons = persons;
  }

  [ 7 ] print() {
    for (Person pi : persons) {
      if (pi.isAdult()) {
        pi.printName();
      }
    }
  }
}
```

```
実行結果
[ 8 ]
[ 9 ]
```

## ヒント1

コンストラクタ引数を用いると、クラスをインスタンス化する際に、フィールドの値を引数で初期化できる。

```java
class Hoge {
  int x;

  Hoge(int arg0) {
    x = arg0
  }
}
```

```java
// Hoge.xを10にしてインスタンス化する
Hoge hoge = new Hoge(10);
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

メソッド内部の処理や呼び出し元のコードから、メソッドの戻り値の型を推測する。

PersonクラスのisAdult()は、式の結果を返している。比較演算子の結果はbool値であるため、booleanを返す。
printName()は、フィールド変数nameを標準出力に表示し、戻り値はない（void）。

Groupクラスのprint()は、フィールド変数personsの要素を標準出力に表示し、戻り値はない（void）。

答え

1. this
2. this
3. boolean
4. void
5. Person[]
6. this
7. void
8. Hanako
9. Minato


## Q5

複数人の情報から、条件に合った場合に名前を表示するプログラムになるよう、空欄を埋めなさい。また、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Person[] persons = new Person[]{
      new Person("Taro", 19),
      new Person("Hanako", 20),
      new Person("Hikari", 12),
      new Person("Minato", 22)
    };
    Group group = new Group(persons);
    group.print();
  }
}

class Person {
  String name;
  int age;

  Person(String name, int age) {
    [ 1 ].name = name;
    [ 2 ].age = age;
  }

  [ 3 ] isAdult() {
    return age >= 20;
  }

  [ 4 ] printName() {
    System.out.println(name);
  }
}

class Group {
  Person[] persons;

  Group([ 5 ] persons) {
    [ 6 ].persons = persons;
  }

  [ 7 ] print() {
    for (Person pi : persons) {
      if (!pi.isAdult()) {
        pi.printName();
      }
    }
  }
}
```

```
実行結果
[ 8 ]
[ 9 ]
```

## ヒント1

コンストラクタ引数を用いると、クラスをインスタンス化する際に、フィールドの値を引数で初期化できる。

```java
class Hoge {
  int x;

Hoge(int arg0) {
    x = arg0
  }
}
```

```java
// Hoge.xを10にしてインスタンス化する
Hoge hoge = new Hoge(10);
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

メソッド内部の処理や呼び出し元のコードから、メソッドの戻り値の型を推測する。

PersonクラスのisAdult()は、式の結果を返している。比較演算子の結果はbool値であるため、booleanを返す。
printName()は、フィールド変数nameを標準出力に表示し、戻り値はない（void）。

Groupクラスのprint()は、フィールド変数personsの要素を標準出力に表示し、戻り値はない（void）。

答え

1. this
2. this
3. boolean
4. void
5. Person[]
6. this
7. void
8. Taro
9. Hikari


## Q6 

----

### 教材制作者へ

回答欄7〜9は選択式にしてください。選択肢：不明, 合格, 不合格

------

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Student[] students = new Student[]{
      new Student("Taro", 80),
      new Student("Hanako", 92),
      new Student("Hikari", 79)
    };

    Grader grader = new Grader();
    for (Student student : students) {
      grader.setScore(student);
    }

    for (Student student : students) {
      student.print();
    }
  }
}

class Grader {

  [ 1 ] [ 2 ](Student student) {
    if (student.score > 80) {
      [ 3 ].rank = "合格";
    } else {
      [ 3 ].rank = "不合格";
    }
  }
}

class Student {
  String name;
  int score;
  String rank;

  [ 4 ](String name, int score) {
    [ 5 ].name = name;
    [ 5 ].score = score;
    [ 5 ].rank = "不明";
  }

  [ 6 ] print() {
    System.out.println(name + "は、" + rank);
  }

}
```

```
実行結果
Taroは、[ 7 ]
Hanakoは、[ 8 ]
Hikariは、[ 9 ]
```

### ヒント1

コンストラクタ引数を用いると、クラスをインスタンス化する際に、フィールドの値を引数で初期化できる。

```java
class Hoge {
  int x;

  Hoge(int arg0) {
    x = arg0
  }
}
```

```java
// Hoge.xを10にしてインスタンス化する
Hoge hoge = new Hoge(10);
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

インスタンスを格納する参照型の変数・引数は、メモリ上に生成されたインスタンス自体を指し示す。

[ 2 ]メソッドのstudent引数は、呼び出し元から渡されたStudent型の配列の要素を参照する。

したがって、[ 2 ]メソッドの中で行われるフィールド変数rankへの変更は、配列の要素（Taro, Hanako, HikariのStudentインスタンス）それぞれに行われることになる。

答え

1. void
2. setScore
3. student
4. Student
5. this
6. void
7. 不合格
8. 合格
9. 不合格

## Q7

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Robot[] robots = new Robot[]{
      new Robot(100, 5),
      new Robot(101, 1),
      new Robot(102, 4)
    };

    Feeder feeder = new Feeder();
    feeder.feed(robots);

    for (Robot robot : robots) {
      robot.print();
    }
  }
}

class Feeder {
  [ 1 ] [ 2 ](Robot[] robots) {
    for (int i = 0; i < robots.length; i++) {
      Robot robot = robots[i];
      if (robot.energy < 4) {
        robot = new Robot(robot.number, 5);
      }
    }
  }
}

class Robot {
  int number;
  int energy;

  [ 3 ](int number, int energy) {
    [ 4 ].number = number;
    [ 5 ].energy = energy;
  }

  [ 6 ] print() {
    System.out.println(number + "号ロボットの燃料は、" + energy);
  }
}
```

```
100号ロボットの燃料は、[ 7 ]
101号ロボットの燃料は、[ 8 ]
102号ロボットの燃料は、[ 9 ]
```

### ヒント1

コンストラクタ引数を用いると、クラスをインスタンス化する際に、フィールドの値を引数で初期化できる。

```java
class Hoge {
  int x;

  Hoge(int arg0) {
    x = arg0
  }
}
```

```java
// Hoge.xを10にしてインスタンス化する
Hoge hoge = new Hoge(10);
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3

インスタンスを参照する変数・引数は、メモリ上に生成されたインスタンス自体を指し示す。

[ 2 ]メソッドのrobots引数は、Robot型の配列を参照している。

[ 2 ]メソッドの中では、robots配列の要素（100, 101, 102のRobotインスタンス）の参照をrobot変数にひとつずつ取り出し、energyが4未満かどうかを調べる。

その上で、energyが4未満であれば、robot変数の参照先を新しいインスタンスに置き換える。ただしこの場合は、robot変数の参照先のみが新しいインスタンスに変わるだけで、元々の配列の要素が置き換わることはない。

答え

1. void
2. feed
3. Robot
4. this
5. this
6. void
7. 5
8. 1
9. 4

## Q8

プログラムの空欄を埋め、実行結果を答えなさい。

```java
class Main {
  public static void main(String[] args) {
    Robot[] robots = new Robot[]{
      new Robot(100, 5),
      new Robot(101, 1),
      new Robot(102, 4)
    };

    Feeder feeder = new Feeder();
    feeder.feed(robots);

    for (Robot robot : robots) {
      robot.print();
    }
  }
}

class Feeder {
  [ 1 ] [ 2 ](Robot[] robots) {
    for (int i = 0; i < robots.length; i++) {
      Robot robot = robots[i];
      if (robot.energy < 4) {
        robots[i] = new Robot(robot.number, 5);
      }
    }
  }
}

class Robot {
  int number;
  int energy;

  [ 3 ](int number, int energy) {
    [ 4 ].number = number;
    [ 5 ].energy = energy;
  }

  [ 6 ] print() {
    System.out.println(number + "号ロボットの燃料は、" + energy);
  }
}
```

```
100号ロボットの燃料は、[ 7 ]
101号ロボットの燃料は、[ 8 ]
102号ロボットの燃料は、[ 9 ]
```

### ヒント1

コンストラクタ引数を用いると、クラスをインスタンス化する際に、フィールドの値を引数で初期化できる。

```java
class Hoge {
  int x;

  Hoge(int arg0) {
    x = arg0
  }
}
```

```java
// Hoge.xを10にしてインスタンス化する
Hoge hoge = new Hoge(10);
```

### ヒント2

フィールド変数と引数が同名の場合には、thisキーワードを用いて両者を区別できる。

```java
class Hoge {
  int x;

  // this.xはフィールドのx,
  // ただのxは引数のx を表す
  void do(int x) {
    this.x = x;
  }
}
```

### ヒント3


インスタンスを参照する変数・引数は、メモリ上に生成されたインスタンス自体を指し示す。

[ 2 ]メソッドのrobots引数は、Robot型の配列を参照している。

[ 2 ]メソッドの中では、robots配列の要素（100, 101, 102のRobotインスタンス）の参照をrobot変数にひとつずつ取り出し、energyが4未満かどうかを調べる。

その上で、energyが4未満であれば、配列の要素を新しいインスタンスに置き換える。

1. void
2. feed
3. Robot
4. this
5. this
6. void
7. 5
8. 5
9. 4
