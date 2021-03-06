# データモデルとDBMS Lv1

## Q1

データを集中的に整理・蓄積し，このデータを検索することや共有することができるコンピュータ上の仕組みはどれか。

ア　データベース<br>
イ　データモデル<br>
ウ　データセンター<br>

### ヒント1

データセンターとは，様々な情報機器を配備し，データ通信などを行えるよう運用できるように特化された施設のことである。

### ヒント2

データモデルとは，データを格納・利用するための論理的な規約や項目を文章化などの手段で表現できるものである。

### ヒント3

データベースは，集中的にデータを整理・蓄積する形で管理でき，管理されたデータを検索・共有することができる仕組みである。

答え：ア

## Q2

データを格納したり利用するための論理的な規約や項目をまとめて表現したものはどれか。

ア　コンパクトディスク<br>
イ　フローチャート<br>
ウ　データモデル<br>

### ヒント1

コンパクトディスクとは，デジタルデータを記録するためのメディアのことである。

### ヒント2

フローチャートとは，処理の流れを箱や矢印といった記号で書き表せる図である。

データモデルとは，データを格納・利用するための論理的な規約や項目を文章化などの手段で表現できるものである。

### ヒント3

答え：ウ

## Q3

次の文章が正しければ○を，誤っていれば×を選びなさい。

「データベースは，複数のユーザやプログラムがデータを共有できる」

- ○
- ×

### ヒント1

データベースでは，データを集中的に整理・蓄積することや，このデータを検索・共有することができる。

### ヒント2

人間だけでなく，プログラムやアプリケーションであっても，データベース上のデータを相互に利用することができる。

### ヒント3

答え：○

## Q4

次の文章が正しければ○を，誤っていれば×を選びなさい。

「データベースでは，アクセス管理を用いた不正アクセスの防止ができる」

- ○
- ×

### ヒント1

データベースは，複数の利用者が同時に利用することができる。

### ヒント2

利用者に権限を割り当て，データベースにアクセスして行える操作を制限できる機密保持機能がある。

### ヒント3

答え：○


## Q5

次の文章が正しければ○を，誤っていれば×を選びなさい。

「データベースは，障害が発生して停止したときも，ログファイルなどから停止直前のデータの状態に戻すことができる障害回復機能をもつ」

- ○
- ×

### ヒント1

データベースには，データの記録が中断された場合にも，データの整合性を保つ一貫性の性質がある。

### ヒント2

データベースには，一度記録されたデータは障害などで変更されない保持できる永続性の性質がある。


### ヒント3

答え：○


## Q6

次の文章が正しければ○を，誤っていれば×を選びなさい。

「データベースでは，パーサと呼ばれる処理の要求を，クエリ呼ばれる解析機構が解析する」

- ○
- ×

### ヒント1

データベースでは，データを操作するための処理の要求を文字列で表す。

### ヒント2

要求を表す文字列ははエリと呼ばれ，パーサと呼ばれる解析機構がクエリを解析し，詳細な要求の内容を解析する。

### ヒント3

答え：×


## Q7

次の文章が正しければ○を，誤っていれば×を選びなさい。

「オプティマイザは，解析されたクエリを最も効率よく実行できように最適化を行う機能である」

- ○
- ×

### ヒント1

データベースでは，解析したクエリを最適化し，データベースへ実際に命令を行うコードを生成する。

### ヒント2

最適化機構は，オプティマイザと呼ばれる。

### ヒント3

答え：○


## Q8

次の文章が正しければ○を，誤っていれば×を選びなさい。

「データベースには，解析されたクエリを最も効率よく実行できように最適化を行うオプティマイザと呼ばれる機能がある」

- ○
- ×

### ヒント1

データベースでは，解析したクエリを最適化し，データベースへ実際に命令を行うコードを生成する。

### ヒント2

最適化機構は，オプティマイザと呼ばれる。

### ヒント3

答え：○

## Q9

次の文章が正しければ○を，誤っていれば×を選びなさい。

「スキーマは，データベース内部のデータや構造，記録方法といった構造の定義のことである。」

- ○
- ×

### ヒント1

データベースでは，ユーザが検索したデータ構造，内部にデータを格納するための構造，実際にデータを記録するめの構造を定義する。

### ヒント2

この定義のことを，スキーマと呼ぶ。

### ヒント3

答え：○

## Q10

次の文章が正しければ○を，誤っていれば×を選びなさい。

「データベースでは，データ操作の競合や割り込みを防ぐデッドロックと呼ばれる機能がある」

- ○
- ×

### ヒント1

データベースには，ある処理が行うデータ操作との競合や割り込みを防ぐために，他の処理からの操作を制限や禁止することができる排他制御機能がある。

### ヒント2

この機能のことをロック機能という。

複数の処理が，お互いのデータ操作に必要なデータを互い違いにロックしてしまい，双方の操作が実行できなくなってしまうことを，デッドロックという。

### ヒント3

答え：×
