# クラス構造(class_structure)作問上の注意

問題ごとにクラスをまとめるために、便宜上、メインクラスの中にstaticクラスを宣言しているファイルがある。

これを設問に用いる場合は、実際は違うファイルであるという想定で利用する。

例：

```java
class Hoge {
	public static void main(String[] args){
	  Fuga fuga = new Fuga();
	}
	
	static class Fuga {
	  // something...
	}
}
```

のような場合、設問には

```java
class Hoge {
	public static void main(String[] args){
	  Fuga fuga = new Fuga();
	}
}
```

```java
class Fuga {
	  // something...
}
```

の二つのクラスファイルとなるように出題する。

