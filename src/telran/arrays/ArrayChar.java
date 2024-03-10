package telran.arrays;

public class ArrayChar {
	private char[] array;

	public ArrayChar(char[] array) {
		this.array = array;
	}

	public int compareTo(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < length && this.array[index] == another.array[index]) {
			index++;
		}
		return index == length ? this.array.length - another.array.length : this.array[index] - another.array[index];
	}

	public int indexOf(char character) {
		int index = 0;
		while (index < array.length && array[index] != character) {
			index++;
		}
		return index == array.length ? -1 : index;
	}

	public int lastIndexOf(char character) {
		int index = array.length - 1;
		while (index > -1 && array[index] != character) {
			index--;
		}
		return index;// index == -1 ? -1 : index
	}

	public int compareToIgnporeCase(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < length && Character.toLowerCase(array[index]) == Character.toLowerCase(another.array[index])) {
			index++;
		}
		return index == length ? array.length - another.array.length : array[index] - another.array[index];

	}

	public int count(char character) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
			}
		}
		return count;
	}

	public boolean contains(char character) {
		return indexOf(character) == -1 ? false : true;
	}

	public boolean equals(ArrayChar another) {
		return compareTo(another) == 0 ? true : false;
	}

	public boolean equalsIgnoreCase(ArrayChar another) {
		return compareToIgnporeCase(another) == 0 ? true : false;
	}
}
