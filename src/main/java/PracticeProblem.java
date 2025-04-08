public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] bubbleSort(double[] nums){
		int swapCount = 0;
		int compareCount = 0;
		boolean swapped = true;

		for(int i = 0; i < nums.length -1 && swapped; i++){
			swapped =false;
			for(int j = 0; i < nums.length - 1 - j; j++){
				compareCount++;
				if (nums[j] > nums[j+1]){
					double temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;

					swapped = true;
					swapCount +=3;

				}
			}
		}
		int[] arr = {swapCount, compareCount};

		return arr;
	
	}

	public static int[] selectionSort(double[] nums){
		int swapCount = 0;
		int compareCount = 0;

		for(int i = 0; i < nums.length -1; i++){
			int smallestIndex = i;
			for(int j = i + 1; j < nums.length; j++){
				compareCount++;
				if (nums[j] < nums[smallestIndex]){
					smallestIndex = j;
					swapCount++;
				}
			}
			double temp = nums[smallestIndex];
			nums[smallestIndex] = nums[i];
			nums[i] = temp;

			swapCount += 3;
		}
		int[] arr = {swapCount, compareCount};

		return arr;

	}

	public static int[] insertionSort(double[] nums){
		int swapCount = 0;
		int compareCount = 0;

		for(int i = 1; i < nums.length; i++){
			double key = nums[i];
			int index = i -1;
			swapCount ++;
			while (index >= 0 && nums[index] > key){
				nums[index +1] = nums[index];
				index --;

				compareCount++;
				swapCount++;

			}
			nums[index +1] =key;
			swapCount++;
		}
		int[] arr = {swapCount, compareCount};

		return arr;
		
	}
		
		public static String leastSwaps(double[] nums){
			double[] bubbleArr = new double [nums.length];
			double[] selectionArr = new double [nums.length];
			double[] insertionArr = new double [nums.length];

			for(int i = 0; i < nums.length; i++){
				bubbleArr[i] = nums[i];
				selectionArr[i] = nums[i];
				insertionArr[i] = nums[i];
			}
			int[] bubbleResult = bubbleSort(bubbleArr);
			int[] selectionResult = selectionSort(selectionArr);
			int[] insertionResult = insertionSort(insertionArr);

			if (bubbleResult[0] <= selectionResult[0] && bubbleResult[0] <= insertionResult[0]){
				return "Bubble";
			}else if (selectionResult[0] >= insertionResult[0]){
				return "Insertion";
			}else{
				return "Selection";
			}
		}

		public static String leastIterations(double[] nums){
			double[] bubbleArr = new double [nums.length];
			double[] selectionArr = new double [nums.length];
			double[] insertionArr = new double [nums.length];

			for(int i = 0; i < nums.length; i++){
				bubbleArr[i] = nums[i];
				selectionArr[i] = nums[i];
				insertionArr[i] = nums[i];
			}
			int[] bubbleResult = bubbleSort(bubbleArr);
			int[] selectionResult = selectionSort(selectionArr);
			int[] insertionResult = insertionSort(insertionArr);

			if (bubbleResult[1] <= selectionResult[1] && bubbleResult[1] <= insertionResult[1]){
				return "Bubble";
			}else if (selectionResult[1] >= insertionResult[1]){
				return "Insertion";
			}else{
				return "Selection";
			}
		
	}
}


