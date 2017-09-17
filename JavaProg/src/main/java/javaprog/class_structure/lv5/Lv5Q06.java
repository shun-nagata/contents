package javaprog.class_structure.lv5;

class Lv5Q06 {

	static class TestResult {

		String name;
		int point;
		boolean attendance;

		String decide() {
			if (!attendance) {
				return "E";
			}
			if (point > 90) {
				return "S";
			}
			if (point > 80) {
				return "A";
			}
			if (point > 70) {
				return "B";
			}
			if (point > 60) {
				return "C";
			}
			return "D";
		}

	}
}
