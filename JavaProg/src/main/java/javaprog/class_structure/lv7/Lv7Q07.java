package javaprog.class_structure.lv7;

/**
 * 参照渡し2　失敗例
 * プログラムと実行結果を問う
 */
class Lv7Q07 {

	static class Main {
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

	static class Feeder {

		void feed(Robot[] robots) {
			for (int i = 0; i < robots.length; i++) {
				Robot robot = robots[i];
				if (robot.energy < 4) {
					robot = new Robot(robot.number, 5);
				}
			}
		}
	}

	static class Robot {
		int number;
		int energy;

		Robot(int number, int energy) {
			this.number = number;
			this.energy = energy;
		}

		void print() {
			System.out.println(number + "号ロボットの燃料は、" + energy);
		}
	}

}
