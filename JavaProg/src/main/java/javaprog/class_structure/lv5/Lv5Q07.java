package javaprog.class_structure.lv5;

class Lv5Q07 {

	static class TestResult {

		String name;
		int point;

		String decide(int reference) {
			if (reference < 0) {
				return "不明";
			}
			if (point > reference) {
				return "合格";
			}
			return "不合格";
		}

	}
}
