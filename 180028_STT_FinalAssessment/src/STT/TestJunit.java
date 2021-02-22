package STT;

public class TestJunit {

	public static int findMax(){
		int[] arr= new int[]{-10,20,30};
		int max=arr[0];
		for (int i=1;i<arr.length;i++){
		if (max<arr[i])
			max=arr[i];
		}
		return max;
		}
		}

