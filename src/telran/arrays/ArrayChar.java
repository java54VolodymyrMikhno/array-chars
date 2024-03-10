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
		char[] thisLowerCaseArray = new String(array).toLowerCase().toCharArray();
		char[] anotherLowerCaseArray = new String(another.array).toLowerCase().toCharArray();

		while (index < length && thisLowerCaseArray[index] == anotherLowerCaseArray[index]) {
			index++;
		}
		return index == length ? thisLowerCaseArray.length - anotherLowerCaseArray.length
				: thisLowerCaseArray[index] - anotherLowerCaseArray[index];
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
 		for (int i = 0; i < array.length; i++) {
 			if (array[i] == character) {
 				return true;
 			}
 		}
 		return false;
     }
    
     public boolean equals(ArrayChar another) {
    	 
    	 int length = Math.min(this.array.length, another.array.length);
    	    
    	    for (int index = 0; index < length; index++) {
    	        if (this.array[index] != another.array[index]) {
    	            return false;
    	        }
    	    }

    	    return true;
     }
     
     public boolean equalsIgnoreCase (ArrayChar another) {
    	 
    	 int length = Math.min(this.array.length, another.array.length);
    	 char[] thisLowerCaseArray = new String(array).toLowerCase().toCharArray();
 		char[] anotherLowerCaseArray = new String(another.array).toLowerCase().toCharArray();
    	 
 	    
 	    for (int index = 0; index < length; index++) {
 	        if (thisLowerCaseArray[index] != anotherLowerCaseArray[index]) {
 	            return false;
 	        }
 	    }

 	    return true;
     }
}
