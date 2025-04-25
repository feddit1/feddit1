package chapter12.hashcode;

public class Key {

	public int number;
	public int name;
	public int addr;

	public Key(int number) {
		this.number = number;

	}

	@Override
	public int hashCode() {
		// return super.hashCode(); // 실제 heap메모리 16진수 주소
		return number;
	}

	// 논리적 주소(데이터)
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Key) {
			Key comparekKey = (Key) obj;
			if (this.number == comparekKey.number) {
				return true;
			}
		} else {
			return false;
		}

		return super.equals(obj);
	}

}
