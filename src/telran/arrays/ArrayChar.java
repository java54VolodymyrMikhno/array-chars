package telran.arrays;

public class ArrayChar {
	private char[] array;

	public ArrayChar(char[] array) {
//		this.array = array;
		this.array = new char[array.length];
		for(int i=0; i<this.array.length; i++) {
			this.array[i] = array[i];
		}
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

	public int compareToIgnoreCase(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < length &&
				Character.toLowerCase(array[index]) ==
				Character.toLowerCase(another.array[index])) {
			index++;
		}
		return index == length ? array.length - another.array.length
				: Character.toLowerCase(array[index]) - Character.toLowerCase(another.array[index]);

	}

	public int count(char character) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				counter++;
			}
		}
		return counter;
	}

	public boolean contains(char character) {
		return  indexOf(character) > -1 ;
	}

	public boolean equals(ArrayChar another) {
		return another != null && compareTo(another) == 0 ;
	}

	public boolean equalsIgnoreCase(ArrayChar another) {
		return another != null && compareToIgnoreCase(another) == 0 ;
	}
	
	
}
